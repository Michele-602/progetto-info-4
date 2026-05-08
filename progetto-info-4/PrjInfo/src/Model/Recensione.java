/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nardom
 */
public class Recensione {
    private int stelle;
    private String testo;
    private String idRecensione;

    public Recensione(int stelle, String testo) {
        this.stelle = stelle;
        this.testo = testo;
    }

    public int getStelle() {
        return stelle;
    }

    public String getTesto() {
        return testo;
    }

    public void setStelle(int stelle) {
        this.stelle = stelle;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Recensione{" + "stelle=" + stelle + ", testo=" + testo + '}';
    }
   
   
   
   
   
}
