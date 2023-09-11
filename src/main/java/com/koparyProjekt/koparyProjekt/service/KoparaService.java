package com.koparyProjekt.koparyProjekt.service;

import com.koparyProjekt.koparyProjekt.data.Kopara;
import com.koparyProjekt.koparyProjekt.dto.KoparaDto;
import com.koparyProjekt.koparyProjekt.exception.EntityNotFoundException;
import com.koparyProjekt.koparyProjekt.repository.KoparaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class KoparaService {
    @Autowired
    private KoparaRepository koparaRepository;

    public List<Kopara> findAll() {
        return koparaRepository.findAll();
    }

    public Kopara findById(long id) {
        return koparaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Kopara save(KoparaDto koparaRequest) {
        Kopara kopara = Kopara.builder()
                .brand(koparaRequest.getBrand())
                .color(koparaRequest.getColor())
                .weight(koparaRequest.getWeight())
                .build();
        return koparaRepository.save(kopara);
    }

    public void deleteById(long id){
        koparaRepository.deleteById(id);
    }

    public Kopara update(long id, Kopara kopara){
        Optional<Kopara> existingKopara = koparaRepository.findById(id);
        if (existingKopara.isPresent()) {
            Kopara updatedKopara = existingKopara.map(data -> new Kopara(data.getId(), data.getBrand(), data.getColor(), data.getWeight())).orElse(null);
            if (!Objects.equals(kopara.getBrand(), "")) {

                updatedKopara.setBrand(kopara.getBrand());
            }

            if (!Objects.equals(kopara.getColor(), "")) {
                updatedKopara.setColor(kopara.getColor());
            }

            if (kopara.getWeight() > 0) {
                updatedKopara.setWeight(kopara.getWeight());
            }
            return koparaRepository.save(updatedKopara);
        }else {
            return null;
        }
    }
}

