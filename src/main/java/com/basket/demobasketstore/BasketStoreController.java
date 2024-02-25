package com.basket.demobasketstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketStoreController {
    private final BasketStoreService basketStoreService;

    public BasketStoreController(BasketStoreService basketStoreService) {
        this.basketStoreService = basketStoreService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id")List<Long> id) {
        basketStoreService.add(id);
    }

    @GetMapping("/get")
    public List<Long> get() {
        return basketStoreService.get();
    }
}
