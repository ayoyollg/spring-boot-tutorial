package org.example;

import org.example.bean.Person;
import org.example.bean.Sheep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 啟動SpringBoot項目的主入口程序
 */
@SpringBootApplication // 啟動SpringBoot
@EnableConfigurationProperties({Sheep.class})
public class MainApplication {

    public static void main(String[] args) {

        // java10: 局部變量類型自動推斷
        var ioc = SpringApplication.run(MainApplication.class, args);

//        // 1. 獲取容器中所有組件的名字
//        String[] names = ioc.getBeanDefinitionNames();
//        // 2. 遍歷組件名稱，獲取組件的實例 :
//        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver...
//        // SpringBoot把以前配置的核心組件都自動配置好了
//        for (String name : names) {
//            System.out.println(name);
//        }

//        for (String s : ioc.getBeanNamesForType(Cat.class)) {
//            System.out.println(s);
//        }
//
//        for (String s : ioc.getBeanNamesForType(Dog.class)) {
//            System.out.println(s);
//        }
//
//        for (String s : ioc.getBeanNamesForType(User.class)) {
//            System.out.println(s);
//        }

//        Pig pig = ioc.getBean(Pig.class);
//        System.out.println(pig);
//
//        Sheep sheep = ioc.getBean(Sheep.class);
//        System.out.println(sheep);

        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }

}
