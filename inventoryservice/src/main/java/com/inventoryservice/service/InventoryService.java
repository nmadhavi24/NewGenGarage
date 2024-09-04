package com.inventoryservice.service;

import com.inventoryservice.repository.InventoryRepository;

public class InventoryService {
	private final InventoryRepository repository;
	
	InventoryService(InventoryRepository repository) {
	    this.repository = repository;
	}
	
	public void updateInventoryInfo(InventoryRequest request) {
		 //get inventory model from request
		repository.save(getInventory(request));
	 }
	
	public void updateAvailableQuantity(InventoryRequest request) {
		 Inventory inventory = repository.findById(request.getPartID());
	    	
		 //get inventory model from request
		 repository.save(getInventory(inventory));
		 
		 //check if available quantity has gone below the thresholdLimit
		 //if yes then place new order for that partID
		 if(inventory.getAvailableQuantity() <= inventory.getThresholdLimit()) {
			 //call orderservice placeOrder method
		 }
	 }
	
	private Inventory getInventory(InventoryRequest request) {
		 //method creates the Inventory model required for saving into DB from the input request object.
	 }

}
