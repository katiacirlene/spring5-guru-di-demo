package com.mytests.spring5gurudidemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service.";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saluto Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Begrüßungsdienst";
    }
}
