package com.autopartservice.service;

import com.autopartservice.AutopartRepository;

public class AutopartService {
	
	private final AutopartRepository repository;

	AutopartService(AutopartRepository repository) {
	    this.repository = repository;
	}
	  
	 public void addAutopart(AutoPartRequest request) {
		 	
		 //get autopart model from request and save
		 repository.save(getAutoPart(request));
	 }
	 
	 public void updateAutopart(AutoPartRequest request) {
		 AutoPart part = repository.findById(request.getPartID());
		 //update the details in the above part object and save
		 //get autopart model from request
		 autopartRepository.save(part);
	 }
	 
	 private Autopart getAutoPart(AutoPartRequest request) {
		 //method creates the Autopart model required for saving into DB from the input request object.
	 }


}
