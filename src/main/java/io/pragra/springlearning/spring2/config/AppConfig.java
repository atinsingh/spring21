package io.pragra.springlearning.spring2.config;

import io.pragra.springlearning.spring2.domain.Guest;
import io.pragra.springlearning.spring2.service.GuestBookService;
import org.springframework.context.annotation.Bean;

import java.util.Random;

public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GuestBookService guestBookService() {
        return new GuestBookService();
    }

    @Bean()
    public Guest guest() {
        Guest guest = new Guest();
        guest.setId(new Random().nextInt(100000));
        return guest;
    }
}
