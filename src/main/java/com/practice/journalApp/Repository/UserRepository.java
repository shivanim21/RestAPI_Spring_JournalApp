package com.practice.journalApp.Repository;

import com.practice.journalApp.entity.JournalEntry;
import com.practice.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
}
