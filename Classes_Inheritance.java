/*
create four small java classes - driver, Vehicle, car and truck.
 */
package driver;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class Driver {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Truck();
        
        System.out.println("Vroom vroom...");
        v1.start();
        System.out.println("Set your desired speed: ");
        int num = in.nextInt();
        v1.setSpeed(num);
        v1.decreaseSpeed();
        v1.getSpeed();
        
        v2.setSpeed(85);
        v2.increaseSpeed();
        v2.getSpeed();
        v2.openTrunk();
        v2.closeTrunk();
        
        v3.setSpeed(90);
        v3.getSpeed();
        v3.openTailgate();
        v3.closeTailgate();
    }
    
}

class Vehicle {
    
    public int curr_speed;
    public int top_speed = 75;
    
    public void start(){
        curr_speed = 5;
        System.out.println("The vehicle is started moving at " +curr_speed +" mph");
    }
    public void stop(){
        curr_speed = 0;
        System.out.println("The vehicle has stopped moving: " +curr_speed +" mph");
    }
    public void setSpeed(int num){
        
        curr_speed = num;
        System.out.println("The vehicle speed is set at: " +curr_speed +" mph");  
    }
    public void getSpeed(){
        System.out.println("Current speed : " + curr_speed);
    }
    public void increaseSpeed(){
        curr_speed += 5;
        System.out.println("Current Speed is increased: " + curr_speed + " mph");
    }
    public void decreaseSpeed(){
        curr_speed -=5;
        System.out.println("Current speed is decreased: " + curr_speed + " mph");
    }
    public void turn(){
        System.out.println("The vehicle is turning.");
    }

    void openTrunk() {}
    void closeTrunk() {}
    void openTailgate(){}
    void closeTailgate(){}

}

class Car extends Vehicle{
    public void setSpeed(int num){
        if(num<75)
            curr_speed = num;
        else{
            System.out.println("Car speed greater than 75, reducing it to top speed.");
            curr_speed = 75; 
        }     
    }
    
    public void openTrunk(){
        System.out.println("Car trunk is opened.");
    }
    public void closeTrunk(){
        System.out.println("Car trunk is closed");
    }
}
    
class Truck extends Vehicle{
      public void openTailgate(){
          System.out.println("Truck tailgate is opened.");
      }  
      public void closeTailgate(){
          System.out.println("Truck tailgate is closed.");
      }
}
