package com.example.bootcamp.controller;

import com.example.bootcamp.model.Superpower;
import com.example.bootcamp.service.SuperpowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class SuperpowerController {
    @Autowired
    SuperpowerService superpowerServ;

    @GetMapping("/superpowers")
    public List<Superpower> getSuperpowers() {
        return superpowerServ.findAll();
    }

    @GetMapping("/superpowers/{id}")
    public Superpower getSuperpowerById(@PathVariable(name = "id") Long id) {
        return superpowerServ.findById(id);
    }

    @PostMapping("/superpowers")
    public Superpower addSuperpower(@RequestBody Superpower superpower) {
        return superpowerServ.save(superpower);
    }
}
