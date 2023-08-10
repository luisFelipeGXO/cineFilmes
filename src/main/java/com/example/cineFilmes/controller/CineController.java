package com.example.cineFilmes.controller;

import com.example.cineFilmes.cine.CineRepository;
import com.example.cineFilmes.cine.CineRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cine")
public class CineController {

    @Autowired
    private CineRepository repository;


    @PostMapping
    public void saveCine(@RequestBody CineRequestDTO data) {
        Cine cineData = new Cine(data);
        repository.save(cineData);
        return;
    }

    public List<CineResponseDTO> getAll() {

    }
}
