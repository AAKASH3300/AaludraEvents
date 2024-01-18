package com.EventManagement.events.Controller;



import com.EventManagement.events.Model.Events;
import com.EventManagement.events.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController  {

    @Autowired
    EventRepo repo;

    @GetMapping("/allEvents")
    public List<Events> getAllEvents(){
        return repo.findAll(); }

    @PostMapping("/addEvents")
    public Events addEvents(@RequestBody Events events){
        return repo.save(events);}
}
