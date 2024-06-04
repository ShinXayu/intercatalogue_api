package com.intercatalogue.intercatalogue_api.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intercatalogue.intercatalogue_api.model.Project;
import com.intercatalogue.intercatalogue_api.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService ProjectService;
	
	/**
	 * Create - Add a new Project
	 * @param Project An object Project
	 * @return The Project object saved
	 */
	@PostMapping("/Project")
	public Project createProject(@RequestBody Project Project) {
		return ProjectService.saveProject(Project);
	}
	
	
	/**
	 * Read - Get one Project 
	 * @param id The id of the Project
	 * @return An Project object full filled
	 */
	@GetMapping("/Project/{id}")
	public Project getProject(@PathVariable("id") final Long id) {
		Optional<Project> Project = ProjectService.getProject(id);
		if(Project.isPresent()) {
			return Project.get();
		} else {
			return null;
		}
	}
	
	/**
	 * Read - Get all Projects
	 * @return - An Iterable object of Project full filled
	 */
	@GetMapping("/Projects")
	public Iterable<Project> getProjects() {
		return ProjectService.getProjects();
	}
	
	/**
	 * Update - Update an existing Project
	 * @param id - The id of the Project to update
	 * @param Project - The Project object updated
	 * @return
	 */
	@PutMapping("/Project/{id}")
	public Project updateProject(@PathVariable("id") final Long id, @RequestBody Project Project) {
		Optional<Project> e = ProjectService.getProject(id);
		if(e.isPresent()) {
			Project currentProject = e.get();
			
			String title = Project.getTitle();
			if (title != null)
			{
				currentProject.setTitle(title);
			}
			String description = Project.getDescription();
			if (description != null)
			{
				currentProject.setDescription(description);
			}
			String creatorName = Project.getCreatorName();
			if(creatorName != null) {
				currentProject.setCreatorName(creatorName);
			}
			String creatorSurname = Project.getCreatorSurname();
			if(creatorSurname != null) {
				currentProject.setCreatorSurname(creatorSurname);;
			}
			String email = Project.getEmail();
			if(email != null) {
				currentProject.setEmail(email);
			}
			String url = Project.getUrl();
			if(url!=null)
			{
				currentProject.setUrl(url);
			}
			String tags = Project.getTags();
			if (tags != null)
			{
				currentProject.setTags(tags);
			}
			Date date = Project.getCreationDate();
			if (date != null)
			{
				currentProject.setCreationDate(date);
			}
			ProjectService.saveProject(currentProject);
			return currentProject;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an Project
	 * @param id - The id of the Project to delete
	 */
	@DeleteMapping("/Project/{id}")
	public void deleteProject(@PathVariable("id") final Long id) {
		ProjectService.deleteProject(id);
	}
	

}