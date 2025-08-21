/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1.tugas_1;

/**
 *
 * @author Salimatuz Zahwah
 */
public class Mamalia extends Hewan {

    /**
     * @return the CaraBerkembangBiak
     */
    protected String getCaraBerkembangBiak() {
        return CaraBerkembangBiak;
    }

    /**
     * @param CaraBerkembangBiak the CaraBerkembangBiak to set
     */
    protected void setCaraBerkembangBiak(String CaraBerkembangBiak) {
        this.CaraBerkembangBiak = CaraBerkembangBiak;
    }

    /**
     * @return the HewanYangMenghasilkan
     */
    protected String getHewanYangMenghasilkan() {
        return HewanYangMenghasilkan;
    }

    /**
     * @param HewanYangMenghasilkan the HewanYangMenghasilkan to set
     */
    protected void setHewanYangMenghasilkan(String HewanYangMenghasilkan) {
        this.HewanYangMenghasilkan = HewanYangMenghasilkan;
    }

    /**
     * @return the Habitat
     */
    protected String getHabitat() {
        return Habitat;
    }

    /**
     * @param Habitat the Habitat to set
     */
    protected void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
   private String CaraBerkembangBiak;
   private String HewanYangMenghasilkan;
   private String Habitat;
   
    
    
}
