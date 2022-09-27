/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauval230922;

import java.text.DecimalFormat;

/**
 *
 * @author Nauval
 */
public class latihan2 {
    public static void main(String[] args) {
        DecimalFormat Formatdata = new DecimalFormat("#.##");
    //sedikit angka 
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        System.out.println("Variabel values...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
            System.out.println("    y = " + y);
            
    // Penjumlahan Angka         
        System.out.println("Adding...");
        System.out.println("    i + j = " + ( i + j));
        System.out.println("    x + y = " + ( x + y));
        
    //Pengurangan Angka
        System.out.println("Subtracting...");
        System.out.println("    i - j =" + (i - j));
        System.out.println("    x - y =" + ( x - y));
    
    //Perkalian Angka 
        System.out.println("Multiplying...");
        System.out.println("    i * j = " + (i * j));
        System.out.println("    x * y = " + Formatdata.format(x * y));
        
    //Pembagian Angka
        System.out.println("Dividing...");
        System.out.println("    i / j = " + (i / j));
        System.out.println("    x / y = " + (x / y));
    
    //menghtung hasil modulus dari pembagian 
        System.out.println("Computing the remainder...");
        System.out.println("    i % j = " + (i % j));
        System.out.println("    x % y = " + (x % y));
        
    //Tipe Penggabungan 
         System.out.println("Mixing tipes...");
        System.out.println("    i + j = " + (i + j));
        System.out.println("    x * y = " + (x * y));
    }
}
