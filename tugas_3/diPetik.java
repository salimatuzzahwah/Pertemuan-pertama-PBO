/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_3;

/**
 *
 * @author Salimatuz Zahwah
 */
public class diPetik extends AlatMusik{

    /**
     * @return the JumlahSenar
     */
    protected int getJumlahSenar() {
        return JumlahSenar;
    }

    /**
     * @param JumlahSenar the JumlahSenar to set
     */
    protected void setJumlahSenar(int JumlahSenar) {
        this.JumlahSenar = JumlahSenar;
    }

    /**
     * @return the JenisBahan
     */
    protected String getJenisBahan() {
        return JenisBahan;
    }

    /**
     * @param JenisBahan the JenisBahan to set
     */
    protected void setJenisBahan(String JenisBahan) {
        this.JenisBahan = JenisBahan;
    }
    private int JumlahSenar;
    private String JenisBahan;
    
}
