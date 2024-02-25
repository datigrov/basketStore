package com.basket.demobasketstore;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketStoreService {
    private final List<Long> userId;

    public BasketStoreService() {
        userId = new ArrayList<>();
    }

    public void add(List<Long> ids) {
        this.userId.addAll(ids);
    }

    public List<Long> get () {
        return Collections.unmodifiableList(userId);
    }

}
