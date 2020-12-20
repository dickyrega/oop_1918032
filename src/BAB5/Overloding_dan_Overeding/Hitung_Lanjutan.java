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
public class Hitung_Lanjutan extends Belanja_Bulanan{
    
    @Override
    public double HitungUangBulanan(double hari, double bulan)
    {
       return (hari + bulan);       //tabungan
    }  
}
