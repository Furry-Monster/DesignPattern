package org.DesignPattern.Behavior.TemplateMethod.Methods;

import org.DesignPattern.Behavior.TemplateMethod.AbstractSetting;

import java.util.*;

public class LocalSetting extends AbstractSetting {
    private Map<String, String> cache = new HashMap<>();

    protected String lookupCache(String key) {
        return cache.get(key);
    }

    protected void putIntoCache(String key, String value) {
        cache.put(key, value);
    }
}