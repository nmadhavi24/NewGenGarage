package com.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "Order")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long orderID;
	
	private Long partID;
	private String supplier;
    private Integer quantity;
    private Integer orderDate;
    private Integer orderStatus;
}
