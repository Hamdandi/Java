/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p18;

/**
 *
 * @author mhdha
 */
public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makesound() {
        System.out.println("Kur kur kur");
    }
    
}
