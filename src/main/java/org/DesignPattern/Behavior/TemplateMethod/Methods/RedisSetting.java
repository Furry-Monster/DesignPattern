package org.DesignPattern.Behavior.TemplateMethod.Methods;

import org.DesignPattern.Behavior.TemplateMethod.AbstractSetting;

//public class RedisSetting extends AbstractSetting {
//    private RedisClient client = RedisClient.create("redis://localhost:6379");
//
//    protected String lookupCache(String key) {
//        try (StatefulRedisConnection<String, String> connection = client.connect()) {
//            RedisCommands<String, String> commands = connection.sync();
//            return commands.get(key);
//        }
//    }
//
//    protected void putIntoCache(String key, String value) {
//        try (StatefulRedisConnection<String, String> connection = client.connect()) {
//            RedisCommands<String, String> commands = connection.sync();
//            commands.set(key, value);
//        }
//    }
//}