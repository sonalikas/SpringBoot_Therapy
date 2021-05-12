package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.TherapyDao;
import com.springrest.springrest.entities.Therapist;

@Service
public class TherapistServicesimpl implements TherapistService {
	@Autowired(required=false)
	private TherapyDao therapyDao;
	
//	List<Therapist> list;
	
	public TherapistServicesimpl() {
//		list=new ArrayList<>();
//		list.add(new Therapist(001,"Title 1","descr"));
//		list.add(new Therapist(002,"Title 2","des something"));
//		list.add(new Therapist(003,"Title 3","something here"));
//		list.add(new Therapist(004,"Title 4","something about"));
	}
	
	
	
	@Override
	public List<Therapist> getTherapist() {
		   ArrayList<Therapist> data=null;
		try {
			System.out.println("Therapist is here ");
			 therapyDao.findAll();
		}catch(Exception e) {
			System.out.println("NullPointerException thrown!");
		}
		
		return data;
	}

//	@Override
//	public List<Therapist> getTherapist() {
//		// TODO Auto-generated method stub
//		List<Therapist>therapyDao = new ArrayList<>();
//		therapyDao.forEach(therapyDao::add);
//		return therapyDao;
//	}

	@Override
	public Therapist getTherapy(long TherapyId) {
		// TODO Auto-generated method stub
//		Therapist t=null;
//		
//		for(Therapist Therapy:list)
//			 {
//			if(Therapy.getId()==TherapyId) {
//				t=Therapy;
//				break;
//			}
//				
//		}
		return therapyDao.getOne(TherapyId);
	}



	@Override
	public Therapist addTherapy(Therapist Therapy) {
//		list.add(Therapy);
		try {
			System.out.println("Therapist is here ");
			therapyDao.save(Therapy);
			
		}catch(Exception e) {
			System.out.println("NullPointerException thrown!");
		}
		
		
//		therapyDao.save(Therapy);
		return Therapy;
		
	}



	@Override
	public Therapist updateTherapy(Therapist Therapy) {
//		list.forEach(e ->{
//			if(e.getId() == Therapy.getId()) {
//				e.setTitle(Therapy.getTitle());
//				e.setDescription(Therapy.getDescription());
//			}
//		});
		therapyDao.save(Therapy);
		return Therapy;
	}


	@Override
	public void deleteTherapy(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		Therapist entity= therapyDao.getOne(parseLong);
		therapyDao.delete(entity);
	}
	
	

}
