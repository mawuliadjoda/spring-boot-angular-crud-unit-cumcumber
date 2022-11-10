package com.esprit.springbootcrud.controller;

import com.esprit.springbootcrud.dto.Kata;
import com.esprit.springbootcrud.service.KataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("kata")
public class KataController {

    private final KataService kataService;

    @Autowired
    public KataController(KataService kataService) {
        this.kataService = kataService;
    }

    @PostMapping
    public Kata save(@RequestBody Kata kata) {
        return kataService.save(kata);
    }

    @GetMapping
    public List<Kata> findAll() {
        return kataService.findAll();
    }
}