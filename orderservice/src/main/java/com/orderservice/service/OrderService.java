package com.orderservice.service;

import com.orderservice.repository.OrderRepository;

public class OrderService {
	
	private final OrderRepository repository;
	
	OrderService(OrderRepository repository) {
	    this.repository = repository;
	}
	
	public void processOrder(OrderRequest request) {
		 private final OrderRepository orderRepository;
		 
		 Order order = getOrder(request);
		 createOrder(order);
		 
		 //place order immediately for supplier A
		 //For supplier B orders, scheduled job will run every midnight
		 if(request.getSupplier().equalsIgnoreCase("Supplier A")) {
			 placeOrder(order);
		 }
			 
	 }
	
	public void createOrder(Order order) {
		repository.save(order);
	 }
	
	public void placeOrder(Order order) {
	    	
		 //call the supplier controller endpoint to place order
	 }
	
	/*
	 * The scheduled cron job runs post midnight ar 12:15 AM to place orders 
	 * for supplier B to avail best offers and discounts
	 */
	@Scheduled(cron = "0 15 0 * * *")
	public void placeScheduledOrder() {
		 private final OrderRepository orderRepository;
		//fetch the records from Order table that were placed yesterday for
		//supplier as Supplier B
		 
		 //place order	by calling placeOrder() method
	}
	
	private Order getOrder(OrderRequest request) {
		 //method creates the Order model required for saving into DB from the input request object.
	 }


}
