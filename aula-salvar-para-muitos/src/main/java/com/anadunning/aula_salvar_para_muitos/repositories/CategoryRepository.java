package com.anadunning.aula_salvar_para_muitos.repositories;

import com.anadunning.aula_salvar_para_muitos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
