package com.anadunning.aula_salvar_para_muitos.services;

import com.anadunning.aula_salvar_para_muitos.dto.CategoryDTO;
import com.anadunning.aula_salvar_para_muitos.dto.ProductDTO;
import com.anadunning.aula_salvar_para_muitos.entities.Category;
import com.anadunning.aula_salvar_para_muitos.entities.Product;
import com.anadunning.aula_salvar_para_muitos.repositories.CategoryRepository;
import com.anadunning.aula_salvar_para_muitos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    public ProductDTO insert (ProductDTO dto) {

        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDTO catDto : dto.getCategories()) {

            Category cat = categoryRepository.getReferenceById(catDto.getId());

//            Category cat = new Category();
//            cat.setId(catDto.getId());
            entity.getCategories().add(cat);
        }

        entity = repository.save(entity);
        return new ProductDTO(entity);
    }
}