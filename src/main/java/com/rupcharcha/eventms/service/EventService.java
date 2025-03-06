package com.rupcharcha.eventms.service;

import com.rupcharcha.eventms.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rupcharcha.eventms.model.Event;

import java.util.List;


@Service
public class EventService  {

    @Autowired
    private EventRepository eventRepository;


    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event event) {
        Event existingEvent = eventRepository.findById(id).orElse(null);
        if (existingEvent != null) {
            existingEvent.setName(event.getName());
            existingEvent.setDescription(event.getDescription());
            return eventRepository.save(existingEvent);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByName(String name) {
        return eventRepository.findByName(name);
    }

    public List<Event> getEventsByDescription(String description) {
        return eventRepository.findByDescription(description);
    }

    public List<Event> getEventsByNameAndDescription(String name, String description) {
        return eventRepository.findByNameAndDescription(name, description);
    }

    public List<Event> getEventsByNameOrDescription(String name, String description) {
        return eventRepository.findByNameOrDescription(name, description);
    }

}
