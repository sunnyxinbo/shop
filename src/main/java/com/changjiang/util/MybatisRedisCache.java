package com.changjiang.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;  
  
  
public class MybatisRedisCache implements Cache {
	@Value("${redis.hostName}")
    private String hostName;
    private static Logger logger = LoggerFactory.getLogger(MybatisRedisCache.class);  
    private Jedis redisClient=createReids();  
     /** The ReadWriteLock. */    
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();   
      
    private String id;  
      
    public MybatisRedisCache(final String id) {    
        if (id == null) {  
            throw new IllegalArgumentException("Cache instances require an ID");  
        }  
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>MybatisRedisCache:id="+id);  
        this.id = id;  
    }    
    @Override  
    public String getId() {  
        return this.id;  
    }  
  
    @Override  
    public int getSize() {  
     
        return Integer.valueOf(redisClient.dbSize().toString());  
    }  
  
    @Override  
    public void putObject(Object key, Object value) {  
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>putObject:"+key+"="+value);  
        redisClient.set(SerializeUtil.serialize(key.toString()), SerializeUtil.serialize(value));  
    }  
  
    @Override  
    public Object getObject(Object key) {  
        Object value = SerializeUtil.unserialize(redisClient.get(SerializeUtil.serialize(key.toString())));  
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>getObject:"+key+"="+value);  
        return value;  
    }  
  
    @Override  
    public Object removeObject(Object key) {  
        return redisClient.expire(SerializeUtil.serialize(key.toString()),0);  
    }  
  
    @Override  
    public void clear() {  
          redisClient.flushDB();  
    }  
    @Override  
    public ReadWriteLock getReadWriteLock() {  
        return readWriteLock;  
    }  
    protected  static Jedis createReids(){
        JedisPool pool = new JedisPool(new JedisPoolConfig(),"192.168.1.112");  
        return pool.getResource();  
    }  
}
class SerializeUtil {  
    public static byte[] serialize(Object object) {  
        ObjectOutputStream oos = null;  
        ByteArrayOutputStream baos = null;  
        try {  
        //序列化  
        baos = new ByteArrayOutputStream();  
        oos = new ObjectOutputStream(baos);  
        oos.writeObject(object);  
        byte[] bytes = baos.toByteArray();  
        return bytes;  
        } catch (Exception e) {  
         e.printStackTrace();  
        }  
        return null;  
        }  
           
        public static Object unserialize(byte[] bytes) {  
        ByteArrayInputStream bais = null;  
        try {  
        //反序列化  
        bais = new ByteArrayInputStream(bytes);  
        ObjectInputStream ois = new ObjectInputStream(bais);  
        return ois.readObject();  
        } catch (Exception e) {  
           
        }  
        return null;  
    }
}