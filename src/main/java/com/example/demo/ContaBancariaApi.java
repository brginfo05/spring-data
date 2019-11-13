package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contas", path = "contas")
public interface ContaBancariaApi extends CrudRepository<ContaBancaria, Integer> {

}
