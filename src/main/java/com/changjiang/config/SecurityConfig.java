package com.changjiang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override  
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
        //暂时使用基于内存的AuthenticationProvider  
        auth.inMemoryAuthentication().withUser("username").password("password").roles("USER");  
    }  
    @Override  
    public void configure(WebSecurity web) throws Exception {  
        web.ignoring().antMatchers("/static/**","/js/**","/images/**","/css/**",
        		"/views/**");
    }  
    @Override  
    protected void configure(HttpSecurity http) throws Exception {  
        //暂时禁用csrf,并自定义登录页和登出URL  
        http.csrf().disable()  
                .authorizeRequests().anyRequest().authenticated()  
                .and().formLogin().loginPage("/login").failureUrl("/login?error").usernameParameter("username").passwordParameter("password").permitAll()  
                .and().logout().logoutUrl("/logout").permitAll();  
    }  
}
