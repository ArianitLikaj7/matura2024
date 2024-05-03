package com.arianit.matura2024.dao;

import com.arianit.matura2024.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
