package com.training.kafkademo.repository;

import com.mongodb.client.MongoCollection;
import com.training.kafkademo.documentandentity.EmployeeDocument;

public interface EmployeeMongoRepository extends MongoCollection<EmployeeDocument> {
}
