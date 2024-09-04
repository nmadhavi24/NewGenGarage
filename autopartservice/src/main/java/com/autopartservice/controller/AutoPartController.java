package com.autopartservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/autopart")
@RequiredArgsConstructor
public class AutopartController {
    private final AutopartService autopartService;

    @PostMapping
    public void addAutopart(@RequestBody AutoPartRequest request) {
    	autopartService.addAutopart(request);
    }

    @PutMapping
    public void updateAutopart(@RequestBody AutoPartRequest request) {
         autopartService.updateAutopart(request);
    }
}

}