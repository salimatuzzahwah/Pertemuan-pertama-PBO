/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_2;

/**
 *
 * @author Salimatuz Zahwah
 */
public class MobilPemerintah extends Mobil {
    
    public static void main (String args[]){
    MobilPemerintah besar = new MobilPemerintah();
    besar.setJumlahPintu(5);
    besar.setWarnaMobil("Grey");
    besar.setKepemilikan("Ketua DPR");
    besar.setMerk("Pajero Sport");
    besar.setJenisBahanBakar("Pertamax Turbo");
   
    
        System.out.println("Status Kepemilikan :"+besar.getKepemilikan()); //class mobil
        System.out.println("Merk Mobil :"+besar.getMerk()); //class kendaraan
        System.out.println("Warna Mobil :"+besar.getWarnaMobil()); //class mobil
        System.out.println("Jumlah Pintu Mobil DPR :"+besar.getJumlahPintu());//dari Class mobil
        System.out.println("Jenis Bahan Bakar Mobil :"+besar.getJenisBahanBakar()); //dari class kendaraan
    
}
}
