package com.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/order")
@RequiredArgsConstructor
public class AutopartController {
    private final OrderService orderService;

    @PostMapping
    public void placeOrder(@RequestBody OrderRequest request) {
    	orderService.processOrder(request);
    }
}

}