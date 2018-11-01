package com.zky.laboratory.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (C), 2002-2018,
 * FileName: redisServcie
 * Author:  18075555
 * Date: 2018/10/18 15:40.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value){
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value); result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入缓存,加有效时间
     * @param key
     * @param value
     * @param expireTime 过期时间单位秒
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime){
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据key获取redis
     * @param key
     * @return
     */
    public Object get(final String key) {
        Object result = null;
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        return result;
    }

    /**
     * 判断缓存中是否含有对应的key
     * @param key
     * @return boolean
     */
    public boolean exits(final String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除对应的value值
     * @param key
     */
    public void remove(final String key){
        if (exits(key)){
            redisTemplate.delete(key);
        }
    }

    /**
     * 批量删除对应的value值
     * @param keys
     */
    public void baechRemove(final String... keys){
        for (String key : keys){
            remove(key);
        }
    }

    /**
     * 批量删除key和value
     *
     * @param pattern
     */
    public void removePattern(final String pattern){
       Set<Serializable> keys = redisTemplate.keys(pattern);
       if (keys.size()>0){
           redisTemplate.delete(keys);
       }
    }

    /**
     * hash添加，哈希添加数据
     * @param key
     * @param hashKey
     * @param value
     */
    public void hashSet(String key, Object hashKey, Object value){

        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put(key,hashKey,value);
    }

    /**
     * hash添加，加入有效时间
     * @param key
     * @param hashKey
     * @param value
     * @param expireTime 有效时间（秒）
     */
    public void hashSet(String key, Object hashKey, Object value, Long expireTime){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put(key, hashKey, value);
        redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);

    }

    /**
     * 哈希获取数据
     * @param key
     * @param hashKey
     * @return
     */
    public Object hashGet(String key, Object hashKey){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        return hash.get(key, hashKey);
    }

    /**
     * 判断hash数据是否存在
     * @param key
     * @param hashKey
     * @return
     */
    public boolean hashExits(String key, Object hashKey){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        return hash.hasKey(key, hashKey);
    }
    //hash删除操作
    public void hashRemove(String key, Object hashKey){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.delete(key, hashKey);
    }

    /**
     * 列表添加
     * @param key
     * @param value
     */
    public void lPush(String key,Object value){
         ListOperations<String, Object> list = redisTemplate.opsForList();
         list.rightPush(key,value);
     }

    /**
     * 列表获取
     * @param key
     * @param start
     * @param end
     * @return
     */
    public List<Object> lRange(String key, long start, long end){
         ListOperations<String, Object> list = redisTemplate.opsForList();
         return list.range(key,start,end);
     }

    /**
     * 集合添加
     * @param key
     * @param value
     */
    public void add(String key,Object value){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        set.add(key,value);
    }

    /**
     * 集合获取
     * @param key
     * @return
     */
    public Set<Object> setMembers(String key){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        return set.members(key);
    }
    /**
     * 有序集合添加
     * @param key
     * @param value
     * @param scoure
     */
    public void zAdd(String key,Object value,double scoure){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        zset.add(key,value,scoure);
    }

    /**
     * 有序集合获取
     * @param key
     * @param scoure
     * @param scoure1
     * @return
     */
    public Set<Object> rangeByScore(String key,double scoure,double scoure1){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        return zset.rangeByScore(key, scoure, scoure1);
    }


}
