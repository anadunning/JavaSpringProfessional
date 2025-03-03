package com.anadunning.challenge3_clients_crud.controllers;

import com.anadunning.challenge3_clients_crud.dto.ClientDTO;
import com.anadunning.challenge3_clients_crud.entities.Client;
import com.anadunning.challenge3_clients_crud.repositories.ClientRepository;
import com.anadunning.challenge3_clients_crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
