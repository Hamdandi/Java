/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p17;

/**
 *
 * @author mhdha
 */
public class LaptopFactory {
    public Laptop createLaptop(LaptopType laptopType){
        Laptop laptop = null;
        switch (laptopType){
            case GAMING:
                laptop = new Gaming();
                break;
            case MULTIMEDIA:
                laptop = new Multimedia();
                break;
            case ARSITEK:
                laptop = new Arsitek();
                break;
            default:
                break;
        }
        return laptop;
    }
}
