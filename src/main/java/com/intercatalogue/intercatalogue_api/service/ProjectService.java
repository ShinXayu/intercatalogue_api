package com.intercatalogue.intercatalogue_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intercatalogue.intercatalogue_api.model.Project;
import com.intercatalogue.intercatalogue_api.repository.ProjectRepository;

import lombok.Data;

@Data
@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository ProjectRepository;
	
	public Optional<Project> getProject(final Long id) {
		return ProjectRepository.findById(id);
	}
	
	public Iterable<Project> getProjects() {
		return ProjectRepository.findAll();
	}
	
	public void deleteProject(final Long id) {
		ProjectRepository.deleteById(id);
	}
	
	public Project saveProject(Project Project) {
		Project savedProject = ProjectRepository.save(Project);
		return savedProject;
	}



}
