package com.zeaho.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * Created by XHT on 2017/2/3.
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 100, redisNamespace = "zeaho")
public class HttpSessionConfig {
    @Bean
    public HttpSessionStrategy httpSessionStrategy() {
        return new CookieHttpSessionStrategy();
    }
}
