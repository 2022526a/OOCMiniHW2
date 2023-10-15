/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 35389
 */
public abstract  class Airplane extends Vehicle implements Flyable {
    public Airplane(float speed, String make, String type, int numpassengers){
        super(speed, make,type, numpassengers);
        numWings = 2;
    }
    @Override
    public void changeAltitude(float change){
        String altitude = null;
    altitude +=change;
        System.out.println("Airplane altitude changed to" + altitude + "feet.");
    
    }
    @Override
    public float getAltitude(){
        float altitude = 0;
        return altitude;
    }
}
    
    
    

