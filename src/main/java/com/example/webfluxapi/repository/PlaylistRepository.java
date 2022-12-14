package com.example.webfluxapi.repository;

import com.example.webfluxapi.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{
}
