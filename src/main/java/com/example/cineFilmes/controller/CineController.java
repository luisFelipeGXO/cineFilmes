package com.example.cineFilmes.controller;

import com.example.cineFilmes.cine.CineRepository;
import com.example.cineFilmes.cine.Cine;
import com.example.cineFilmes.cine.CineRequestDTO;
import com.example.cineFilmes.cine.CineResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cine")
public class CineController {

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCine(@RequestBody CineRequestDTO data) {
        Cine cineData = new Cine(data);
        repository.save(cineData);
        return;
    }

    @Autowired
    private CineRepository repository;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<CineResponseDTO> getAll() {
        List<CineResponseDTO> cineList = repository.findAll().stream().map(CineResponseDTO::new).toList();
        return cineList;
    }
}
