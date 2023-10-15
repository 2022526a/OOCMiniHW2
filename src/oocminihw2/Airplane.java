/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 35389
 */
public class Airplane extends Vehicle implements Flyable {
    public Airplane(float speed, String make, String type, int numpassengers){
        super(speed, make,type, numpassengers);
        numWings = 2;
    }
}
