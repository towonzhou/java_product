package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouhuan on 2017/03/31.
 */
@RestController
@SpringBootApplication
public class Example {
    private final Test test;

    @Autowired
    public Example(Test test) {
        this.test = test;
    }

    @RequestMapping("/")
    String home() {
        test.setName("1111");
        return test.getName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
