/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keuangan;

/**
 *
 * @author hp
 */
public class Pengolahan_Belanja_bulanan {

    int uang_makan;
    int uang_jajan;
    int uang_listrik;

        
        void setPengolahan_Belanja_bulanan()
        {
          uang_makan = 2000000;
          uang_jajan = 1000000;
          uang_listrik = 500000;
        }

        String belanja()
        {
            return "Agar uang pengeluaran keluarga bisa lebih tertata dan lebih hemat";
        }

    public static void main(String[] args) {
  
            Pengolahan_Belanja_bulanan pembukuan;
            pembukuan = new Pengolahan_Belanja_bulanan();
            
            System.out.println("pembukuan keluarga = "+pembukuan.belanja());
        
            pembukuan.setPengolahan_Belanja_bulanan();
            System.out.println("jumlah pengeluaran uang makan = "+pembukuan.uang_makan);
            System.out.println("jumlah pengeluaran uang jajan = "+pembukuan.uang_jajan);
            System.out.println("jumlah pengeluaran uang listrik = "+pembukuan.uang_listrik);  
    }
    
}
