package com.sachin.prodreadyfeatures.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor //constructor for JSON to Java object
public class PostDTO {
    private String title;
    private String description;
}
