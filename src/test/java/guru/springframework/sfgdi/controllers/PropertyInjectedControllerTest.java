package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();  //mimicking what the spring framework would be doing
        controller.greetingService = new ConstructorGreetingService(); //using the property greetingService from the class

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());


    }

}