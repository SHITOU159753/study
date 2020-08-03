package spring1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.Person;

@Configuration
public class MainConfig {

    @Bean(name = "b")
    public Person person(){
        return new Person("陈律华",23);
    }

    @Bean(name = "bc")
    public Person person2(){
        return new Person("陈律华",23);
    }
}
