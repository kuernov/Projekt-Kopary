package com.koparyProjekt.koparyProjekt.service;

import com.koparyProjekt.koparyProjekt.data.Kopara;
import com.koparyProjekt.koparyProjekt.exception.EntityNotFoundException;
import com.koparyProjekt.koparyProjekt.repository.KoparaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Kopara save(Kopara kopara) {
        return koparaRepository.save(kopara);
    }

    public void deleteById(long id){
        koparaRepository.deleteById(id);
    }
}
