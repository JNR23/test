package com.jnr23.controller;

import com.jnr23.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "/list")
    public List<Anime> list() {
        return List.of(new Anime("DBz"), new Anime("Hero"));
    }
}
