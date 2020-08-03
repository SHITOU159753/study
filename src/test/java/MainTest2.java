import Spring2.config.MainConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Person;



public class MainTest2 {

    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig2.class);

//        String[] namesBeans = app.getBeanDefinitionNames();
//        for (String name: namesBeans) {
//            System.out.println(name);
//        }
        System.out.println("ioc容器创建完成");
        app.getBean("person");

    }




}
