package nl.marcenschede.tests.dependencyinjectiondemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionDemoApplication.class, args);
    }

}
