package Controller;

import Model.Cliente;
import Model.Prodotto;
import Model.Recensione;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Gestore {

    private ArrayList<Cliente> clienti;
    private ArrayList<Prodotto> prodotti;
    private ArrayList<Recensione> recensioni;

    public Gestore() {

        clienti = new ArrayList<>();
        prodotti = new ArrayList<>();
        recensioni = new ArrayList<>();
    }

    // =========================
    // LETTURA FILE CSV
    // =========================
    public void leggiFile(String percorso) {

        try {

            BufferedReader br
                    = new BufferedReader(
                            new FileReader(percorso));

            String riga;

            // salto intestazione
            br.readLine();

            while ((riga = br.readLine()) != null) {

                String[] dati
                        = riga.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                // =========================
                // DATI CSV
                // =========================
                String idRecensione = dati[0];

                String nome = dati[1];
                String cognome = dati[2];

                int codCliente
                        = Integer.parseInt(dati[3]);

                String sesso = dati[4];

                int eta
                        = Integer.parseInt(dati[5]);

                String nomeProdotto = dati[6];

                int codProdotto
                        = Integer.parseInt(dati[7]);

                String feedback
                        = dati[8].replace("\"", "");

                int stelle
                        = Integer.parseInt(dati[9]);

                // =========================
                // CLIENTE
                // =========================
                Cliente cliente
                        = cercaCliente(codCliente);

                if (cliente == null) {

                    cliente = new Cliente(
                            sesso,
                            eta,
                            nome,
                            cognome,
                            codCliente
                    );

                    clienti.add(cliente);
                }

                // =========================
                // PRODOTTO
                // =========================
                Prodotto prodotto = cercaProdotto(codProdotto);

                if (prodotto != null && !prodotto.getNome().equalsIgnoreCase(nomeProdotto)) {

                    prodotto = null;
                }

                if (prodotto == null) {
                    prodotto = new Prodotto(nomeProdotto, codProdotto);
                    prodotti.add(prodotto);
                }

                // =========================
                // RECENSIONE
                // =========================
                Recensione recensione
                        = new Recensione(
                                stelle,
                                feedback,
                                idRecensione,
                                cliente,
                                prodotto
                        );

                recensioni.add(recensione);

                // collegamenti
                cliente.aggiungiRecensione(recensione);

                prodotto.aggiungiRecensione(recensione);
            }

            br.close();

        } catch (Exception e) {

            System.out.println(
                    "Errore lettura file"
            );

            e.printStackTrace();
        }
    }

    // =========================
    // CERCA CLIENTE
    // =========================
    public Cliente cercaCliente(int codice) {

        for (Cliente c : clienti) {

            if (c.getCodCliente() == codice) {
                return c;
            }
        }

        return null;
    }

    // =========================
    // CERCA PRODOTTO
    // =========================
    public Prodotto cercaProdotto(int codice) {
        for (Prodotto p : prodotti) {
            if (p.getCodice() == codice) {
                return p;
            }
        }
        return null;
    }

    // =========================
    // GETTER
    // =========================
    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }

    public Prodotto prodottoTop() {

        Prodotto top = null;
        double max = 0;

        for (Prodotto p : prodotti) {

            double media = p.calcolaMedia();

            if (media > max) {
                max = media;
                top = p;
            }
        }

        return top;
    }

    public Recensione cercaRecensione(String id) {

        for (Recensione r : recensioni) {

            if (r.getIdRecensione().equals(id)) {
                return r;
            }
        }

        return null;
    }

    public void aggiornaRecensione(String id, String nuovoTesto, int nuoveStelle) {
        for (Recensione r : recensioni) {
            if (r.getIdRecensione().equals(id)) {
                r.setTesto(nuovoTesto);
                r.setStelle(nuoveStelle);
                for (Recensione rp : r.getProdotto().getRecensioni()) {
                    if (rp.getIdRecensione().equals(id)) {
                        rp.setTesto(nuovoTesto);
                        rp.setStelle(nuoveStelle);
                    }
                }
                break;
            }
        }
    }

    public void salvaFile(String percorso) {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(percorso));

            bw.write("id_recensione,nome_cliente,cognome,codice_cliente,sesso,eta,nome_prodotto,codice_prodotto,feedback,stelle\n");

            for (Recensione r : recensioni) {

                bw.write(
                        r.getIdRecensione() + ","
                        + r.getCliente().getNome() + ","
                        + r.getCliente().getCognome() + ","
                        + r.getCliente().getCodCliente() + ","
                        + r.getCliente().getSesso() + ","
                        + r.getCliente().getEta() + ","
                        + r.getProdotto().getNome() + ","
                        + r.getProdotto().getCodice() + ","
                        + "\"" + r.getTesto() + "\","
                        + r.getStelle() + "\n"
                );
            }

            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void aggiungiRecensione(Recensione r) {

        recensioni.add(r);

        r.getCliente().aggiungiRecensione(r);
        r.getProdotto().aggiungiRecensione(r);
    }
}
