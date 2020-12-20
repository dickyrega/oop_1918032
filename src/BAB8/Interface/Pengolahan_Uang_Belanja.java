/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author hp
 */
public class Pengolahan_Uang_Belanja implements belanja_bulanan{

    @Override
    public String bulanGanjil() {
        return "Membayar Uang sekolah,Uang Listrik, dan Uang Air";
    }

    @Override
    public String bulanGenap() {
        return "Membayar Uang Pajak,Uang Les, dan Uang BPJS";
    }

    @Override
    public String Identitas1() {
        return "Dicky Rega Firmansyah";
    }

    @Override
    public String Identitas2() {
        return "BNI 19180321918032";
    }
    @Override
    public String Identitas3() {
        return "WA 083869100014";
    }

    @Override
    public String Identitas4() {
        return "BCA 45643737878";
    }

    @Override
    public String Identitas5() {
        return "WA 0835346588394";
    }
}
