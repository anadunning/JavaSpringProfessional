package com.anadunning.aula_salvar_para_um.aula.repositories;

import com.anadunning.aula_salvar_para_um.aula.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
