/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 35389
 */
public class Sailboat extends Vehicle implements Sailable  {
    private boolean sailhosted;
    private boolean sailHoisted;
  public Sailboat(float speed,String make, String type,int numpassengers) {
      super(speed,make,type,numpassengers);
      numSails = 1;
    }
  @Override
  public void hoistSail(){
      
      System.out.println("Sail has been hoisted");
  }
  @Override
  public void lowerSail(){
      System.out.println("Sail has been lowered");
  }
  @Override
  public boolean isSailHoisted(){
      return sailHoisted; 
  }
  @Override
  public void landHo(){
      System.out.println("Sailboat is landing.");
  }
      
  }
  
