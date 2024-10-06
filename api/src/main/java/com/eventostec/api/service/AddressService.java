package com.eventostec.api.service;

import com.eventostec.api.domain.addresses.Address;
import com.eventostec.api.domain.events.Event;
import com.eventostec.api.domain.events.EventRequestDTO;
import com.eventostec.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return repository.save(address);
    }
}
