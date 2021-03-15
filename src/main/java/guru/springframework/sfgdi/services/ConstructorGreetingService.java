package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Sue Manuel on 10/03/2021.
 */
@Service
//tells spring this is a spring managed component and to bring it into the spring context
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
