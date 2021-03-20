package io.pragra.springlearning.spring2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Address {
    @Value("#{new java.util.Random().nextInt(282882838)}")
    private int id;
    private AddressType type;
    private String postCode;
    private String city;
}
