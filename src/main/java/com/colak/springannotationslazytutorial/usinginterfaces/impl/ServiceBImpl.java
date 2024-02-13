package com.colak.springannotationslazytutorial.usinginterfaces.impl;

import com.colak.springannotationslazytutorial.usinginterfaces.ServiceA;
import com.colak.springannotationslazytutorial.usinginterfaces.ServiceB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceBImpl implements ServiceB {

    private ServiceA serviceA;

    @Autowired
    public void setServiceA(@Lazy ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void methodInB() {
        log.info("Inside Method B");
    }
}
