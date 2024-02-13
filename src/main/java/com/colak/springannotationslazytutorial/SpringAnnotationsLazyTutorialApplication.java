package com.colak.springannotationslazytutorial;

import com.colak.springannotationslazytutorial.nointerfaces.ServiceC;
import com.colak.springannotationslazytutorial.nointerfaces.ServiceD;
import com.colak.springannotationslazytutorial.usinginterfaces.ServiceA;
import com.colak.springannotationslazytutorial.usinginterfaces.ServiceB;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringAnnotationsLazyTutorialApplication implements CommandLineRunner {

    private final ServiceA serviceA;
    private final ServiceB serviceB;

    private final ServiceC serviceC;
    private final ServiceD serviceD;

    public static void main(String[] args) {
        SpringApplication.run(SpringAnnotationsLazyTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        serviceA.methodInA();
        serviceB.methodInB();

        serviceC.methodInC();
        serviceD.methodInD();
    }
}
