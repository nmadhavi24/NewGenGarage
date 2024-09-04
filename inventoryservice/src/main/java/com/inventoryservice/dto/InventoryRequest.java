package com.invetoryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryRequest {
	private Long partID;
	private String partName;
	private String supplier;
    private Integer thresholdLimit;
    private Integer availableQuantity;
    private Integer minimumOrderQuantity;
}