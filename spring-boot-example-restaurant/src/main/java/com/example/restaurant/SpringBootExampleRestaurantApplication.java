package com.example.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootExampleRestaurantApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SpringBootExampleRestaurantApplication.class);
        springApplicationBuilder.properties("spring.config.location=" + "classpath:/application.yml" + ", classpath:/naver.yml");
        SpringApplication springApplication = springApplicationBuilder.build();
        springApplication.run(args);
    }

}
