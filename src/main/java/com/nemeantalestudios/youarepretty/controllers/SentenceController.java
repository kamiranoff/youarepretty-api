package com.nemeantalestudios.youarepretty.controllers;

import com.nemeantalestudios.youarepretty.models.Sentence;
import com.nemeantalestudios.youarepretty.repositories.SentenceRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kamiranoff
 * @createdOn 14/07/2018
 */

@RestController
public class SentenceController {

    private SentenceRepository sentenceRepository;


    public SentenceController(SentenceRepository sentenceRepository) {
        this.sentenceRepository = sentenceRepository;
    }


    @RequestMapping(value = "/sentences", method = RequestMethod.GET)
    public List<Sentence> getAll() {
        List<Sentence> sentences = sentenceRepository.findAll();

        return sentences;
    }
}
