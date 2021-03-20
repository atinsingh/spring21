package io.pragra.springlearning.spring2.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class Guest {

    @Value("#{ '${maxtrue}' ? '${maxid}': '${minId}'}")
    private int id;
    @NonNull
    @Value("#{ '${guest.first-name}'.substring(3) }")
    private String firstName;

    @Value("#{ \"Atin\" + \" Singh\" }")
    private String lastName;

    @Value("#{T(io.pragra.springlearning.spring2.domain.Phone).getPhone()}")
    private String phoneNumber;

    @Autowired
    private Address address;
}

