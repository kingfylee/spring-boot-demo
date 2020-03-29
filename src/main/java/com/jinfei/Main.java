package com.jinfei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * SpringBootApplication 标注这个类是SpringBoot的主配置类
 */
@SpringBootApplication
@EnableCaching
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

}
