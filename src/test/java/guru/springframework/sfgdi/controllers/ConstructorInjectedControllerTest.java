package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new ConstructorGreetingService()); //using the constructor (new)


    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }

}