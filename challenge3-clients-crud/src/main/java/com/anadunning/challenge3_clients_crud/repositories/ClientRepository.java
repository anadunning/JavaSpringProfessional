package com.anadunning.challenge3_clients_crud.repositories;

import com.anadunning.challenge3_clients_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
