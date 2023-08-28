package com.koparyProjekt.koparyProjekt.controller;

import com.koparyProjekt.koparyProjekt.data.Kopara;
import com.koparyProjekt.koparyProjekt.service.KoparaService;
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
    public Kopara findById(@PathVariable long id) {
        return koparaService.findById(id);
    }
    @PostMapping
    public Kopara create(@RequestBody Kopara kopara) {
        return koparaService.save(kopara);
    }
    @PutMapping("/{id}")
    public Kopara update(@RequestBody Kopara kopara) {
        return koparaService.save(kopara);
    }
    @DeleteMapping
    public void deleteById(@PathVariable long id){
        koparaService.deleteById(id);

    }
}
