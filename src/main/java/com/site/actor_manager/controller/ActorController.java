package com.site.actor_manager.controller;

import com.site.actor_manager.model.Actor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ActorController {


    List<Actor> actors = new ArrayList<>();

    public ActorController() {
        actors.add(new Actor(1, "John Doe", "The Great Adventure"));
        actors.add(new Actor(2, "Jane Smith", "Mystery Island"));
    }


    @GetMapping("/actor")
    public List<Actor> getActorDetails() {
        return actors;
    }


    @GetMapping("/actor/{id}")
    public Actor getActorById(@PathVariable int id) {
        for (Actor actor : actors) {
            if (actor.getId() == id) {
                return actor;
            }
        }
        return null;
    }


    @PostMapping("/actor")
    public String createActor(@RequestBody Actor newActor) {
        actors.add(newActor);
        return "Actor created successfully";
    }


    @PutMapping("/actor/{id}")
    public String updateActor(@PathVariable int id, @RequestBody Actor updatedActor) {
        for (Actor actor : actors) {
            if (actor.getId() == id) {
                actor.setName(updatedActor.getName());
                actor.setMovieName(updatedActor.getMovieName());
                return "Actor updated successfully";
            }
        }
        return "Actor not found";
    }


    @DeleteMapping("/actor/{id}")
    public String deleteActor(@PathVariable int id) {
        actors.removeIf(actor -> actor.getId() == id);
        return "Actor deleted successfully";
    }
}
