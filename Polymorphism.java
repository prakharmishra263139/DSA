class Animal {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding - run time polymorphism
    public void sound(){
        System.out.println("Bark...");
    }
    // Method overloading - compile time polymorphism
    public void sound(int time){
        for(int i=0;i<time;i++){
            System.out.println( "Dog barks...");
        }
    }
}

class cat extends Animal {

    // method overriding runtime polymorphism
    public void sound(){
        System.out.println("Meow....");

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal mydog =new Dog();
        Animal mycat =new cat();

        an.sound();
        mydog.sound();
        mycat.sound();

        Dog ndog =new Dog();
        ndog.sound(3);

    }
}
