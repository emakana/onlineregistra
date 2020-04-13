package com.iq.OnlineRegistra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iq.OnlineRegistra.entity.Person;

public interface RegistraRepository extends JpaRepository<Person, Long>{



}
