/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

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
    System.out.println("1. Liat Data Brand");
    System.out.println("2. Tambah Data Brand");
    System.out.println("====================");
    
    Brand brand = new Brand();
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("pilih No.1 atau No.2 :");
    Integer menu = scanner.nextInt();
    
    if (menu == 1) {
        System.out.println(brand.getData());
    }else if(menu == 2) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Masukkan nama Brand 2 : ");
        String nama = scanner2.nextLine();
        brand.setData(nama);
        
        System.out.print("masukkan nama Brand 3 : ");
        nama = scanner2.nextLine();
        brand.setData(nama);
        
        System.out.println("================");
        System.out.println("Daftar semua Brand : " + brand.getData());
        
        
    }
    
    }
    
}
