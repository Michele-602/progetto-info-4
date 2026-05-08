/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author canellis
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
   
    public ArrayList<Recensione> trovaRecensione(int nstelle){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()==nstelle) b.add(x);
               
        }
       
           return b;
    }
    public ArrayList<Recensione> recPos(){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()<=3) b.add(x);
               
        }
       
           return b;
    }
    public ArrayList<Recensione> recNeg(){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()>=3) b.add(x);
               
        }
       
           return b;
    }
    public ArrayList<Recensione> recCliente(Cliente c){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getCliente()==c)  b.add(x);
               
        }
       
           return b;
    }
    public Recensione recCOdice(String codice){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getIdRecensione()==codice)   return x;
           
        }
        return null;
     }  

@Override
public String toString() {
    String s = "=== SCHEDA PRODOTTO ===\n";
    s = s + "NOME   : " + nome + "\n";
    s = s + "CODICE : " + codice + "\n";
    s = s + "MEDIA  : " + medVal + " / 5.0\n";
    s = s + "-----------------------\n";
    s = s + "ELENCO RECENSIONI:\n";
   
    if (recensioni.isEmpty()) {
        s = s + "Nessuna recensione presente.\n";
    } else {
        for (Recensione r : recensioni) {
            // Aggiungiamo Nome e Cognome nel riepilogo del prodotto
            s = s + "[" + r.getIdRecensione() + "] Scritta da: "
                  + r.getCliente().getNome() + " " + r.getCliente().getCognome() + "\n";
            s = s + r.toString() + "\n"; // Chiama il toString della recensione (quello con le stelle)
            s = s + "---------------------------\n";
        }
    }
   
    s = s + "=======================";
    return s;
}

   
   
}