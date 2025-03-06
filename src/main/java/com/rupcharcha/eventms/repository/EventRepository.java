package com.rupcharcha.eventms.repository;

import com.rupcharcha.eventms.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByName(String name);
    List<Event> findByDescription(String description);
    List<Event> findByNameAndDescription(String name, String description);
    List<Event> findByNameOrDescription(String name, String description);
    List<Event> findByDescriptionLike(String description);
    List<Event> findByNameStartingWith(String name);
    List<Event> findByNameEndingWith(String name);
    List<Event> findByNameContaining(String name);
    List<Event> findByNameIgnoreCase(String name);
    List<Event> findByNameOrderByDescriptionAsc(String name);
    List<Event> findByNameOrderByDescriptionDesc(String name);

    List<Event> findByDescriptionOrderByDescriptionAsc(String description);
}
