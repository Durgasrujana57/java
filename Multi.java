class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
       }
   }
class Car extends Vehicle {
     void drive() {
         System.out.println("Car drives");
       }
   }
class ElectricCar extends Car {
    void charge() {
         System.out.println("Electric car is charging ");
       }
   }
public class Multi {
     public static void main(String[] args) {
        ElectricCar electric = new ElectricCar();
        electric.start();
        electric.drive();
        electric.charge();
        }
      }                            
