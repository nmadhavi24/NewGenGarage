package com.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
	 private Long orderID;
		
	 private Long partID;
	 private String supplier;
	 private Integer quantity;
	 private Integer orderDate;
	 private Integer orderStatus;
}