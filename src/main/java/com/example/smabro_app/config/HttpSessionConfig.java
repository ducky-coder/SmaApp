package com.example.smabro_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class HttpSessionConfig {

    @Bean
    public RedisSerializer<Object> springSessionDefaultRedisSerializer() {

        return new GenericJackson2JsonRedisSerializer();
    }
}
