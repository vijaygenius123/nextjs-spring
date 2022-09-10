package com.vijaygenius123.nextjsspring.repositories;

import com.vijaygenius123.nextjsspring.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findAllByUid(String uid);
}
