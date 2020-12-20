/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.Overloding_dan_Overeding;

/**
 *
 * @author hp
 */
public class Belanja_Bulanan {
     
    public double HitungUangBulanan(double uang ,double jumlahbulan)
    {
        return (uang * jumlahbulan);     //uangasuransi
    }
    
    public double HitungUangBulanan(double Spp,double bayar,double potongan)
    {
        return(Spp * bayar) - potongan; //uangsekolah
    }
    
    public double HitungUangBulanan(double listrik, double uang,double diskon, double denda)
    {
        double hasil;
        hasil = (listrik * uang) * diskon;
        return(listrik * uang) - hasil + denda; //listrik
    }
    
}
