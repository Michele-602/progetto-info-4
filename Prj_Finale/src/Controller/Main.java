package Controller;

import Model.Cliente;
import Model.Prodotto;
import Model.Recensione;

public class Main {

    public static void main(String[] args) {

        Gestore g = new Gestore();

        // =========================
        // LETTURA FILE CSV
        // =========================

        g.leggiFile("dati.csv");

        // =========================
        // TEST GENERALE
        // =========================

        System.out.println("=================================");
        System.out.println("DATI GENERALI");
        System.out.println("=================================");

        System.out.println("NUMERO CLIENTI   : "
                + g.getClienti().size());

        System.out.println("NUMERO PRODOTTI  : "
                + g.getProdotti().size());

        System.out.println("NUMERO RECENSIONI: "
                + g.getRecensioni().size());

        // =========================
        // ELENCO CLIENTI
        // =========================

        System.out.println("\n=================================");
        System.out.println("ELENCO CLIENTI");
        System.out.println("=================================");

        for (Cliente c : g.getClienti()) {

            System.out.println(c);

            System.out.println("----------------------");
        }

        // =========================
        // ELENCO PRODOTTI
        // =========================

        System.out.println("\n=================================");
        System.out.println("ELENCO PRODOTTI");
        System.out.println("=================================");

        for (Prodotto p : g.getProdotti()) {

            System.out.println(
                    "NOME: " + p.getNome());

            System.out.println(
                    "CODICE: " + p.getCodice());

            System.out.println(
                    "MEDIA: " + p.calcolaMedia());

            System.out.println(
                    "NUM RECENSIONI: "
                    + p.getRecensioni().size());

            System.out.println("----------------------");
        }

        // =========================
        // CERCA CLIENTE
        // =========================

        System.out.println("\n=================================");
        System.out.println("TEST CERCA CLIENTE");
        System.out.println("=================================");

        Cliente cliente =
                g.cercaCliente(1);

        if (cliente != null) {

            System.out.println(cliente);

            // getter

            System.out.println("\nGETTER CLIENTE");

            System.out.println(
                    "Nome: "
                    + cliente.getNome());

            System.out.println(
                    "Cognome: "
                    + cliente.getCognome());

            System.out.println(
                    "Eta: "
                    + cliente.getEta());

            System.out.println(
                    "Sesso: "
                    + cliente.getSesso());

            System.out.println(
                    "Codice: "
                    + cliente.getCodCliente());
        }

        // =========================
        // RECENSIONI CLIENTE
        // =========================

        System.out.println("\n=================================");
        System.out.println("RECENSIONI CLIENTE");
        System.out.println("=================================");

        for (Recensione r :
                cliente.getRecensioni()) {

            System.out.println(r);

            System.out.println("----------------------");
        }

        // =========================
        // CERCA PRODOTTO
        // =========================

        System.out.println("\n=================================");
        System.out.println("TEST CERCA PRODOTTO");
        System.out.println("=================================");

        Prodotto prodotto =
                g.cercaProdotto(1001);

        if (prodotto != null) {

            System.out.println(prodotto);

            // getter

            System.out.println("\nGETTER PRODOTTO");

            System.out.println(
                    "Nome: "
                    + prodotto.getNome());

            System.out.println(
                    "Codice: "
                    + prodotto.getCodice());

            System.out.println(
                    "Media voti: "
                    + prodotto.calcolaMedia());
        }

        // =========================
        // RECENSIONI POSITIVE
        // =========================

        System.out.println("\n=================================");
        System.out.println("RECENSIONI POSITIVE");
        System.out.println("=================================");

        for (Recensione r :
                prodotto.recensioniPositive()) {

            System.out.println(r);

            System.out.println("----------------------");
        }

        // =========================
        // RECENSIONI NEGATIVE
        // =========================

        System.out.println("\n=================================");
        System.out.println("RECENSIONI NEGATIVE");
        System.out.println("=================================");

        for (Recensione r :
                prodotto.recensioniNegative()) {

            System.out.println(r);

            System.out.println("----------------------");
        }

        // =========================
        // CERCA RECENSIONE
        // =========================

        System.out.println("\n=================================");
        System.out.println("CERCA RECENSIONE");
        System.out.println("=================================");

        Recensione recensione =
                prodotto.cercaRecensione(
                        "REV0001"
                );

        if (recensione != null) {

            System.out.println(recensione);

            // getter recensione

            System.out.println("\nGETTER RECENSIONE");

            System.out.println(
                    "ID: "
                    + recensione.getIdRecensione());

            System.out.println(
                    "Stelle: "
                    + recensione.getStelle());

            System.out.println(
                    "Testo: "
                    + recensione.getTesto());

            System.out.println(
                    "Cliente: "
                    + recensione.getCliente()
                            .getNome());

            System.out.println(
                    "Prodotto: "
                    + recensione.getProdotto()
                            .getNome());
        }

        // =========================
        // TUTTE LE RECENSIONI
        // =========================

        System.out.println("\n=================================");
        System.out.println("TUTTE LE RECENSIONI");
        System.out.println("=================================");

        for (Recensione r :
                g.getRecensioni()) {

            System.out.println(r);

            System.out.println("----------------------");
        }

        // =========================
        // TEST SETTER
        // =========================

        System.out.println("\n=================================");
        System.out.println("TEST SETTER");
        System.out.println("=================================");

        recensione.setTesto(
                "Testo modificato");

        recensione.setStelle(2);

        System.out.println(recensione);

        // =========================
        // FINE
        // =========================

        System.out.println("\n=================================");
        System.out.println("FINE TEST");
        System.out.println("=================================");
    }
}

