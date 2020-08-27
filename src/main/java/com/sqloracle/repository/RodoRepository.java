package com.sqloracle.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sqloracle.entity.Rodo;

@Repository
public interface RodoRepository extends CrudRepository<Rodo, Serializable> {

}
