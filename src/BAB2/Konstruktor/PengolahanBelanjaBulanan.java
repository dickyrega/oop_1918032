/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.Konstruktor;

/**
 *
 * @author hp
 */
public class PengolahanBelanjaBulanan {
    String barang;
    int jumlah;
    String alamat;
    String bulan;
    int tanggal;

    public PengolahanBelanjaBulanan() {
}
    void dbarang(String namabarang){         
        this.barang = namabarang;
    } 
    void djumlah(int jumlahbarang){         
        this.jumlah = jumlahbarang;
    }  
    void dalamat(String alamattujuan){         
        this.alamat = alamattujuan; 
    } 

    
    String barang(){         
            return barang; 
    } 
    int jumlah(){         
            return jumlah; 
    } 
    String alamat(){         
        return alamat; 
    }     
    int tanggal(){
        return tanggal;
    }
    String bulan(){
        return bulan;
    }
}




