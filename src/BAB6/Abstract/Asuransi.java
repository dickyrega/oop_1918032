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
public class Asuransi extends Pengeluaran_Bulanan{
    double uang = 70000,bayar, a;
    
     double Biaya(){
        biaya = (uang*bulan);
        return biaya;
    }
    
    @Override
    double BiayaBulanan(){
        a = (Biaya()- 15000);
        return a;
    }
    
    double kembalian(){
        kembali = bayar - BiayaBulanan();
        return kembali;
    }
}

