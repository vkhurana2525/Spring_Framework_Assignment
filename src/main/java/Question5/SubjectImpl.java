package Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SubjectImpl{
    @Autowired

    Subject sub;

    public int function(){
        sub.subject_name();
        return 2;
    }

}


interface Subject{
    public void subject_name();
}



@Component
@Primary
class Maths1 implements Subject {
    @Override
    public void subject_name(){
        System.out.println("I am Maths");
    }
}

@Component

class Science1 implements Subject {
    @Override
    public void subject_name(){
        System.out.println("I am Science");
    }
}

