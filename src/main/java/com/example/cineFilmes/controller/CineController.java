package com.example.cineFilmes.controller;

import com.example.cineFilmes.cine.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cine")
public class CineController {

    @Autowired
    private CineRepository repository;

    public void saveCine(@RequestBody)
}
