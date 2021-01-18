package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/*@ComponentScan(value = "org.zb")
@SpringBootConfiguration
@EnableAutoConfiguration*/
//=========
@SpringBootApplication//(scanBasePackages = "org.zb")
public class MyAppStart {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyAppStart.class, args);
    }
}
