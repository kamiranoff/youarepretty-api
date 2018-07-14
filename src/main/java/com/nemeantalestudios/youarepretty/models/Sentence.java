package com.nemeantalestudios.youarepretty.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document(collection = "sentences")
public class Sentence {

    @Id
    private String id;
    private String code;
    private String name;
    private List<String> pretty;
    private List<String> romanization;
    private boolean rtl;


    public Sentence() {
    }

    
}
