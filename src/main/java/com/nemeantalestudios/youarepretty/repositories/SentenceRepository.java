package com.nemeantalestudios.youarepretty.repositories;

import com.nemeantalestudios.youarepretty.models.Sentence;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SentenceRepository extends MongoRepository<Sentence, String> {

    @Override
    public List<Sentence> findAll();

}
