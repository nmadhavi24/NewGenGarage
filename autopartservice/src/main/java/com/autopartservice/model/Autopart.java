package com.autopartservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "Autopart")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Autopart {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long partID;
	
    private String partName;
    private String specifications;
    private String price;
}
