/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nardom
 */
public class Cliente {

       private String sesso;
    private int eta;
    private String nome;
    private String cognome;
     private int codCliente;

    public Cliente(String sesso, int eta, String nome, String cognome, int codCliente) {
        this.sesso = sesso;
        this.eta = eta;
        this.nome = nome;
        this.cognome = cognome;
        this.codCliente = codCliente;
    }

    public String getSesso() {
        return sesso;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
     
   
   
}
