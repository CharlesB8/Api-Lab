package com.example.apiLab.Controllers;

import com.example.apiLab.Models.Dog;
import com.example.apiLab.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceImpl;

    @GetMapping("/dog")
    public Dog getDog(){

        return dogServiceImpl.getDog();
    }

    @PostMapping("/create/dog")
    public String createDogFromDogApi() {
        return "Dog fetched and created";
    }
}
