package com.example.petclinicownerregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinicownerregistration.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
