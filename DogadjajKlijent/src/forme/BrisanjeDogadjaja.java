package forme;

import domen.Prijava;
import domen.Dogadjaj;
import domen.Clan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import kontroler.Kontroler;
import modeli.ModelTabeleDogadjaj;
import modeli.ModelTabeleClan;
import transfer.ServerskiOdgovor;

public class BrisanjeDogadjaja extends javax.swing.JFrame {
    Dogadjaj dogadjajBrisanje = new Dogadjaj();
    ArrayList<Dogadjaj> listaDogadjaja = new ArrayList<>();
    ArrayList<Prijava> listaPrijava = new ArrayList<>();
    int red;
    /**
     * Creates new form BrisanjePrakse
     */
    public BrisanjeDogadjaja() {
        initComponents();
        this.setLocationRelativeTo(null);
        Kontroler.getInstance().vratiDogadjajeZaBrisanjeFormu();
        Kontroler.getInstance().vratiPrijaveZaBrisanjeDogadjaja();
        //srediTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBrisanjeDogadjaja = new javax.swing.JTable();
        btnObrisi = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPretraga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin - brisanje dogadjaja");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Brisanje dogadjaja"));

        tabelaBrisanjeDogadjaja.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaBrisanjeDogadjaja);

        btnObrisi.setText("Obriši dogadjaj");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnOtkazi.setText("Otkaži");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        jLabel1.setText("Kriterijum pretrage: (filter)");

        txtPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretragaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPretraga)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        red = tabelaBrisanjeDogadjaja.getSelectedRow();
        if(red != -1) {
            ModelTabeleDogadjaj mtp = (ModelTabeleDogadjaj) tabelaBrisanjeDogadjaja.getModel();
            dogadjajBrisanje = mtp.vratiRed(red);
            ArrayList<Prijava> nova = new ArrayList<>();
           for(Prijava ap : listaPrijava) {
               if(ap.getDogadaj().getIdDogadjaja()== dogadjajBrisanje.getIdDogadjaja()) {
               nova.add(ap);
               }
            }
            dogadjajBrisanje.setListaPrijava(nova);
            Kontroler.getInstance().obrisiDogadjaj(dogadjajBrisanje);
            //srediTabelu();
        }
        else {
            JOptionPane.showMessageDialog(this, "Izaberite dogadjaj koju želite da obrišete!");
            return;
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretragaKeyReleased
        // TODO add your handling code here:
        String tekst = txtPretraga.getText();
        filter(tekst);
    }//GEN-LAST:event_txtPretragaKeyReleased

     private void filter(String tekst) {
        ModelTabeleDogadjaj model = (ModelTabeleDogadjaj) tabelaBrisanjeDogadjaja.getModel();
        TableRowSorter<ModelTabeleDogadjaj> tr = new TableRowSorter<ModelTabeleDogadjaj>(model);
        tabelaBrisanjeDogadjaja.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(tekst));
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
            java.util.logging.Logger.getLogger(BrisanjeDogadjaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrisanjeDogadjaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrisanjeDogadjaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrisanjeDogadjaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrisanjeDogadjaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaBrisanjeDogadjaja;
    private javax.swing.JTextField txtPretraga;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {
        ModelTabeleDogadjaj mtp = new ModelTabeleDogadjaj(listaDogadjaja);
        tabelaBrisanjeDogadjaja.setModel(mtp);
    }

    public void obrisiDogadjajIzTabele(ServerskiOdgovor so) {
        if (so.isFleg()) {
            listaDogadjaja.remove(red);
            srediTabelu();
            JOptionPane.showMessageDialog(this, so.getPoruka());
        }
    }

    public void vratiDogadjajeZaBrisanjeFormu(ServerskiOdgovor so) {
        if (so.isFleg()) {            
            System.out.println();
            listaDogadjaja =  (ArrayList<Dogadjaj>) so.getOdgovor();
            srediTabelu();
        } else {
            JOptionPane.showMessageDialog(this, "Neuspešno učitavanje dogadjaja!");
        }
    }

    public void vratiPrijave(ServerskiOdgovor so) {
          if(so.isFleg()) {       
            listaPrijava = (ArrayList<Prijava>) so.getOdgovor();
        } else {
            JOptionPane.showMessageDialog(this, "Neuspešno učitavanje prijava!");
        }
    }
}
