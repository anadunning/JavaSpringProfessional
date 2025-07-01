package com.anadunning.aula_salvar_para_muitos.repositories;

import com.anadunning.aula_salvar_para_muitos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}