package com.arianit.matura2024.dao;

import com.arianit.matura2024.entity.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String> {
}
