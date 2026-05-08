/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nardom
 */
public class Prodotto {
    private String nome;
    private int codice;
     private double medVal;
    private ArrayList<Recensione> recensioni;

    public Prodotto(String nome, int codice, double medVal) {
        this.nome = nome;
        this.codice = codice;
        this.medVal = medVal;
        this.recensioni = new ArrayList();
    }
   
   

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public double getMedVal() {
        return medVal;
    }

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setMedVal(double medVal) {
        this.medVal = medVal;
    }

    public void setRecensioni(ArrayList<Recensione> recensioni) {
        this.recensioni = recensioni;
    }
   
   
   
}
