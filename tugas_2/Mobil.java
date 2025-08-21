/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_2;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Mobil extends Kendaraan {

    /**
     * @return the WarnaMobil
     */
    protected String getWarnaMobil() {
        return WarnaMobil;
    }

    /**
     * @param WarnaMobil the WarnaMobil to set
     */
    protected void setWarnaMobil(String WarnaMobil) {
        this.WarnaMobil = WarnaMobil;
    }

    /**
     * @return the JumlahPintu
     */
    protected int getJumlahPintu() {
        return JumlahPintu;
    }

    /**
     * @param JumlahPintu the JumlahPintu to set
     */
    protected void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    /**
     * @return the Kepemilikan
     */
    protected String getKepemilikan() {
        return Kepemilikan;
    }

    /**
     * @param Kepemilikan the Kepemilikan to set
     */
    protected void setKepemilikan(String Kepemilikan) {
        this.Kepemilikan = Kepemilikan;
    }
    private String WarnaMobil;
    private int JumlahPintu;
    private String Kepemilikan;
   
}
