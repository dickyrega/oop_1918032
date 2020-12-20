/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pengolahan_Uang_Belanja olah = new Pengolahan_Uang_Belanja();
        
        System.out.println("Masukan Nama Lengkap = " +olah.Identitas1());
        System.out.println("Masukan No rekening  = " +olah.Identitas2());
        System.out.println("Masukan No WhatsApp  = " +olah.Identitas3());
        System.out.println("Kebutuhan Bulan Ganjil = " +olah.bulanGanjil());
        System.out.println("==============================================");
        
        System.out.println("Masukan Nama Lengkap = " +olah.Identitas1());
        System.out.println("Masukan No rekening  = " +olah.Identitas4());
        System.out.println("Masukan No WhatsApp  = " +olah.Identitas5());
        System.out.println("Kebutuhan Bulan Genap = " +olah.bulanGenap());
        System.out.println("==============================================");
    } 
}
