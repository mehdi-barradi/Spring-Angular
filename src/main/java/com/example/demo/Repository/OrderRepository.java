package com.example.demo.Repository;


import com.example.demo.model.customerOrder;
import com.example.demo.model.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
interface OrderRepository extends CrudRepository<customerOrder,Long> {

}
