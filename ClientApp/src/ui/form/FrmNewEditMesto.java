/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui.form;

import communication.Operation;
import domain.Drzava;
import domain.Mesto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import ui.controller.Controller;

/**
 *
 * @author HP
 */
public class FrmNewEditMesto extends javax.swing.JDialog {

    private Operation mode;
    private Mesto mesto;

    /**
     * Creates new form FrmNewEditK
     */
    public FrmNewEditMesto(java.awt.Frame parent, boolean modal, Operation mode) throws Exception {
        super(parent, modal);
        this.mode = mode;
        initComponents();
        setLocationRelativeTo(null);
        fillDrzave();
        setTitle("Cuvanje mesta");
        prepareForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnObrisi = new javax.swing.JButton();
        lblPtt = new javax.swing.JLabel();
        btnIzmena = new javax.swing.JButton();
        lblDrz = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        txtPtt = new javax.swing.JTextField();
        lblNaziv = new javax.swing.JLabel();
        comboBoxDrzave = new javax.swing.JComboBox<>();
        btnSacuvaj = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lblPtt.setText("PTT:");

        btnIzmena.setText("Omoguci izmenu");
        btnIzmena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmenaActionPerformed(evt);
            }
        });

        lblDrz.setText("Drzava:");

        lblNaziv.setText("Naziv:");

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnObrisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIzmena)
                .addGap(63, 63, 63)
                .addComponent(btnSacuvaj)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(lblDrz)
                            .addGap(63, 63, 63))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPtt)
                                .addComponent(lblNaziv))
                            .addGap(68, 68, 68)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblID)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtPtt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDrzave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNaziv))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPtt)
                    .addComponent(txtPtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrz)
                    .addComponent(comboBoxDrzave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(btnIzmena)
                    .addComponent(btnObrisi))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed

        try {
            Mesto m = new Mesto();
            String idText = txtID.getText();
            if (!idText.isEmpty()) {
                m.setMestoID(Long.parseLong(idText));
            } else {
                m.setMestoID(null);
            }
            m.setNaziv(txtNaziv.getText());
            m.setPtt(Long.parseLong(txtPtt.getText()));
            if (!m.getNaziv().matches("[a-zA-Z]+\\s?[a-zA-Z]+") || m.getPtt() <= 0) {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti mesto!");

            } else {

                m.setDrzava((Drzava) comboBoxDrzave.getSelectedItem());
                System.out.println("Na strani forme su " + m);
                if (mode == Operation.ADD_M) {
                    Controller.getInstance().createMesto(m);
                } else {
                    Controller.getInstance().editMesto(m);
                }
                JOptionPane.showMessageDialog(this, "Sistem je zapamtio mesto!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti mesto!");

        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void btnIzmenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmenaActionPerformed
        // TODO add your handling code here:
        mode = Operation.EDIT_M;
        prepareForm();
    }//GEN-LAST:event_btnIzmenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        //prvo ucitamo pa brisemo
        try {
            Mesto m = new Mesto();
            String idText = txtID.getText();
            if (!idText.isEmpty()) {
                m.setMestoID(Long.parseLong(idText));
            } else {
                m.setMestoID(null);
            }
            m.setNaziv(txtNaziv.getText());
            m.setPtt(Long.parseLong(txtPtt.getText()));
            m.setDrzava((Drzava) comboBoxDrzave.getSelectedItem());

            Mesto ucitani = Controller.getInstance().getMesto(m);
            System.out.println("Ucitani je " + ucitani);

            if (ucitani != null) {
                JOptionPane.showMessageDialog(this, "Sistem je ucitao mesto!");
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita mesto!");
            }

            int odg = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da obrisete mesto?", "Provera", JOptionPane.YES_NO_OPTION);
            if (odg == JOptionPane.YES_OPTION) {
                Mesto obrisano = Controller.getInstance().deleteMesto(m);
                JOptionPane.showMessageDialog(this, "Sistem je obrisao mesto!");

                System.out.println("Obrisani je " + obrisano);

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da obrise mesto!");

                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da obrise mesto!");

        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    public FrmNewEditMesto(java.awt.Frame parent, boolean modal, Operation mode, Mesto m) throws Exception {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        this.mode = mode;

        mesto = m;
        fillDrzave();
        setTitle("Cuvanje mesta");

        prepareForm();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmena;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<String> comboBoxDrzave;
    private javax.swing.JLabel lblDrz;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JLabel lblPtt;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtPtt;
    // End of variables declaration//GEN-END:variables

    private void fillDrzave() throws Exception {
        try {
            List<Drzava> drzave = Controller.getInstance().getAllDrzave();
            System.out.println("Sta je vratilo u formu: ");
            for (Drzava d : drzave) {
                System.out.println(d);
            }
            comboBoxDrzave.setModel(new DefaultComboBoxModel(drzave.toArray()));

            comboBoxDrzave.setSelectedIndex(-1);

        } catch (Exception ex) {
            //ako slucajno dodje do greske
            ex.printStackTrace();
        }
    }

    private void prepareForm() {

        comboBoxDrzave.setEditable(false);
        switch (mode) {
            case ADD_M: {
                btnObrisi.setEnabled(false);
                btnIzmena.setVisible(false);
                btnSacuvaj.setVisible(true);
                comboBoxDrzave.setEnabled(true);
                lblID.setVisible(false);
                txtID.setVisible(false);
                break;

            }
            case EDIT_M: {
                txtNaziv.setEnabled(true);
                txtPtt.setEnabled(true);

                txtID.setEnabled(true);
                txtID.setEditable(false);

                btnObrisi.setEnabled(true);
                btnIzmena.setEnabled(false);
                btnSacuvaj.setEnabled(true);
                comboBoxDrzave.setEnabled(true);
                break;
            }
            case VIEW_M: {
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(this, "Sistem je ucitao mesto!");
                });
                btnObrisi.setEnabled(true);
                btnIzmena.setEnabled(true);
                btnSacuvaj.setEnabled(false);
                txtID.setEnabled(false);
                txtID.setEditable(false);
                txtID.setText(mesto.getMestoID().toString());
                txtNaziv.setText(mesto.getNaziv());
                txtPtt.setText(mesto.getPtt().toString());

                comboBoxDrzave.setSelectedItem(mesto.getDrzava());

                txtNaziv.setEnabled(false);
                txtPtt.setEnabled(false);
                comboBoxDrzave.setEnabled(false);

                break;

            }

        }
    }
}
