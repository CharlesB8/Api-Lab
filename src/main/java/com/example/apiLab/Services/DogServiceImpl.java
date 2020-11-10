package com.example.apiLab.Services;

import com.example.apiLab.Models.Dog;
import com.example.apiLab.Repos.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepo repo;

    @Autowired
    public Dog getDog(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dog.class);
    }

    @Override
    public void saveDog(Dog dog) {
        repo.save(dog);
    }
}
