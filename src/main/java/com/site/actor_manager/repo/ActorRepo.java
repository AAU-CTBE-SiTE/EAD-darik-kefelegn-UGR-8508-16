package com.site.actor_manager.repo;

import com.site.actor_manager.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Long> {
}
