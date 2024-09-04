package com.inventoryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @PostMapping("/updateInfo")
    public void updateInventoryInfo(@RequestBody InventoryRequest request) {
    	inventoryService.updateInventoryInfo(request);
    }

    @PostMapping("/updateAvblQuantity")
    public void updateAvailableQuantity(@RequestBody InventoryRequest request) {
    	inventoryService.updateAvailableQuantity(request);
    }
}

}