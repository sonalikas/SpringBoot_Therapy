package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Therapist {
	@Id
	 private long id;
	 private String title;
	 private String description;
	public Therapist(long id, String title, String description) {
		super();
		
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Therapist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Therapist [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	 
}
