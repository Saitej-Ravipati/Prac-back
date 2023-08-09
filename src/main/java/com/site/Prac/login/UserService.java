package com.site.Prac.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public User register(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        System.out.println("Incoming email: " + email);
        System.out.println("Incoming password: " + password);
        System.out.println("User found in DB: " + (user != null));

        if (user != null) {
            System.out.println("Hashed password in DB: " + user.getPassword());
            if (bCryptPasswordEncoder.matches(password, user.getPassword())) {
                return user;
            } else {
                System.out.println("Password does not match.");
            }
        } else {
            System.out.println("Email not found in DB.");
        }
        return null;
    }



}
