package com.example.webfluxapi.controller;

import com.example.webfluxapi.document.Playlist;
import com.example.webfluxapi.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
public class PlaylistController {
    @Autowired
    PlaylistService service;

    @GetMapping(value = "/")
    public String homePage(){
        return "API Online";
    }

    @GetMapping(value ="/playlist")
    public Flux<Playlist> getPlaylist(){
        return service.findAll();
    }
    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id){
        return service.findById(id);
    }
    @PostMapping(value = "/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist){
        return service.save(playlist);
    }
}
