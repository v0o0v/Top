package com.v0o0v.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.v0o0v.top.domain.Image;
import com.v0o0v.top.domain.User;
import com.v0o0v.top.repository.ImageRepository;
import com.v0o0v.top.repository.UserRepository;
import com.v0o0v.top.repository.User_ImageRepository;

@SpringBootApplication
public class TopApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepo;

    @Autowired
    ImageRepository imageRepo;

    @Autowired
    User_ImageRepository user_imageRepo;

    public static void main(String[] args) {
	SpringApplication.run(TopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
	
	this.userRepo.save(new User("user1"));
	
	this.imageRepo.save(new Image());

    }
}
