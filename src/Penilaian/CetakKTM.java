/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author hp
 */
public class CetakKTM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNIM("1818097");
        mhs.dataNama("Mutiara Sholawati");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2018");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ mhs.cetakNIM());
        System.out.println("Nama : "+ mhs.cetakNama());
        System.out.println("Prodi : "+ mhs.cetakProdi());
        System.out.println("Angkatan : "+ mhs.cetakAngkatan());
 }
  
}
