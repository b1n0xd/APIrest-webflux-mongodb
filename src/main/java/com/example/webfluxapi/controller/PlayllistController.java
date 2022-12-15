package com.example.webfluxapi.controller;

import com.example.webfluxapi.document.Playlist;
import com.example.webfluxapi.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlayllistController {
    @Autowired
    PlaylistService service;

    @GetMapping(value ="/playlist")
    public Flux<Playlist> getPlaylist(){
        return service.findAll();
    }
    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id){
        return service.findById(id);
    }
}
