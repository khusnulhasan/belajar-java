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
public class Main {
    
    public static void main(String[] args){
        
        DataDiri saya = new DataDiri("hasan");
        ProfileSekolah hasan = new ProfileSekolah("hasan");
        
//        saya.setNama("Muhammad Khusnul Hasan");
        saya.setUmur(20);
        saya.setBaju("Jersey Real Madrid");
        saya.setCelana("Jeans");
                
        System.out.println(hasan.getNama());
        System.out.println("Saya sekarang berumur "+saya.getUmur() +" tahun");
        System.out.println("Saya Sekarang Sedang Menggunakan "+saya.getBaju());
        System.out.println("Dan saya menggunakan celana "+saya.getCelana());
        
        hasan.setUmur(20);
        System.out.println("Umur saya " +hasan.getUmur());
        
        hasan.setNis("15.11.9233");
        System.out.println("Nis Saya " +hasan.getNis());
    }
}
