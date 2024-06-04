package com.intercatalogue.intercatalogue_api.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "projects")  
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	@Column(name="creator_name")
	private String creatorName;	
	@Column(name="creator_surname")
	private String creatorSurname;	
	@Column(name="email")
	private String email;	
	@Column(name="url")
	private String url;
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name ="tags")
	private String tags;

}