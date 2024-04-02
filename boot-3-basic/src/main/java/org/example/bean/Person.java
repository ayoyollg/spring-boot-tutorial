package org.example.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private String name;
    private Integer age;
    private LocalDate birthday;
    private Boolean gender;
    private Child child; // T
    private List<Dog> dogs; // List<T>
    private Map<String, Cat> cats; // Map<K, T>

}
