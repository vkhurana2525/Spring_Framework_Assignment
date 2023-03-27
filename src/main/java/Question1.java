public class Question1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}

class Car{

    Automobile am=new Automobile();
    public void display(){
        am.dis();
    }

}

class Automobile{
    public void dis(){
        System.out.println("I am an Automobile");
    }
}
