package org.example.bean;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Child {

    private String name;
    private Integer age;
    private LocalDate birthday;
    private List<String> texts;
}
