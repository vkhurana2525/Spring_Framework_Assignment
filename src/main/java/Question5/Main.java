package Question5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class Main{

    public static void main(String[] args) {

        ApplicationContext ap= SpringApplication.run(Main.class, args);
        SubjectImpl bs=ap.getBean(SubjectImpl.class);
        int res=bs.function();
        System.out.println(res);


    }

}