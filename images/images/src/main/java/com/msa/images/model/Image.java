package com.msa.images.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "image")
public class Image {

    @Id
    private final String id;
    private String name;

    public Image(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
