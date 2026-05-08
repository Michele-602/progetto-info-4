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
    
    ArrayList<Recensione> trovaRecensione(int nstelle){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()==nstelle) b.add(x);
                
        }
        
           return b;
    }
    ArrayList<Recensione> recPos(){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()<=3) b.add(x);
                
        }
        
           return b;
    }
    ArrayList<Recensione> recNeg(){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getStelle()>=3) b.add(x);
                
        }
        
           return b;
    }
    ArrayList<Recensione> recCliente(Cliente c){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getCliente()==c)  b.add(x);
                
        }
        
           return b;
    }
    Recensione recCOdice(String codice){
        ArrayList<Recensione> b = new ArrayList();
        for(Recensione x: recensioni){
            if(x.getIdRecensione()==codice)   return x;
           
        }
        return null;
     }   

@Override
public String toString() {
    // Intestazione prodotto
    String output = "=== SCHEDA PRODOTTO ===\n";
    output += "NOME   : " + nome + "\n";
    output += "CODICE : " + codice + "\n";
    output += "MEDIA  : " + medVal + " / 5.0\n";
    output += "-----------------------\n";
    output += "ELENCO RECENSIONI:\n\n";

    if (recensioni.isEmpty()) {
        output += "   (Nessuna recensione disponibile)\n";
    } else {
        for (Recensione r : recensioni) {
            // Qui Java chiama il toString() di Recensione che abbiamo fatto prima
            output += r.toString() + "\n";
            output += "---------------------------\n"; // Separatore tra recensioni
        }
    }

    output += "=======================";
    return output;
}
   
   
}
