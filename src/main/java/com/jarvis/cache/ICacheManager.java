package com.jarvis.cache;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import com.jarvis.cache.exception.CacheCenterConnectionException;
import com.jarvis.cache.to.CacheKeyTO;
import com.jarvis.cache.to.CacheWrapper;

/**
 * 缓存管理
 * 
 * @author jiayu.qiu
 */
public interface ICacheManager {

    /**
     * 往缓存写数据
     * 
     * @param cacheKey 缓存Key
     * @param result 缓存数据
     * @param method Method
     * @throws CacheCenterConnectionException 缓存异常
     */
    void setCache(final CacheKeyTO cacheKey, final CacheWrapper<Object> result, final Method method) throws CacheCenterConnectionException;

    /**
     * 往缓存写数据
     *
     * @param params 缓存Key 和 缓存数据
     * @param method Method
     * @throws CacheCenterConnectionException 缓存异常
     */
    //void mset(final MSetParam[] params, final Method method) throws CacheCenterConnectionException;

    /**
     * 根据缓存Key获得缓存中的数据
     * 
     * @param key 缓存key
     * @param method Method
     * @return 缓存数据
     * @throws CacheCenterConnectionException 缓存异常
     */
    CacheWrapper<Object> get(final CacheKeyTO key, final Method method) throws CacheCenterConnectionException;

    /**
     * 根据缓存Key获得缓存中的数据
     *
     * @param keys 缓存keys
     * @param method Method
     * @return 缓存数据
     * @throws CacheCenterConnectionException 缓存异常
     */
    //List<CacheWrapper<Object>> mget(final CacheKeyTO[] keys, final Method method) throws CacheCenterConnectionException;

    /**
     * 删除缓存
     * 
     * @param keys 缓存keys
     * @throws CacheCenterConnectionException 缓存异常
     */
    void delete(final Set<CacheKeyTO> keys) throws CacheCenterConnectionException;

}
