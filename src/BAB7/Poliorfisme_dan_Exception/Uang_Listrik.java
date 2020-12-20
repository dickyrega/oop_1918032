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
public class Uang_Listrik extends Pengeluaran{
    double uang = 50000,bayar,b;
    
     double Biaya(){
        biaya = (uang*bulan);
        return biaya;
    }

    @Override
    public double BiayaBulanan(double a){
        b = (Biaya()+a);
        return b;
    }
    
    @Override
    public double BiayaBulanan(){
       return 0;
    }
    
    double kembalian(){
        kembali = bayar - b;
        return kembali;
    }
}


