package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class ConstuctorInjectedController {

    private final GreetingService greetingService;

    public ConstuctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
