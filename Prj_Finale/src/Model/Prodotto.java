
package Model;

import java.util.ArrayList;

public class Prodotto {

    private String nome;
    private int codice;

    private ArrayList<Recensione> recensioni;

    public Prodotto(String nome, int codice) {

        this.nome = nome;
        this.codice = codice;

        recensioni = new ArrayList<>();
    }

    // =========================
    // GETTER
    // =========================

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }

    // =========================
    // SETTER
    // =========================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    // =========================
    // METODI
    // =========================

    public void aggiungiRecensione(Recensione r) {
        recensioni.add(r);
    }

    public double calcolaMedia() {

        if (recensioni.isEmpty()) {
            return 0;
        }

        double somma = 0;

        for (Recensione r : recensioni) {
            somma += r.getStelle();
        }

        return somma / recensioni.size();
    }

    public ArrayList<Recensione> recensioniPositive() {

        ArrayList<Recensione> lista = new ArrayList<>();

        for (Recensione r : recensioni) {

            if (r.getStelle() >= 4) {
                lista.add(r);
            }
        }

        return lista;
    }

    public ArrayList<Recensione> recensioniNegative() {

        ArrayList<Recensione> lista = new ArrayList<>();

        for (Recensione r : recensioni) {

            if (r.getStelle() <= 2) {
                lista.add(r);
            }
        }

        return lista;
    }

    public Recensione cercaRecensione(String id) {

        for (Recensione r : recensioni) {

            if (r.getIdRecensione().equals(id)) {
                return r;
            }
        }

        return null;
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

        String s = "";

        s += "========================\n";
        s += "PRODOTTO\n";
        s += "========================\n";

        s += "NOME           : " + nome + "\n";
        s += "CODICE         : " + codice + "\n";
        s += "MEDIA VOTI     : "
                + String.format("%.2f", calcolaMedia())
                + "\n";

        s += "NUM RECENSIONI : "
                + recensioni.size()
                + "\n";

        s += "========================\n";

        for (Recensione r : recensioni) {

            s += r.toString();
            s += "------------------------\n";
        }

        return s;
    }
}

