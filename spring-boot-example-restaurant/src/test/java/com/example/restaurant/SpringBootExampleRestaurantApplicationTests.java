package com.example.restaurant;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.config.location=" + "classpath:/application.yml" + ", classpath:/naver.yml")
class SpringBootExampleRestaurantApplicationTests {

    @Test
    void contextLoads() {
    }

}
