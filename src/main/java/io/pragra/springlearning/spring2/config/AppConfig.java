package io.pragra.springlearning.spring2.config;

import io.pragra.springlearning.spring2.domain.Guest;
import io.pragra.springlearning.spring2.service.GuestBookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("#{ '${guest.first-name}'.substring(3) }")
    private String firstName;

    private String lastName;
    @Value("#{ \"Atin\" + \" Singh\" }")
    private String phoneNumber;

    @Value("#{ '${maxtrue}' ? '${maxid}': '${minId}'}")
    private int id;



    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GuestBookService guestBookService() {
        return new GuestBookService();
    }

    @Bean()
    public Guest guest(   @Value("${guest.last-name: Sandhu }") String lastName) {
        Guest guest = new Guest();
        guest.setId(id);
        guest.setFirstName(firstName);
        guest.setLastName(lastName);
        guest.setPhoneNumber(phoneNumber);
        return guest;
    }
}
