package Controller;

import Model.Cliente;
import Model.Prodotto;
import Model.Recensione;

import java.io.*;
import java.util.ArrayList;

public class Gestore {

    private ArrayList<Recensione> recensioni;

    public Gestore() {
        recensioni = new ArrayList<>();
    }

    public void leggiFile(String percorso) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(percorso));

            String riga;

            // salto intestazione
            br.readLine();

            while ((riga = br.readLine()) != null) {

                String[] dati = riga.split(",");

                String idRecensione = dati[0];

                String nome = dati[1];
                String cognome = dati[2];

                int codCliente = Integer.parseInt(dati[3]);

                String sesso = dati[4];

                int eta = Integer.parseInt(dati[5]);

                String nomeProdotto = dati[6];

                int codProdotto = Integer.parseInt(dati[7]);

                String feedback = dati[8].replace("\"", "");

                int stelle = Integer.parseInt(dati[9]);

                Cliente cliente = new Cliente(
                        sesso,
                        eta,
                        nome,
                        cognome,
                        codCliente
                );

                Prodotto prodotto = new Prodotto(
                        nomeProdotto,
                        codProdotto,
                        0
                );

                Recensione recensione = new Recensione(
                        stelle,
                        feedback,
                        idRecensione,
                        cliente,
                        prodotto
                );

                recensioni.add(recensione);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Errore lettura file");        }
         }

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }
}