package org.example.config;

import org.example.bean.Cat;
import org.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// @Import(XXX.class) // 在容器中放入指定類型的組件,名字默認是整個class名稱
@Configuration // 用來標示這是一個配置類,替代以前的xml配置文件,配置類本身也是容器中的組件
public class AppConfig {

    /**
     * 默認是singleton
     * 假設是prototype，則容器中的每個組件都會創建一次
     * @return
     */
    @Scope
    @Bean // 用來標示這是一個Bean,替代以前xml的Bean標籤． 在容器中的名字默認是方法名
    public User user() {
        var user = new User();
        user.setId(1L);
        user.setName("John");
        return user;
    }

    @Bean
    public Cat cat() {
        var cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        return cat;
    }
}
