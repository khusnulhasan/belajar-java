/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author HIKENSABO
 */
public class DataDiri {
    String nama;
    int umur;
    String baju;
    String celana;

    
    public DataDiri(String nama){
        this.nama = nama;
            // System.out.println("this is construct");
    }
    
    public void setUmur(int umurku){
        this.umur = umurku;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return "Nama saya adalah "+ nama;
    }
            
    public void setBaju(String baju){
        this.baju = baju;
    }
    
    public String getBaju(){
        return baju;
    }
    
    public void setCelana(String celana){
        this.celana = celana;
    }
    
    public String getCelana(){
        return celana;
    }
    
    
}
