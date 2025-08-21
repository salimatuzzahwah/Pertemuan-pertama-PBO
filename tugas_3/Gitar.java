/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_3;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Gitar extends diPetik {

    public static void main(String args[]) {
        Gitar mini = new Gitar();
        mini.setCaraMainkan("di petik");
        mini.setJenisBahan("Aluminium");
        mini.setJumlahSenar(6);
        mini.setNamaAlatMusik("Gitar");

        System.out.println("-- Informasi dari CLASS AlatMusik --");
        System.out.println("Nama Alat Musik :" + mini.getNamaAlatMusik());
        System.out.println("Cara Mainkan Gitar :" + mini.getCaraMainkan());
        
        System.out.println("-- Informasi dari CLASS diPetik --");
        System.out.println("Jenis Bahan Gitar :" + mini.getJenisBahan());
        System.out.println("Jumlah Senar Gitar :" + mini.getJumlahSenar());

    }

}
