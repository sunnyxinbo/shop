package com.changjiang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
//开启用redis存储HttpSession
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 7200)
public class RedisSessionConfig {
	  //Redis配置信息
	  @Value("${redis.hostName}")
	  private String redisHostName;
	  @Value("${redis.password}")
	  private String redisPassword;
	  @Value("${redis.port}")
	  private Integer redisPort;
	  @Value("${redis.timeout}")
	  private Integer redisTimeout;
	  @Value("${redis.maxTotal}")
	  private Integer maxTotal;
	  @Value("${redis.minIdle}")
	  private Integer minIdle;
	  @Value("${redis.maxIdle}")
	  private Integer maxIdle;
	  @Value("${redis.maxWaitMillis}")
	  private Integer maxWaitMillis;
	  @Bean
	  //jedisPool配置对象
	  public JedisPoolConfig getJedisPoolConfig(){
		  JedisPoolConfig config=new JedisPoolConfig();
		  config.setMaxTotal(maxTotal);
		  config.setMaxIdle(maxIdle);
		  config.setMinIdle(minIdle);
		  config.setMaxWaitMillis(maxWaitMillis);
		  config.setTestOnBorrow(true);
		  config.setTestOnReturn(false);
		  config.setTestWhileIdle(false);
		  return config;
	  }
	  //Redis连接工厂
	  @Bean
	  public JedisConnectionFactory redisCF(JedisPoolConfig poolConfig){
		  JedisConnectionFactory cf=new JedisConnectionFactory();
		  cf.setHostName(redisHostName);
		  cf.setPort(redisPort);
		  cf.setTimeout(redisTimeout);
		  cf.setUsePool(true);
		  cf.setPoolConfig(poolConfig);
		  return cf;
	  }
	  //redisTemplate
	  @Bean
	  public RedisTemplate<String,Object> getRedisTeplate(RedisConnectionFactory cf){
		  RedisTemplate<String, Object> redis=new RedisTemplate<String, Object>();
		  redis.setConnectionFactory(cf);
		  return redis;
	  }
	  @Bean
	  public RedisHttpSessionConfiguration getRedisSessionConfig(){
		  RedisHttpSessionConfiguration config=new RedisHttpSessionConfiguration();
		  config.setMaxInactiveIntervalInSeconds(1800);
		  return config;
	  }
}
