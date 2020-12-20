/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Enkapsulasi;

/**
 *
 * @author hp
 */
public class HitungBalok {
    public double panjang;
    public double lebar;
    public double tinggi;
    double volume;
    
    //method
    private double volumeBalok(){
        return panjang * lebar * tinggi;
    }
    
    public double tampilBalok(){
        return volumeBalok();
    }
}
