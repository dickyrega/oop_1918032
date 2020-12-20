/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Poliorfisme_dan_Exception;

/**
 *
 * @author hp
 */
public class Uang_Asuransi extends Pengeluaran{
    double uang = 70000,bayar, a;
    
     double Biaya(){
        biaya = (uang*bulan);
        return biaya;
    }
    
    @Override
    public double BiayaBulanan(){
        a = (Biaya()- 15000);
        return a;
    }
    
    @Override
    public double BiayaBulanan(double a){   
        return 0;
    }
    
    double kembalian(){
        kembali = bayar - BiayaBulanan();
        return kembali;
    }
}

