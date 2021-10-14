package com.rpires.crudwsrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rpires.crudwsrest.dto.ClientDTO;
import com.rpires.crudwsrest.entities.Client;
import com.rpires.crudwsrest.repositories.ClientRepository;

/* Camada de Serviço */

/* injeção de dependências */
@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
	
}