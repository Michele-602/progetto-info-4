package Model;

public class Recensione {

      private int stelle;
    private String testo;
    private String idRecensione;
    private Cliente cliente;
    private Prodotto prodotto;

    public Recensione(int stelle, String testo, String idRecensione, Cliente cliente, Prodotto prodotto) {
        setStelle(stelle);
        this.testo = (testo != null) ? testo : "Nessun commento";
        this.idRecensione = (idRecensione != null) ? idRecensione : "000";
        this.cliente = cliente;
        this.prodotto = prodotto;
    }

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

    public void setStelle(int stelle) {
 
        if (stelle < 1) {
            this.stelle = 1;
        } else if (stelle > 5) {
            this.stelle = 5;
        } else {
            this.stelle = stelle;
        }
    }

    public void setTesto(String testo) {
        this.testo = (testo != null && !testo.isEmpty()) ? testo : "Nessun commento";
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

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < stelle; i++) {
            s = s + "★";
        }
        for (int i = stelle; i < 5; i++) {
            s = s + "☆";
        }
       
     
        return "ID: " + idRecensione + "\n" +
               "VALUTAZIONE: " + s + "\n" +
               "CLIENTE: " + (cliente != null ? cliente.getNome() + " " + cliente.getCognome() : "Anonimo") + "\n" +
               "RECENSIONE: \"" + testo + "\"";
    }
   
   
}