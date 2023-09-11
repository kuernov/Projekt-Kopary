package com.koparyProjekt.koparyProjekt.controller;

import com.koparyProjekt.koparyProjekt.data.Kopara;
import com.koparyProjekt.koparyProjekt.dto.KoparaDto;
import com.koparyProjekt.koparyProjekt.service.KoparaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kopary")
public class KoparaController {
    @Autowired
    private KoparaService koparaService;

    @GetMapping
    public ResponseEntity<List<Kopara>> findAll() {
        return ResponseEntity.ok(koparaService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Kopara> findById(@PathVariable @Valid long id) {

        return ResponseEntity.ok(koparaService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Kopara> create(@RequestBody @Valid KoparaDto koparaRequest) {

        return new ResponseEntity<>(koparaService.save(koparaRequest), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Kopara> update(@PathVariable Long id, @RequestBody @Valid Kopara kopara) {
        Kopara updatedKopara = koparaService.update(id, kopara);

        if (updatedKopara != null) {
            return new ResponseEntity<>(updatedKopara, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable @Valid long id){
        koparaService.deleteById(id);

    }
}
