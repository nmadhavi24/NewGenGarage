package com.inventoryservice.repository;

import com.inventoryervice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public Interface InventoryRepository extends JpaRepository<Inventory, Long> {


}
