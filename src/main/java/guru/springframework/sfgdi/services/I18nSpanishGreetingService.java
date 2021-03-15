package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Sue Manuel on 12/03/2021.
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
