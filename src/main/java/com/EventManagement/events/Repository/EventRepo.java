package com.EventManagement.events.Repository;

import com.EventManagement.events.Model.Events;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends MongoRepository<Events,Integer> {
}
