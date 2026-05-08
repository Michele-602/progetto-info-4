package Controller;

import Model.Cliente;
import Model.Prodotto;
import Model.Recensione;
public class Main {

    public static void main(String[] args) {

        /*Gestore g = new Gestore();

        g.leggiFile("dati.csv");

        System.out.println("RECENSIONI:");

        for(Recensione r : g.getRecensioni()) {

            System.out.println(r);
            System.out.println("");
        }*/
        
      /*  Cliente c1 = new Cliente("M", 30, "Mario", "Rossi", 1);
        Cliente c2 = new Cliente("F", 25, "Anna", "Bianchi", 2);

        // PRODOTTO
        Prodotto p = new Prodotto("Smartphone X", 1001, 0);

        // RECENSIONI
        Recensione r1 = new Recensione(5, "Ottimo prodotto", "R1", c1, p);
        Recensione r2 = new Recensione(2, "Pessimo", "R2", c2, p);
        Recensione r3 = new Recensione(4, "Buono", "R3", c1, p);

        // AGGIUNTA RECENSIONI AL PRODOTTO
        p.getRecensioni().add(r1);
        p.getRecensioni().add(r2);
        p.getRecensioni().add(r3);

        // TEST METODI

        System.out.println("=== TUTTE LE RECENSIONI ===");
        for (Recensione r : p.getRecensioni()) {
            System.out.println(r.getTesto() + " - " + r.getStelle() + " stelle");
        }

        System.out.println("\n=== RECENSIONI 5 STELLE ===");
        for (Recensione r : p.trovaRecensione(5)) {
            System.out.println(r.getTesto());
        }

        System.out.println("\n=== RECENSIONI POSITIVE ===");
        for (Recensione r : p.recPos()) {
            System.out.println(r.getTesto() + " (" + r.getStelle() + ")");
        }

        System.out.println("\n=== RECENSIONI NEGATIVE ===");
        for (Recensione r : p.recNeg()) {
            System.out.println(r.getTesto() + " (" + r.getStelle() + ")");
        }

        System.out.println("\n=== RECENSIONI DI UN CLIENTE ===");
        for (Recensione r : p.recCliente(c1)) {
            System.out.println(r.getTesto() + " di " + r.getCliente().getNome());
        }

        System.out.println("\n=== CERCA PER CODICE RECENSIONE ===");
        Recensione trovata = p.recCOdice("R2");
        if (trovata != null) {
            System.out.println("Trovata: " + trovata.getTesto());
        } else {
            System.out.println("Non trovata");
        }

        System.out.println("\n=== TO STRING PRODOTTO ===");
        System.out.println(p);*/
    }
}