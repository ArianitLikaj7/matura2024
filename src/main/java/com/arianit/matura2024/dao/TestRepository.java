package com.arianit.matura2024.dao;

import com.arianit.matura2024.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test, String> {
}
