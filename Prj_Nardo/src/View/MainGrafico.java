/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Prodotto;
import javax.swing.table.DefaultTableModel;
import Controller.Gestore;
import Model.Prodotto;
import Model.Recensione;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author nardom
 */
public class MainGrafico extends javax.swing.JFrame {

    private Gestore gestore;
    private boolean loadingCombo = false;
    private Cliente utenteLoggato;

    public MainGrafico(Gestore g, Cliente utente) {
        initComponents();
        this.gestore = g;
        this.utenteLoggato = utente;

        this.setTitle("Sessione di: " + utenteLoggato.getNome() + " " + utenteLoggato.getCognome());

        caricaProdotti();
        aggiornaTabella("Tutti");
        txtDettagli.setText("Seleziona una recensione...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaRecensioni = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDettagli = new javax.swing.JTextArea();
        cmbProdotti = new javax.swing.JComboBox<>();
        lblMedia = new javax.swing.JLabel();
        lblGrafico = new javax.swing.JLabel();
        txtRicerca = new javax.swing.JTextField();
        lblTop = new javax.swing.JLabel();
        btnSalva = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnAggiungi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabellaRecensioni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabellaRecensioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaRecensioniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabellaRecensioni);

        txtDettagli.setColumns(20);
        txtDettagli.setRows(5);
        jScrollPane2.setViewportView(txtDettagli);

        cmbProdotti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProdotti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdottiActionPerformed(evt);
            }
        });

        lblMedia.setText("media-");

        lblGrafico.setText("stelle-");

        txtRicerca.setText("Cerca per cliente");
        txtRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRicercaActionPerformed(evt);
            }
        });
        txtRicerca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRicercaKeyReleased(evt);
            }
        });

        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop.setText("top prodotti:");
        lblTop.setBorder(new javax.swing.border.MatteBorder(null));

        btnSalva.setText("Salva");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        btnModifica.setText("Edit");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnAggiungi.setText("Agiungi");
        btnAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAggiungi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbProdotti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRicerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 91, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifica)
                    .addComponent(btnAggiungi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbProdotti, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        JFileChooser scelta = new JFileChooser();

        int risultato = scelta.showOpenDialog(this);

        if (risultato == JFileChooser.APPROVE_OPTION) {

            File fileScelto = scelta.getSelectedFile();
            gestore = new Gestore();
            gestore.leggiFile(fileScelto.getAbsolutePath());

            caricaProdotti();

            aggiornaTabella("Tutti");

            txtDettagli.setText("Seleziona una recensione...");

            Prodotto top = gestore.prodottoTop();

            if (top != null) {
                lblTop.setText("Top prodotto: " + top.getNome());
            } else {
                lblTop.setText("Top: nessun dato");
            }
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void tabellaRecensioniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaRecensioniMouseClicked
        int riga = tabellaRecensioni.getSelectedRow();

        if (riga >= 0) {

            String id = tabellaRecensioni.getValueAt(riga, 0).toString();

            Recensione trovata = null;

            for (Recensione r : gestore.getRecensioni()) {

                if (r.getIdRecensione().equals(id)) {
                    trovata = r;
                    break;
                }
            }

            if (trovata != null) {

                txtDettagli.setText(trovata.getTesto());

                String stelle = "";

                for (int i = 0; i < trovata.getStelle(); i++) {
                    stelle += "★";
                }

                for (int i = trovata.getStelle(); i < 5; i++) {
                    stelle += "☆";
                }

                lblGrafico.setText(stelle);
            }
        }
    }//GEN-LAST:event_tabellaRecensioniMouseClicked

    private void cmbProdottiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdottiActionPerformed
        if (loadingCombo) {
            return;
        }

        if (gestore == null || gestore.getRecensioni().isEmpty()) {
            return;
        }

        String selezionato
                = cmbProdotti.getSelectedItem().toString();

        aggiornaTabella(selezionato);
    }//GEN-LAST:event_cmbProdottiActionPerformed

    private void txtRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRicercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRicercaActionPerformed

    private void txtRicercaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRicercaKeyReleased
        String testo = txtRicerca.getText().toLowerCase();
        DefaultTableModel modello = (DefaultTableModel) tabellaRecensioni.getModel();
        modello.setRowCount(0);

        for (Recensione r : gestore.getRecensioni()) {
            String nomeCompleto = (r.getCliente().getNome() + " " + r.getCliente().getCognome()).toLowerCase();

            if (nomeCompleto.contains(testo)) {
                modello.addRow(new Object[]{
                    r.getIdRecensione(),
                    r.getCliente().getNome() + " " + r.getCliente().getCognome(),
                    r.getProdotto().getNome(),
                    r.getStelle()
                });
            }
        }
    }//GEN-LAST:event_txtRicercaKeyReleased

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed

        JFileChooser scelta = new JFileChooser();

        int risultato = scelta.showSaveDialog(this);

        if (risultato == JFileChooser.APPROVE_OPTION) {

            File file = scelta.getSelectedFile();

            int risposta = JOptionPane.showConfirmDialog(
                    this,
                    "Vuoi sovrascrivere il file?",
                    "Conferma",
                    JOptionPane.YES_NO_OPTION
            );

            if (risposta == JOptionPane.YES_OPTION) {

                gestore.salvaFile(file.getAbsolutePath());

                JOptionPane.showMessageDialog(
                        this,
                        "Salvataggio completato!"
                );
            }

        }
    }//GEN-LAST:event_btnSalvaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        int riga = tabellaRecensioni.getSelectedRow();
        if (riga >= 0) {
            String id = tabellaRecensioni.getValueAt(riga, 0).toString();
            Recensione r = gestore.cercaRecensione(id);

            if (r.getCliente().getCodCliente() == utenteLoggato.getCodCliente()) {
                try {
                    String nuovoTesto = txtDettagli.getText();

                    String inputVoto = JOptionPane.showInputDialog(this, "Modifica stelle (1-5):", r.getStelle());

                    if (inputVoto != null) {
                        int nuoveStelle = Integer.parseInt(inputVoto);
                        gestore.aggiornaRecensione(id, nuovoTesto, nuoveStelle);
                        aggiornaTabella(cmbProdotti.getSelectedItem().toString());
                        JOptionPane.showMessageDialog(this, "Recensione aggiornata!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Inserisci un numero valido per le stelle");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Puoi modificare solo le TUE recensioni!", "Permesso Negato", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleziona prima una recensione dalla tabella");
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiActionPerformed
        try {
            String prodottoNome = JOptionPane.showInputDialog(this, "Nome prodotto:");
            String testo = JOptionPane.showInputDialog(this, "Inserisci recensione:");
            int stelle = Integer.parseInt(JOptionPane.showInputDialog(this, "Stelle (1-5):"));

            Prodotto prodotto = null;
            for (Prodotto p : gestore.getProdotti()) {
                if (p.getNome().equalsIgnoreCase(prodottoNome)) {
                    prodotto = p;
                    break;
                }
            }

            if (prodotto == null) {
                int codProdotto = gestore.getProdotti().size() + 1000;
                prodotto = new Prodotto(prodottoNome, codProdotto);
                gestore.getProdotti().add(prodotto);
            }

            int maxId = 0;
            for (Recensione r : gestore.getRecensioni()) {
                String numerico = r.getIdRecensione().replace("REV", "");
                try {
                    int idCorrente = Integer.parseInt(numerico);
                    if (idCorrente > maxId) {
                        maxId = idCorrente;
                    }
                } catch (NumberFormatException e) {
                }
            }
            String idRecensione = "REV" + String.format("%04d", maxId + 1);
            Recensione nuova = new Recensione(
                    stelle,
                    testo,
                    idRecensione,
                    this.utenteLoggato,
                    prodotto
            );

            gestore.aggiungiRecensione(nuova);
            aggiornaTabella("Tutti");
            caricaProdotti();

            JOptionPane.showMessageDialog(this, "Recensione aggiunta a nome di " + utenteLoggato.getNome());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Errore inserimento dati");
        }
    }//GEN-LAST:event_btnAggiungiActionPerformed
    private void caricaProdotti() {

        loadingCombo = true;

        cmbProdotti.removeAllItems();

        cmbProdotti.addItem("Tutti");

        for (Model.Prodotto p : gestore.getProdotti()) {
            cmbProdotti.addItem(p.getNome());
        }

        loadingCombo = false;
    }

    private void aggiornaTabella(String prodottoSelezionato) {

        DefaultTableModel modello
                = new DefaultTableModel();

        modello.addColumn("ID");
        modello.addColumn("Cliente");
        modello.addColumn("Prodotto");
        modello.addColumn("Stelle");
        int count = 0;
        double somma = 0;
        for (Model.Recensione r : gestore.getRecensioni()) {

            if (prodottoSelezionato.equals("Tutti")
                    || r.getProdotto().getNome().equals(prodottoSelezionato)) {
                modello.addRow(new Object[]{
                    r.getIdRecensione(),
                    r.getCliente().getNome()
                    + " "
                    + r.getCliente().getCognome(),
                    r.getProdotto().getNome(),
                    r.getStelle()
                });
                count++;
                somma += r.getStelle();
            }
        }
        if (!prodottoSelezionato.equals("Tutti") && count > 0) {
            lblMedia.setText(
                    "Media: " + (somma / count)
                    + " | Recensioni: " + count
            );
        } else {
            lblMedia.setText("Media: -");
        }

        tabellaRecensioni.setModel(modello);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGrafico(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton btnAggiungi;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnSalva;
    private javax.swing.JComboBox<String> cmbProdotti;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGrafico;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblTop;
    private javax.swing.JTable tabellaRecensioni;
    private javax.swing.JTextArea txtDettagli;
    private javax.swing.JTextField txtRicerca;
    // End of variables declaration//GEN-END:variables
}
