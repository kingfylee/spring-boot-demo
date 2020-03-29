package com.jinfei;

import com.jinfei.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * redis字符串类型插入
     */
    @Test
    public void testRedisWrite() {
        stringRedisTemplate.opsForValue().append("test", "hello");

        stringRedisTemplate.opsForList().leftPush("testList", "1");
        stringRedisTemplate.opsForList().leftPush("testList", "2");
    }

    /**
     * redis读取指定值
     */
    @Test
    public void testRedisRead() {
        String test = stringRedisTemplate.opsForValue().get("test");
        System.out.println(test);
    }

    /**
     * redis插入对象
     */
    @Test
    public void testRedisWriteObj() {
        redisTemplate.opsForValue().set("zhangsan", new Person(18, "zhangsan"));
    }

}
