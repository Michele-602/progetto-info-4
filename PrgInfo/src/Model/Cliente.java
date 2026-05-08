/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author canellis
 */
public class Cliente {
      private String sesso;
    private int eta;
    private String nome;
    private String cognome;
    private int codCliente;

    public Cliente(String sesso, int eta, String nome, String cognome, int codCliente) {
        setSesso(sesso);
        setEta(eta);
        this.nome = nome;
        this.cognome = cognome;
        setCodCliente(codCliente);
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

        if (sesso != null && (sesso.equalsIgnoreCase("M") || sesso.equalsIgnoreCase("F"))) {
            this.sesso = sesso.toUpperCase();
        } else {
            this.sesso = "N.D.";
        }
    }

    public void setEta(int eta) {

        if (eta >= 0 && eta <= 120) {
            this.eta = eta;
        } else {
            this.eta = 0;
        }
    }

    public void setCodCliente(int codCliente) {

        if (codCliente > 0) {
            this.codCliente = codCliente;
        } else {
            this.codCliente = 0;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
     
   
   
}
