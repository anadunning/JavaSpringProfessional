package com.anadunning.aula_salvar_para_um.aula.repositories;

import com.anadunning.aula_salvar_para_um.aula.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
