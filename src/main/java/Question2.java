public class Question2 {
    public static void main(String[] args) {
        Subject s=new Maths(); //loosely coupled
        s.subject_name();
    }
}

interface Subject{
    public void subject_name();
}

class Maths implements Subject{
    public void subject_name(){
        System.out.println("I am Maths");
    }
}

class Science implements Subject{
    public void subject_name(){
        System.out.println("I am Science");
    }
}
