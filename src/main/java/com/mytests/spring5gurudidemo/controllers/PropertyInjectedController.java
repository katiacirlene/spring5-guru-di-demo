package com.mytests.spring5gurudidemo.controllers;

import com.mytests.spring5gurudidemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
