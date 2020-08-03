package Spring2.config;

import Spring2.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pojo.Person;

@Configuration
@ComponentScan(value = "Spring2",
        includeFilters = {
//        @Filter(type = FilterType.ANNOTATION,classes = {Service.class}),
//        @Filter(type = FilterType.ANNOTATION,classes = {Repository.class}),
//        @Filter(type = FilterType.CUSTOM,classes = {ClhTypeFilters.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
        },
//        excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//        },
        useDefaultFilters = true)
public class MainConfig2 {


    @Bean
//    @Lazy
    public Person person(){
            System.out.println("给容器添加person");
        return new Person("好好",3);
    }
}
