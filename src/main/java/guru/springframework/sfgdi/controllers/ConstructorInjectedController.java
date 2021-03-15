package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService; //best practice to use private final


    //@Autowired for the constructor is optional here - from Spring 4 it's no longer required!
    //@Qualifier gives spring a hint so that Spring knows which bean to inject
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        //if we remove the @Qualifier here, then Spring will use the GreetingService marked as @Primary
        //if we remove @Primary as well in PrimaryGreetingService, then the application won't run - it will fail
        //with an error saying a single bean is required but 4 were found
        this.greetingService = greetingService;
        //providing the constructor with the private final instance variable means the object cannot be changed
        //once inside the object code.
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
