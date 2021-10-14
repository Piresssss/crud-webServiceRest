package com.rpires.crudwsrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpires.crudwsrest.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	/* Camada de acesso a dados */
	
}
