package com.hooda.springboot.reactiveRestWebService;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    private String name;
    private String owner;
    private Number value;
    private String makeModel;
}
