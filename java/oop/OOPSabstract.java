public class OOPSabstract {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        /*Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color );

        Chicken c= new Chicken();
        c.eat();
        c.walk();*/
        
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("animal constructor called");
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse contructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}
