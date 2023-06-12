package com.example.demo.Repository;


import com.example.demo.model.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin
interface ProductRepository extends CrudRepository<product,Long> {

}
