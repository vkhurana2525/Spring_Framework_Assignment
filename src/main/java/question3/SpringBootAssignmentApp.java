package question3;

import com.example.Spring_Boot_Assignment.SpringBootAssignmentApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;








@SpringBootApplication

public class SpringBootAssignmentApp{

    public static void main(String[] args) {

        ApplicationContext ap=SpringApplication.run(SpringBootAssignmentApp.class, args);
        SubjectsImpl bs=ap.getBean(SubjectsImpl.class);
        int res=bs.function();
        System.out.println(res);


    }

}