package com.example.apiLab.Services;

import com.example.apiLab.Models.Dog;

public interface DogService {
    public Dog getDog();
    public void saveDog(Dog dog);
}
