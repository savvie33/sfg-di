package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    //tells spring that we want this injected into the bean
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
