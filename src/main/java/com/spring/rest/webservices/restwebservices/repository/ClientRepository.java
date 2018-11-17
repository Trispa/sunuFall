package com.spring.rest.webservices.restwebservices.repository;

import com.spring.rest.webservices.restwebservices.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
