package com.intercatalogue.intercatalogue_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intercatalogue.intercatalogue_api.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}