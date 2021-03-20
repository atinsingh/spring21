package io.pragra.springlearning.spring2.domain;

import lombok.Data;

@Data
public class Address {
    private String id;
    private AddressType type;
    private String postCode;
    private String city;
}
