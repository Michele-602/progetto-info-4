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
    private Cliente cliente;
    private Prodotto prodotto;

    public Recensione(int stelle, String testo, String idRecensione, Cliente cliente, Prodotto prodotto) {
        this.stelle = stelle;
        this.testo = testo;
        this.idRecensione = idRecensione;
        this.cliente = cliente;
        this.prodotto = prodotto;
    }

    public int getStelle() {
        return stelle;
    }

    public void setStelle(int stelle) {
        this.stelle = stelle;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getIdRecensione() {
        return idRecensione;
    }

    public void setIdRecensione(String idRecensione) {
        this.idRecensione = idRecensione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }





@Override
public String toString() {
    String s = ""; 
    for (int i = 0; i < stelle; i++) {
        s = s + "★";
    }
    for (int i = stelle; i < 5; i++) {
        s = s + "☆";
    }
    
    // Usiamo \n per mandare a capo le informazioni
    return "ID: " + idRecensione + "\n" +
           "VALUTAZIONE: " + s + "\n" +
           "CLIENTE: " + cliente.getNome() + "\n" +
           "RECENSIONE: \"" + testo + "\"\n" +
           "---------------------------"; 
}
   
   
   
   
}
