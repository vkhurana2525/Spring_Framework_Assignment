package question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class SubjectsImpl{
    @Autowired

     Subjects sub;

    public int function(){
        sub.subject_name();
        return 2;
    }

}


interface Subjects{
    public void subject_name();
}





@Component
class Maths1 implements Subjects{
    @Override
    public void subject_name(){
        System.out.println("I am Maths");
    }
}



class Science1 implements Subjects{
    @Override
    public void subject_name(){
        System.out.println("I am Science");
    }
}
