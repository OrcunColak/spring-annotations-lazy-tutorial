package com.colak.springannotationslazytutorial.nointerfaces;

import com.colak.springannotationslazytutorial.usinginterfaces.ServiceA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceD {

    private ServiceC serviceC;

    @Autowired
    public void setServiceC(@Lazy ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public void methodInD() {
        log.info("Inside Method D");
    }
}
