class Animal {
    void sound() {
       System.out.println("Animals makes  a sound");
       }
   }
class Dog extends Animal {
     void bark() {
        System.out.println("Dog brakes");
       }
   }
public class Single {
    public static void main(String[] args) {
    Dog dog=new Dog();
    dog.sound();
    dog.bark();
   }
 }               
