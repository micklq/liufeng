package com.ibumeng.vcs.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ibumeng.vcs.service.EhCacheTestService;

@Service
public class EhCacheTestServiceImpl implements EhCacheTestService {

    @Cacheable(value="ehCacheTest",key="#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return String.format("%s==>>%s", param,timestamp.toString());
    }

}