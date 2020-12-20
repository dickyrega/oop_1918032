/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author hp
 */
public class Listrik extends Pengeluaran_Bulanan{
    double uang = 50000,bayar,a;
    
     double Biaya(){
        biaya = (uang*bulan);
        return biaya;
    }
    @Override
    double BiayaBulanan(){
        a = (Biaya()+7000);
        return a;
    }
    double kembalian(){
        kembali = bayar - BiayaBulanan();
        return kembali;
    }
}


