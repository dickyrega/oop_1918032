/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Inheritance;

/**
 *
 * @author hp
 */
public class belanja_bulan_genap {
    double uang;
    double ulistrik,usekolah,uharian,uasuransi; //u = uang
    
    
    double bulanGenap(){
        uang = ulistrik+usekolah+uharian+(uasuransi*2);
        return uang;
    }
}
