/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 35389
 */
public class Car extends Vehicle implements Drivable{
    public Car( float speed, String make,String type, int numPassengers){
            super(speed, make , type, numPassengers );
            numWheels = 4;
    
}
    @Override
    public void accelrate(float speed){
        setSpeed(speed + getSpeed());
    }
    @Override
    public void brake(){
        setSpeed(0);
    }
    @Override
    public void turn (float angle){
        setDirection(getDirection()+angle);
    }

    void accelerate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }
}
