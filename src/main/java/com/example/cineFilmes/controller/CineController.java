package com.example.cineFilmes.controller;

import com.example.cineFilmes.cine.CineRepository;
import com.example.cineFilmes.cine.CineResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cine")
public class CineController {

    @Autowired
    private CineRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<CineResponseDTO> getAll() {

        List<CineResponseDTO> cineList = repository.findAll().stream().map(CineResponseDTO::new).toList();
        return cineList;
    }
}
