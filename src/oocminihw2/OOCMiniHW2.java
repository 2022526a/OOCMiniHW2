/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sailboat sailboat = new Sailboat(80 ,"DoscksQueen","Sailboat",  4);
        sailboat.hoistSail();
        sailboat.landHo();
        Airplane airplane = new Airplane(1000, "ThunderF17", "Fighter Jet",2);
        airplane.changeAltitude(40000);
        System.out.println("Present Altitude" + airplane.getAltitude());
    }
    
}
