package com.stackroute.Muzix.controller;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SpringContextListener implements ApplicationListener<ContextRefreshedEvent> {
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Started with Applicationlistner");
    };
}
