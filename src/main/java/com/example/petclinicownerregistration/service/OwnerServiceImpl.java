package com.example.petclinicownerregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinicownerregistration.dao.OwnerRepository;
import com.example.petclinicownerregistration.model.Owner;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
    private OwnerRepository ownerRepository;
	@Override
	public Owner saveOwner(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepository.save(owner);
	}

	@Override
	public Optional<Owner> getOwnerById(Integer id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id);
	}

}
