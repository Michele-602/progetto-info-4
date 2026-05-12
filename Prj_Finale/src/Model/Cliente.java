
package Model;

import java.util.ArrayList;

public class Cliente {

    private String sesso;
    private int eta;

    private String nome;
    private String cognome;

    private int codCliente;

    private ArrayList<Recensione> recensioni;

    public Cliente(String sesso,
                   int eta,
                   String nome,
                   String cognome,
                   int codCliente) {

        setSesso(sesso);
        setEta(eta);

        this.nome = nome;
        this.cognome = cognome;

        setCodCliente(codCliente);

        recensioni = new ArrayList<>();
    }

    // =========================
    // GETTER
    // =========================

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

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }

    // =========================
    // SETTER
    // =========================

    public void setSesso(String sesso) {

        if (sesso != null &&
            (sesso.equalsIgnoreCase("M")
            || sesso.equalsIgnoreCase("F"))) {

            this.sesso = sesso.toUpperCase();
        }
        else {
            this.sesso = "N.D.";
        }
    }

    public void setEta(int eta) {

        if (eta >= 0 && eta <= 120) {
            this.eta = eta;
        }
        else {
            this.eta = 0;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodCliente(int codCliente) {

        if (codCliente > 0) {
            this.codCliente = codCliente;
        }
        else {
            this.codCliente = 0;
        }
    }

    // =========================
    // METODI
    // =========================

    public void aggiungiRecensione(Recensione r) {
        recensioni.add(r);
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        return "CLIENTE\n"
                + "CODICE   : " + codCliente + "\n"
                + "NOME     : " + nome + "\n"
                + "COGNOME  : " + cognome + "\n"
                + "SESSO    : " + sesso + "\n"
                + "ETA      : " + eta + "\n"
                + "RECENSIONI SCRITTE : "
                + recensioni.size();
    }
}

