package com.colak.springannotationslazytutorial.nointerfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceC {

    private ServiceD serviceD;

    @Autowired
    public void setServiceD(@Lazy ServiceD serviceD) {
        this.serviceD = serviceD;
    }

    public void methodInC() {
        log.info("Inside Method C");
    }
}
