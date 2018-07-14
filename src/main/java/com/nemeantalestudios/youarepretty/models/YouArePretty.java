package com.nemeantalestudios.youarepretty.models;

import lombok.Data;

import java.util.List;


@Data
public class YouArePretty {

    private String code;
    private String name;
    private List<String> pretty;
    private List<String> romanization;
    private boolean rtl;
}
