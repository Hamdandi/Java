/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import java.util.ArrayList;
/**
 *
 * @author mhdha
 */
public class Brand {
    private ArrayList daftar;
    
    public Brand(){
        daftar = new ArrayList<String>();
        daftar.add("toyota");
    }
    
    public ArrayList getData(){
        return daftar;
    }
    
    public void setData(String namaBrand){
        daftar.add(namaBrand);
       
    }
}
