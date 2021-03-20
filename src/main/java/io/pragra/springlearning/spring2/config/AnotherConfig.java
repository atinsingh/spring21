package io.pragra.springlearning.spring2.config;

import io.pragra.springlearning.spring2.domain.Address;
import org.springframework.context.annotation.Bean;

import java.util.Random;

public class AnotherConfig {

    @Bean
    public Address address(){
        Address address =  new Address();
        address.setId(new Random().nextInt(10000));
        return address;
    }
}
