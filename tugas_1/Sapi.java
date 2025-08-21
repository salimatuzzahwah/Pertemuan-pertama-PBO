/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_1;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Sapi extends Mamalia {

    public static void main(String args[]) {
        Sapi Betina = new Sapi();
        Betina.setHabitat("Kandang");
        Betina.setCaraBerkembangBiak("Perkawinan");
        Betina.setHewanYangMenghasilkan("Susu,daging");
        Betina.setCaraBergerak("Berjalan");
        Betina.setCaraBernafas("Dengan Paru-Paru");
        Betina.setJenisHewan("Mamalia");
        Betina.setJenisMakanan("Herbivora");

        System.out.println("-- Informasi dari CLASS Mamalia --");
        System.out.println("Habitat Sapi :" + Betina.getHabitat());
        System.out.println("Cara Berkembang Biak Sapi :" + Betina.getCaraBerkembangBiak());
        System.out.println("Hewan yang menghasilkan :" + Betina.getHewanYangMenghasilkan());

        System.out.println("-- Informasi dari CLASS Hewan --");
        System.out.println("Cara bergerak sapi :" + Betina.getCaraBergerak());
        System.out.println("Cara bernafas sapi :" + Betina.getCaraBernafas());
        System.out.println("Jenis hewan :" + Betina.getJenisHewan());
        System.out.println("Jenis Makananannya :" + Betina.getJenisMakanan());
    }

}
