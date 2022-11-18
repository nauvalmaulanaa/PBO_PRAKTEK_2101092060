/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts181122A;

import java.util.Scanner;
/**
 *
 * @author Nauval
 */
public class warnetNauvalExample {
       public static void main(String[] args) {
        warnetNaufal  warnet= new warnetNaufal();
        
        warnet.setKode(1);
        warnet.setNamaPelanggan("Naufal");
        warnet.setJenisPelanggan(1);
        warnet.setTglMasuk(2);
        warnet.setJamMasuk(5);
        warnet.setJamKeluar(8);
        warnet.setLama(2);
        
        warnet.Print();
        warnet.Pembayaran();
        
        
        
        
    }
}
   
