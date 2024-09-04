package com.inventoryservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "Inventory")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Inventory {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long partID;
	
	private String supplier;
    private Integer thresholdLimit;
    private Integer availableQuantity;
    private Integer minimumOrderQuantity;
}