import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring1.config.MainConfig;
import pojo.Person;

public class MainTest1 {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = (Person) applicationContext.getBean("person");
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) app.getBean("b");
//        System.out.println(person);

        String[] namesBeans = app.getBeanNamesForType(Person.class);
        for (String name: namesBeans) {
            System.out.println(name);
        }

    }




}
