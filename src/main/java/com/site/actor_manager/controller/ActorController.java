package com.site.actor_manager.controller;

import com.site.actor_manager.model.Actor;
import com.site.actor_manager.repo.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorRepo actorRepo;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorRepo.findAll();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorRepo.findById(id).orElse(null);
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepo.save(actor);
    }

    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable Long id) {
        actorRepo.deleteById(id);
    }
}
