package com.colak.springannotationslazytutorial.usinginterfaces.impl;

import com.colak.springannotationslazytutorial.usinginterfaces.ServiceA;
import com.colak.springannotationslazytutorial.usinginterfaces.ServiceB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceAImpl implements ServiceA {

    private ServiceB serviceB;

    @Autowired
    public void setServiceB(@Lazy ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Override
    public void methodInA() {
        log.info("Inside Method A");
    }
}
