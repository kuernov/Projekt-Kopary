package com.koparyProjekt.koparyProjekt.controller;

import com.koparyProjekt.koparyProjekt.data.Kopara;
import com.koparyProjekt.koparyProjekt.service.KoparaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kopary")
public class KoparaController {
    @Autowired
    private KoparaService koparaService;

    @GetMapping
    public List<Kopara> findAll() {
        return koparaService.findAll();
    }
    @GetMapping("/{id}")
    public Kopara findById(@PathVariable @Valid long id) {
        return koparaService.findById(id);
    }
    @PostMapping
    public Kopara create(@RequestBody @Valid Kopara kopara) {
        return koparaService.save(kopara);
    }
    @PutMapping("/{id}")
    public Kopara update(@RequestBody @Valid Kopara kopara) {
        return koparaService.save(kopara);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable @Valid long id){
        koparaService.deleteById(id);

    }
}
