

package Model;

public class Recensione {

    private int stelle;
    private String testo;
    private String idRecensione;

    private Cliente cliente;
    private Prodotto prodotto;

    public Recensione(int stelle,
                       String testo,
                       String idRecensione,
                       Cliente cliente,
                       Prodotto prodotto) {

        setStelle(stelle);

        this.testo = (testo != null && !testo.isEmpty())
                ? testo
                : "Nessun commento";

        this.idRecensione = idRecensione;

        this.cliente = cliente;
        this.prodotto = prodotto;
    }

    // =========================
    // GETTER
    // =========================

    public int getStelle() {
        return stelle;
    }

    public String getTesto() {
        return testo;
    }

    public String getIdRecensione() {
        return idRecensione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    // =========================
    // SETTER
    // =========================

    public void setStelle(int stelle) {

        if (stelle < 1) {
            this.stelle = 1;
        }
        else if (stelle > 5) {
            this.stelle = 5;
        }
        else {
            this.stelle = stelle;
        }
    }

    public void setTesto(String testo) {

        if (testo != null && !testo.isEmpty()) {
            this.testo = testo;
        }
        else {
            this.testo = "Nessun commento";
        }
    }

    public void setIdRecensione(String idRecensione) {
        this.idRecensione = idRecensione;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    // =========================
    // TOSTRING
    // =========================

    @Override
    public String toString() {

       /* String stelleGrafica = "";

        for (int i = 0; i < stelle; i++) {
            stelleGrafica += "★";
        }

        for (int i = stelle; i < 5; i++) {
            stelleGrafica += "☆";
        }*/
       String stelleGrafica = "";

        for (int i = 0; i < stelle; i++) {
            stelleGrafica += "*";
        }

        for (int i = stelle; i < 5; i++) {
            stelleGrafica += "-";
        }

        return "ID RECENSIONE : " + idRecensione + "\n"
                + "CLIENTE       : "
                + cliente.getNome() + " "
                + cliente.getCognome() + "\n"
                + "PRODOTTO      : "
                + prodotto.getNome() + "\n"
                + "VALUTAZIONE   : "
                + stelleGrafica + "\n"
                + "TESTO         : "
                + testo + "\n";
    }
}

