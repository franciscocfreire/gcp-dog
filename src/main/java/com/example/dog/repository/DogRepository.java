package com.example.dog.repository;


import com.example.dog.domain.Dog;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends DatastoreRepository<Dog, Long> {}