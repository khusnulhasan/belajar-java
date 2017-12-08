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
public class ProfileSekolah extends DataDiri {
    String nis;
    String wali;
    String kelas;
//    String nama;

    public ProfileSekolah(String nama) {
        super(nama);
    }

    public String getNis() {
        return nis;
    }
    
//    public void setNama(String nama){
//        this.nama = nama;
//    }
    
    
    
    @Override
    public String getNama(){
        return "kembalian dari anak class "+  nama;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getWali() {
        return wali;
    }

    public void setWali(String wali) {
        this.wali = wali;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

