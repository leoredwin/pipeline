package com.qianye.zhaimi.pipeline.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglong on 16/1/15.
 */
public class PipeLineContext {

    private Map<String, Object> context = new HashMap<>();

    public void put(String key, Object param) {
        context.put(key, param);
    }

    public Object get(String key) {
        return context.get(key);
    }
}
