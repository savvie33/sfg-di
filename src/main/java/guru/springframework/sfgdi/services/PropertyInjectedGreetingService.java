package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
@Service
//tells spring this is a spring managed component and to bring it into the spring context
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
