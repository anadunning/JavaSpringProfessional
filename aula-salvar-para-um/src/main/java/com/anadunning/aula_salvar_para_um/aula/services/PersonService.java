package com.anadunning.aula_salvar_para_um.aula.services;

import com.anadunning.aula_salvar_para_um.aula.dto.PersonDTO;
import com.anadunning.aula_salvar_para_um.aula.dto.PersonDepartmentDTO;
import com.anadunning.aula_salvar_para_um.aula.entities.Department;
import com.anadunning.aula_salvar_para_um.aula.entities.Person;
import com.anadunning.aula_salvar_para_um.aula.repositories.DepartmentRepository;
import com.anadunning.aula_salvar_para_um.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

//        Department dept = new Department();
//        dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);
        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

//        Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());

        Department dept = new Department();
        dept.setId(dto.getDepartmentId());

        entity.setDepartment(dept);
        entity = repository.save(entity);

        return new PersonDTO(entity);
    }
}
