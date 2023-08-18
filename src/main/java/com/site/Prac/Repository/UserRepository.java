package com.site.Prac.Repository;

import com.site.Prac.login.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByEmail(String email);
}
