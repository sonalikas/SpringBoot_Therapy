package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entities.Therapist;

public interface TherapistService {

	
	public List<Therapist> getTherapist();
	
	public Therapist getTherapy(long getTherapy);
	
	public Therapist addTherapy(Therapist Therapy);
	
	public Therapist updateTherapy(Therapist Therapy);
	
	public void deleteTherapy(long parseLong);
}
