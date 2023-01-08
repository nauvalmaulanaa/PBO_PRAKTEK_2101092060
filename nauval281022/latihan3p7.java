/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauval281022;

/**
 *
 * @author Nauval
 */
public class latihan3p7 {
    public static void main(String[] args) {
        String entry[][] = {{"Florence","735-1234","Manila"},{"joyce","983-3333","Quezon City"},{"Becca","456-3322","manila"}};
        for (String[] entry1 : entry) {
            System.out.println("Name   : " + entry1[0]);
            System.out.println("Phone  : " + entry1[1]);
            System.out.println("Address: " + entry1[2]);
            System.out.println("\n");
        }
    }
}
