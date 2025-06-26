package com.thoughtsbyashish.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.thoughtsbyashish.restservices")
public class UsermgmtWebappNew1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UsermgmtWebappNew1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(UsermgmtWebappNew1Application.class, args);
    }
}
