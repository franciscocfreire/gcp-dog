package com.example.dog.controller;


import com.example.dog.repository.DogRepository;
import com.example.dog.domain.Dog;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DogController {


    private final DogRepository dogRepository;

    @GetMapping("/api/v1/dogs")
    public Iterable<Dog> getAllDogs() {
        log.debug("->getAllDogs");
        return dogRepository.findAll();
    }

    @PostMapping("/api/v1/dogs")
    public Dog saveDog(@RequestBody Dog dog) {
        log.debug("->saveDog {}", dog);
        return dogRepository.save(dog);

    }


}
