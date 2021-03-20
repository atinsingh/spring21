package io.pragra.springlearning.spring2.service;

import io.pragra.springlearning.spring2.domain.Guest;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GuestBookService {
    private List<Guest> guests = new ArrayList<>();

    public boolean addGuest(Guest guest) {
        log.info("Adding Guest : {} to guest book", guest);
        return guests.add(guest);
    }
    public boolean deleteGuest(Integer id) {
        log.info("Removing  Guest with ID  : {} to guest book", id);
        return guests.removeIf(guest -> guest.getId()==id);
    }
}
