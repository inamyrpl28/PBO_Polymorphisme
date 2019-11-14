/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author LENOVO
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang += ((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf dia = new Staf();
        Direktur amy = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf =" +pg.hitungGaji(dia));
        System.out.println("Gaji yang dibayarkan kepada Direktur =" +pg.hitungGaji(amy));
    }
}
