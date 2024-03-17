package com.prodCat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodCat.Entity.CategoryEntity;

//These are repository interface extending JpaRepository.
//They provide CRUD functionalities for CategoryEntity and ProductEntity respectively
@Repository
public interface CatrgoryRepo extends JpaRepository<CategoryEntity, Integer>{

}
