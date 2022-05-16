package com.atlant.ledger;

import com.atlant.ledger.business.model.Account;
import com.atlant.ledger.business.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

@SpringBootApplication
public class AtlantApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtlantApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner preloadData(AccountService accountService) {
//        return args -> {
//        };
//    }

}
