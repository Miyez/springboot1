package com.emiyez.springboot01.config;/*
 *@title RedisConfig
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 17:20
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Slf4j
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    // Redis 配置类
    // 自定义的RedisTemplate的Bean名称必须为 redisTemplate。当方法名不为 redisTemplate时，可通过name显示指定bean名称，@Bean(name="redisTemplate")
    @Bean(name = "abc")
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        // 设置String Key序列化
        template.setKeySerializer( getKeySerializer() );
        template.setValueSerializer( getValueSerializer() );
        // 设置Hash Key序列化
        template.setHashKeySerializer( getKeySerializer() );
        template.setHashValueSerializer( getValueSerializer() );
        log.info("自定义RedisTemplate配置完成 ... ");
        return template;
    }

    // key 采用String序列化
    private RedisSerializer<String> getKeySerializer() {
        return new StringRedisSerializer();
    }

    // value 采用Json序列化
    private RedisSerializer<Object> getValueSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }
}
