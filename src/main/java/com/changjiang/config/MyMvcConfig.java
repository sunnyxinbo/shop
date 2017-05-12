package com.changjiang.config;

import java.io.IOException;
import java.sql.SQLException;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy//开启切面自动代理
@EnableTransactionManagement//开启注解方式事务管理
@ComponentScan(basePackageClasses={MyMvcConfig.class})
public class MyMvcConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware{
	  private ApplicationContext applicationContext;
	  @Autowired
	  private Environment env;
	  public void setApplicationContext(ApplicationContext applicationContext) {
	    this.applicationContext = applicationContext;
	  }
	  //JDBC事物管理
	  @Bean
	  public DataSourceTransactionManager transactionManager(DruidDataSource dataSource){
		  DataSourceTransactionManager manager=new DataSourceTransactionManager(dataSource);
		  return manager;
	  }
	  //Druid数据库连接池
	  @Bean(initMethod="init",destroyMethod="close")
	  public DruidDataSource dataSource() throws SQLException{
		  DruidDataSource data=new DruidDataSource();
		  //配置数据源
		  data.setDriverClassName(env.getProperty("jdbc.driver"));
	      data.setUrl(env.getProperty("jdbc.url"));
	       data.setUsername(env.getProperty("jdbc.user"));
	       data.setPassword(env.getProperty("jdbc.password"));
	       //配置连接池属性
		  data.setInitialSize(5);//初始化大小
		  data.setMinIdle(1);//最小连接数
		  data.setMaxActive(20);//最大连接数
		  data.setMaxWait(6000);//配置获取连接等待超时的时间
		  data.setTimeBetweenEvictionRunsMillis(6000);//配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
		  data.setMinEvictableIdleTimeMillis(300000);//配置一个连接在池中最小生存的时间，单位是毫秒
		  //打开PSCache，并且指定每个连接上PSCache的大小
		  data.setPoolPreparedStatements(true);
		  data.setMaxPoolPreparedStatementPerConnectionSize(20);
		  data.setFilters("start");
		  return data;
	  }
	  //获取Mybatis的SqlSessionFactory
	  @Bean
	  public SqlSessionFactoryBean sqlSessionFactory(DruidDataSource dataSource) throws IOException{
		  SqlSessionFactoryBean b=new SqlSessionFactoryBean();
		  b.setDataSource(dataSource);
		// 设置 mapper xml
	    b.setMapperLocations(applicationContext.getResources("classpath:com/changjiang/mapper/**/*.xml"));
		  return b;
	  }
	  /**
	   * 以下三个Bean配置视图解析器
	   * @return
	   */
	  @Bean
	  public ViewResolver viewResolver() {
	    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	    resolver.setTemplateEngine(templateEngine());
	    resolver.setCharacterEncoding("UTF-8");
	    return resolver;
	  }
	  @Bean
	  public TemplateEngine templateEngine() {
	    SpringTemplateEngine engine = new SpringTemplateEngine();
	    engine.setEnableSpringELCompiler(true);
	    engine.setTemplateResolver(templateResolver());
	    return engine;
	  }
	@Bean
	public ITemplateResolver templateResolver(){
		SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
		resolver.setApplicationContext(applicationContext);
		resolver.setPrefix("/WEB-INF/classes/views/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode(TemplateMode.HTML);
		resolver.setCharacterEncoding("UTF-8");
		return resolver;
	}
	@Bean
	public MultipartResolver multipartResolver(){
		CommonsMultipartResolver m=new CommonsMultipartResolver();
		return m;
	}
	//需要特别注意的是：/css/**的意思是这个文件夹下的文件为静态资源，它下面的文件夹不是静态资源，所以要单独的进行设置
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("css/**").addResourceLocations("classpath:/css/");
		registry.addResourceHandler("js/**").addResourceLocations("classpath:/js/");
		registry.addResourceHandler("img/**").addResourceLocations("classpath:/img/");
		registry.addResourceHandler("lib/**").addResourceLocations("classpath:/lib/");
		registry.addResourceHandler("static/**").addResourceLocations("classpath:/static/");
	}
	/**
	 * 对于/index访问参数视图解析器返回逻辑名称为index的视图用于显示
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/index").setViewName("/login");
		registry.addViewController("/toUpload").setViewName("/upload");
		registry.addViewController("/sse").setViewName("/sse");
		registry.addViewController("/async").setViewName("/async");
	}
}