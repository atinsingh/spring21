package io.pragra.springlearning.spring2.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Guest {
    private int id;
    @NonNull
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
}

