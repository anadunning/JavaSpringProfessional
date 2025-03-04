package com.anadunning.challenge3_clients_crud.services;

import com.anadunning.challenge3_clients_crud.dto.ClientDTO;
import com.anadunning.challenge3_clients_crud.entities.Client;
import com.anadunning.challenge3_clients_crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

//    public ClientDTO findById(Long id) {
//        Optional<Client> result = repository.findById(id);
//        Client client = result.get();
//        ClientDTO dto = new ClientDTO(client);
//        return dto;
//    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

}
