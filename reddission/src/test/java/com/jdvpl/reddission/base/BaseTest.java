package com.jdvpl.reddission.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.redisson.api.RedissonReactiveClient;

import com.jdvpl.reddission.config.RedissonConfig;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {
    private final RedissonConfig redissonConfig = new RedissonConfig();
    protected RedissonReactiveClient redissonReactiveClient;

    @BeforeAll
    public void setClient() {
        this.redissonReactiveClient = this.redissonConfig.getReactiveClient();
    }

    @SuppressWarnings("deprecation")
    @AfterAll
    public void closeClient() {
        this.redissonReactiveClient.shutdown();
    }

}
