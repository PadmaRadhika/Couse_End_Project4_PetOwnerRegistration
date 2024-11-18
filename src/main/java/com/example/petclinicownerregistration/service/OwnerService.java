package com.example.petclinicownerregistration.service;

import java.util.Optional;

import com.example.petclinicownerregistration.model.Owner;

public interface OwnerService {
	Owner saveOwner(Owner owner);
    Optional<Owner> getOwnerById(Integer id);
}
