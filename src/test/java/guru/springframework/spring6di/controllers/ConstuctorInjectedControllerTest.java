package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController constuctorInjectedController;

    @BeforeEach
    void setUp() {
        constuctorInjectedController = new ConstuctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testSayHello() {
        System.out.println(constuctorInjectedController.sayHello());
    }

}