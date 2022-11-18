/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts181122A;

/**
 *
 * @author Nauval
 */
public class warnetNauval {
    private int Kode;
    private String NamaPelanggan;
    private int JenisPelanggan;
    private String  TglMasuk;
    private int JamMasuk;
    private int JamKeluar;
    private double Tarif;
    private double Total;
    private int Lama;
    private double diskon;
    
    public int getKode(){
        return Kode;
    }
    
    public void setKode(int Kode){
        this.Kode = Kode;
    }
    
    public String getNamaPelanggan(){
        return NamaPelanggan;
    }
    
    public void setNamaPelanggan(String NamaPelanggan){
        this.NamaPelanggan = NamaPelanggan;
    }
    
    public int getJenisPelanggan(){
        return JenisPelanggan;
    }
    
     public void setJenisPelanggan(int JenisPelanggan){
        this.JenisPelanggan = JenisPelanggan;
    }
     
    public String getTglMasuk(){
        return TglMasuk;
    }
     
    public void setTglMasuk(String TglMasuk){
        this.TglMasuk = TglMasuk;
    }
    
    public int getJamMasuk(){
        return JamMasuk;
    }
    
    public void setJamMasuk(int JamMasuk){
        this.JamMasuk = JamMasuk;
    }
    
    public int getJamKeluar(){
        return JamKeluar;
    }
    
    public void setJamKeluar(int JamKeluar){
        this.JamKeluar = JamKeluar;
    }
    
    public double getTarif(){
        return Tarif;
    }
    
    public void setTarif(double Tarif){
        this.Tarif = Tarif;
    }
 
    public int getLama(){
        return Lama;
    }
    
    public double getTotal(){
        return Total;
    }
}