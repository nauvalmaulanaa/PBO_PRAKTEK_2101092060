/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauval230922;

/**
 *
 * @author Nauval
 */
public class latihan3 {
    public static void main(String[] args) {
    //a few numbers
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Variabel value...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
        
    //Lebih besar dari 
        System.out.println("Greater than...");
        System.out.println(" i > j = " + (i > j)); //false
        System.out.println(" j > i = " + (j > i)); //true
        System.out.println(" k > j = " + (k > j)); //false

    //Lebih besar atau sama dengan
        System.out.println("Greater than or equal to...");
        System.out.println(" i >= j = " + (i >= j)); //false
        System.out.println(" j >= i = " + (j >= i)); //true
        System.out.println(" k >= j = " + (k >= j)); //true

    //Lebih kecil dari
        System.out.println("Less than...");
        System.out.println(" i < j = " + (i < j)); //true
        System.out.println(" j < i = " + (j < i)); //false
        System.out.println(" k < j = " + (k < j)); //false

    //Lebih kecil atau sama dengan  
        System.out.println("Les than or equal to...");
        System.out.println(" i <= j = " + (i <= j)); //true
        System.out.println(" j <= i = " + (j <= i)); //false
        System.out.println(" k <= j = " + (k <= j)); //true

    //Sama dengan
        System.out.println("Equal to...");
        System.out.println(" i == j = " + (i == j)); //false
        System.out.println(" k == j = " + (k == j)); //true
     
    //Lebih besar dari 
        System.out.println("Not equal to...");
        System.out.println(" i != j = " + (i != j)); //tyrue
        System.out.println(" k != j = " + (k != j)); //false


    }
}
