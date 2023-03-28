package Question6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        SearchImp search = applicationContext.getBean(SearchImp.class);
        int result = search.searchNumber(new int[]{4, 2, 8, 6}, 3);
        System.out.println("Result : " + result);
    }
}
