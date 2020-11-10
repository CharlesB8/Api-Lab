package com.example.apiLab.Repos;

import com.example.apiLab.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {}
