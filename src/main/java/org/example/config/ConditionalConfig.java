package org.example.config;

import org.example.bean.Cat;
import org.example.bean.Dog;
import org.example.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ConditionalConfig {

    @ConditionalOnClass(name = "org.apache.kafka.common.KafkaException")
    @Bean
    public Cat cat01() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "org.apache.kafka.common.KafkaException")
    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(Dog.class)
    @Bean
    public User user01() {
        return new User();
    }

    @ConditionalOnMissingBean(Dog.class)
    @Bean
    public User user02() {
        return new User();
    }
}
