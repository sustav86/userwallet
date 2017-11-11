package ua.sustavov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"ua.sustavov.model","ua.sustavov.controller","ua.sustavov.repository","ua.sustavov.repository.mock","ua.sustavov.service"})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
