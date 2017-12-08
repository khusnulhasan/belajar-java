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
public class Mahasiswa {
    
    private String nim = "NIM : 15.11.9233";
    private String alamat = "Alamat : Yogyakarta";
    private int umur;
    private int nilai;
    private String nama;
    
//   public void identitas(){
//       System.out.println(nama);
//       System.out.println(alamat);
//   }
//   
//   public void nim(){
//       System.out.println(nim);
//   }
//   
//   public void umur(int umur){
//       System.out.println("Umur : " +umur);
//   }
//   
//   public void nilai(int nilai){
//       System.out.println("Nilai : " + nilai);
//   }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setUmur(int umurku){
        umur = umurku;
    }
    public int getUmur(){
        return umur;
    }
}
