package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Therapist;
import com.springrest.springrest.services.TherapistService;

@RestController
public class MyController {
	@Autowired
	private TherapistService therapistService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page sonalika";
		
	}
	
	
//	get the Therapist list
	@GetMapping("/Therapist")
	public List<Therapist> getTherapist(){
		return this.therapistService.getTherapist();
		
	}
	
	@GetMapping("/Therapist/{TherapyId}")
	public Therapist getTherapy(@PathVariable String TherapyId) {
		return this.therapistService.getTherapy(Long.parseLong (TherapyId));
	}
	
//	add therapist
	@PostMapping("/Therapist")
	public Therapist addTherapy(@RequestBody Therapist Therapy) {
		return this.therapistService.addTherapy(Therapy);
		
	}
	
	@PutMapping("/Therapist")
	public Therapist updateTherapy(@RequestBody Therapist Therapy) {
		return this.therapistService.updateTherapy(Therapy);
	}
	
	
	@DeleteMapping("/Therapist/{TherapyId}")
	public ResponseEntity<HttpStatus> deleteTherapy(@PathVariable String TherapyId){
		try {
			this.therapistService.deleteTherapy(Long.parseLong(TherapyId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
