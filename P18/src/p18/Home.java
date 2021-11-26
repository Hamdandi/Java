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
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("============");
        System.out.println("Sparrow");
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makesound();
        
        System.out.println("============");
        System.out.println("Toy Duck");
        ToyDuck toyduck = new PlasticToyDuck();
        toyduck.squeak();
    
        System.out.println("============");
        System.out.println("bird Adapter");
        BirdAdapter birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();
    }
}
