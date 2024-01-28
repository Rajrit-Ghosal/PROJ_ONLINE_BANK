package com.wecp.progressive;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BankSafeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankSafeApplication.class, args);
        System.out.println("Welcome to Banksafe Online!");


    }

    @GetMapping("/banksafe")
    public String msg(){
        return "Welcome to Banksafe Online!";
    }
}
