package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		//when Spring creates beans, the string name of the bean is going to be the class name beginning with a lower case
		//when this starts up, Spring scans for beans and creates them into the context (MyController is annotated with @Controller)
		MyController myController = (MyController) ctx.getBean("myController");

		//Note above:  we are not creating a new instance of MyController by using new MyController - the spring frameowrk
		//is doing that for us - underneath the covers, in the spring context spring effectively is saying create a new instance
		//of this class and put it in the spring context.   Line 17 above gives us a new instance of this bean from the context
		//we don't  have to create a new instance, the framework does it for us - it's dependency injection

		//method sayHello is run in the controller and the output sent to println
		System.out.println("-------- Primary Bean");
		System.out.println(myController.sayHello());

		//DI using Spring Framework

		//Class Property injection - we set GreetingService property in PropertyInjectedController as @Autowired
		System.out.println("-------- Property");
		//Remember here to set PropertyInjectedController with @Controller to be able to getBean
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		//Setter injection
		System.out.println("-------- Setter");
		//Remember to set SetterInjectedController with @Controller to be able to getBean
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		//Constructor injection
		System.out.println("-------- Constructor");
		//Remember to set ConstructorInjectedController with @Controller to be able to getBean
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
