package com.jdvpl.reddission.tests;

import org.junit.jupiter.api.Test;
import org.redisson.api.RBucketReactive;
import org.redisson.client.codec.StringCodec;

import com.jdvpl.reddission.base.BaseTest;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class KeyValueTest extends BaseTest {

    @Test
    public void keyValueAccessTest() {
        RBucketReactive<String> bucket = this.redissonReactiveClient.getBucket("user:1:name", StringCodec.INSTANCE);
        Mono<Void> set = bucket.set("jiren");
        Mono<Void> get = bucket.get().doOnNext(System.out::println).then();
        StepVerifier.create(set.concatWith(get)).verifyComplete();
    }
}
