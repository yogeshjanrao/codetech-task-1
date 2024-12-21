package com.example.Main.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void whenCallHelloWorldThenReturnHelloWorld(){
        String helloWorld = helloWorldService.sayHelloWorld();
        Assertions.assertThat(helloWorld)
                .isEqualTo("Hello World");
    }

}
