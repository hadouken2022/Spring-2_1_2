import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloWorld2");
        Cat catBean =
                (Cat) applicationContext.getBean("meow");
        Cat catBean2 =
                (Cat) applicationContext.getBean("meow2");
        boolean comparation = bean == bean2;
        boolean comparationCats = catBean == catBean2;
        System.out.println(comparation);
        System.out.println(comparationCats);
    }
}