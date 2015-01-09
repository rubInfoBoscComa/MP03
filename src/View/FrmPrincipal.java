/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import Model.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    public JButton getBtnAnterior() {
        return btnAnterior;
    }

    public void setBtnAnterior(JButton btnAnterior) {
        this.btnAnterior = btnAnterior;
    }

    public JButton getBtnCancela() {
        return btnCancela;
    }

    public void setBtnCancela(JButton btnCancela) {
        this.btnCancela = btnCancela;
    }

    public JButton getBtnDarrer() {
        return btnDarrer;
    }

    public void setBtnDarrer(JButton btnDarrer) {
        this.btnDarrer = btnDarrer;
    }

    public JButton getBtnDesa() {
        return btnDesa;
    }

    public void setBtnDesa(JButton btnDesa) {
        this.btnDesa = btnDesa;
    }

    public JButton getBtnEdita() {
        return btnEdita;
    }

    public void setBtnEdita(JButton btnEdita) {
        this.btnEdita = btnEdita;
    }

    public JButton getBtnEsborra() {
        return btnEsborra;
    }

    public void setBtnEsborra(JButton btnEsborra) {
        this.btnEsborra = btnEsborra;
    }

    public JButton getBtnNou() {
        return btnNou;
    }

    public void setBtnNou(JButton btnNou) {
        this.btnNou = btnNou;
    }

    public JButton getBtnPrimer() {
        return btnPrimer;
    }

    public void setBtnPrimer(JButton btnPrimer) {
        this.btnPrimer = btnPrimer;
    }

    public JButton getBtnSeguent() {
        return btnSeguent;
    }

    public void setBtnSeguent(JButton btnSeguent) {
        this.btnSeguent = btnSeguent;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JLabel getLblDNI() {
        return lblDNI;
    }

    public void setLblDNI(JLabel lblDNI) {
        this.lblDNI = lblDNI;
    }

    public JLabel getLblPrimerCognom() {
        return lblPrimerCognom;
    }

    public void setLblPrimerCognom(JLabel lblPrimerCognom) {
        this.lblPrimerCognom = lblPrimerCognom;
    }

    public JLabel getLblPrimerCognom1() {
        return lblPrimerCognom1;
    }

    public void setLblPrimerCognom1(JLabel lblPrimerCognom1) {
        this.lblPrimerCognom1 = lblPrimerCognom1;
    }

    public JLabel getLblPrimerCognom2() {
        return lblPrimerCognom2;
    }

    public void setLblPrimerCognom2(JLabel lblPrimerCognom2) {
        this.lblPrimerCognom2 = lblPrimerCognom2;
    }

    public JLabel getLblRegistres() {
        return lblRegistres;
    }

    public void setLblRegistres(JLabel lblRegistres) {
        this.lblRegistres = lblRegistres;
    }

    public JTextField getTxtDNI1() {
        return txtDNI1;
    }

    public void setTxtDNI1(JTextField txtDNI1) {
        this.txtDNI1 = txtDNI1;
    }

    public JTextField getTxtEdat() {
        return txtEdat;
    }

    public void setTxtEdat(JTextField txtEdat) {
        this.txtEdat = txtEdat;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(JTextField txtNom) {
        this.txtNom = txtNom;
    }

    public JTextField getTxtPrimerCognom() {
        return txtPrimerCognom;
    }

    public void setTxtPrimerCognom(JTextField txtPrimerCognom) {
        this.txtPrimerCognom = txtPrimerCognom;
    }

    public JTextField getTxtSegonCognom() {
        return txtSegonCognom;
    }

    public void setTxtSegonCognom(JTextField txtSegonCognom) {
        this.txtSegonCognom = txtSegonCognom;
    }

    /**
     * Funcio que desactiva els botons innecessris quan no hi ha registres o
     * estem editant-modificant un
     */
    public void desactivarBotonsIn() {
        btnEdita.setEnabled(false);
        btnEsborra.setEnabled(false);
        btnPrimer.setEnabled(false);
        btnSeguent.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnDarrer.setEnabled(false);
        btnDesa.setEnabled(false);
        btnCancela.setEnabled(false);
        btnNou.setEnabled(false);
    }

    /**
     * Funcio que activa els botons que son necessaris al haver registres i no
     * s'estan modificant-afegint cap
     */
    public void activarBotonsN() {
        btnEdita.setEnabled(true);
        btnEsborra.setEnabled(true);
        btnPrimer.setEnabled(true);
        btnSeguent.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnDarrer.setEnabled(true);
        btnDesa.setEnabled(true);
        btnCancela.setEnabled(true);
    }

    /**
     * Posa la informació d'una persona en la pantalla
     */
    public void posarInformacio(Persona persona) {
        txtDNI1.setText(persona.getDni());
        txtNom.setText(persona.getNom());
        txtPrimerCognom.setText(persona.getPrimerCognom());
        txtSegonCognom.setText(persona.getSegonCognom());
        txtEdat.setText(Integer.toString(persona.getEdat()));
    }

    /**
     * Actualitza el numero de registre
     * @param posicio
     * @param mida 
     */
    public void actualitzarNumRegistre(int posicio, int mida) {
        lblRegistres.setText("Registre " + posicio + " de " + mida);
    }

    /**
     * Activa els Text Fields per poder-los modificar i desactiva tots els
     * botons innecessaris a més, activa els botons de desa i cancel·la
     */
    public void activarTxtFieldsButtons() {
        //Activant tots els Text Field com a editables
        txtNom.setEditable(true);
        txtPrimerCognom.setEditable(true);
        txtSegonCognom.setEditable(true);
        txtDNI1.setEditable(true);
        txtEdat.setEditable(true);

        //Desactivar botons Innecessaris
        desactivarBotonsIn();

        //Activar botons Necessaris
        btnDesa.setEnabled(true);
        btnCancela.setEnabled(true);
        
    }

    public void actDesacButtonsFields() {

        //Desactivant tots els Text Field com a editables
        txtNom.setEditable(false);
        txtPrimerCognom.setEditable(false);
        txtSegonCognom.setEditable(false);
        txtDNI1.setEditable(false);
        txtEdat.setEditable(false);

        //Activar botons Necessaris
        activarBotonsN();

        //Activar botons Necessaris
        btnDesa.setEnabled(false);
        btnCancela.setEnabled(false);
        btnNou.setEnabled(true);

    }

    /**
     * Elimina el Contingut delsTexts Fields
     */
    public void esborrarTextFields() {
        txtNom.setText("");
        txtPrimerCognom.setText("");
        txtSegonCognom.setText("");
        txtEdat.setText("");
        txtDNI1.setText("");

        //Canvi del label de Registres
        lblRegistres.setText("Nou registre");
    }
    
      /**
     * Ens mostra a la vista un panell per confirmar si volem Esborrar un
     * registre o no
     *
     * @return
     */
    public int confirmacioEsborra() {
        return JOptionPane.showOptionDialog(this,
                "De debò vols esborrar el registre?",
                "Esborrar registre", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
    }

    /**
     * Ens mostra un missatge informatiu Pot mostrar informació sobre l'acció
     * d'un usuari o en el seu defecte un error
     *
     * @param missatge
     * @param titol
     */
    public void mostrarMissatge(String missatge, String titol) {
        JOptionPane.showMessageDialog(this, missatge, titol, JOptionPane.CLOSED_OPTION);
    }

    /**
     * Funció que comprova que les dades introduides siguin correctes abans de
     * guardar-les
     */
    public boolean comprovarDades() {

        if (txtDNI1.getText().matches("(\\d{8})(-)([A-Z]{1})")) {
            if (txtNom.getText().matches("^[A-Za-zÀàÈèÉéÒòÓóÚúÍíÑñ]{2,40}$")) {
                if (txtPrimerCognom.getText().matches("^[A-Za-zÀàÈèÉéÒòÓóÚúÍíÑñ]{2,40}$")) {
                    if (txtSegonCognom.getText().matches("^[A-Za-zÀàÈèÉéÒòÓóÚúÍíÑñ]{2,40}$")) {
                        if (txtEdat.getText().matches("^([1-9]|[1-9][0-9]|[1-9][0-9][0-9])$")) {
                            return true;
                        } else {
                            mostrarMissatge("L'edat ha d'estar compresa amb números del 1 al 999", "ERROR");
                        }
                    } else {
                        mostrarMissatge("El segon cognom han de ser lletres amb una longitud de 2 a 40 caracters", "ERROR");
                    }
                } else {
                    mostrarMissatge("El primer cognom han de ser lletres amb una longitud de 2 a 40 caracters", "ERROR");
                }

            } else {
                mostrarMissatge("El nom han de ser lletres amb una longitud de 2 a 40 caracters", "ERROR");
            }
        } else {
            mostrarMissatge("El DNI han de ser 8 numeros seguits d'un guió i una lletra Majúscula (12345678-L)", "ERROR");
        }

        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNou = new javax.swing.JButton();
        btnEsborra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnPrimer = new javax.swing.JButton();
        btnDarrer = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSeguent = new javax.swing.JButton();
        btnDesa = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        lblRegistres = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblPrimerCognom1 = new javax.swing.JLabel();
        lblPrimerCognom = new javax.swing.JLabel();
        lblPrimerCognom2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtDNI1 = new javax.swing.JTextField();
        txtPrimerCognom = new javax.swing.JTextField();
        txtSegonCognom = new javax.swing.JTextField();
        txtEdat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestió de Persones");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnNou.setText("Nou");
        btnNou.setFocusable(false);
        btnNou.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNou.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNou);

        btnEsborra.setText("Esborra");
        btnEsborra.setFocusable(false);
        btnEsborra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEsborra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEsborra);

        btnEdita.setText("Edita");
        btnEdita.setFocusable(false);
        btnEdita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEdita);

        btnPrimer.setText("Primer");
        btnPrimer.setFocusable(false);
        btnPrimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnPrimer);

        btnDarrer.setText("Darrer");
        btnDarrer.setFocusable(false);
        btnDarrer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDarrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDarrer);

        btnAnterior.setText("Anterior");
        btnAnterior.setFocusable(false);
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAnterior);

        btnSeguent.setText("Següent");
        btnSeguent.setFocusable(false);
        btnSeguent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeguent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSeguent);

        btnDesa.setText("Desa");
        btnDesa.setEnabled(false);
        btnDesa.setFocusable(false);
        btnDesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDesa);

        btnCancela.setText("Cancela");
        btnCancela.setEnabled(false);
        btnCancela.setFocusable(false);
        btnCancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCancela);

        lblRegistres.setText("No hi han registres");
        jToolBar1.add(lblRegistres);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Nom:");

        lblDNI.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblDNI.setText("DNI: ");

        lblPrimerCognom1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPrimerCognom1.setText("Primer Cognom:");

        lblPrimerCognom.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPrimerCognom.setText("Segon Cognom:");

        lblPrimerCognom2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPrimerCognom2.setText("Edat:");

        txtNom.setEditable(false);

        txtDNI1.setEditable(false);

        txtPrimerCognom.setEditable(false);

        txtSegonCognom.setEditable(false);

        txtEdat.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblDNI)
                    .addComponent(lblPrimerCognom1)
                    .addComponent(lblPrimerCognom)
                    .addComponent(lblPrimerCognom2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrimerCognom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegonCognom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdat, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(lblPrimerCognom1))
                    .addComponent(txtPrimerCognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerCognom)
                    .addComponent(txtSegonCognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerCognom2)
                    .addComponent(txtEdat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnDarrer;
    private javax.swing.JButton btnDesa;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnEsborra;
    private javax.swing.JButton btnNou;
    private javax.swing.JButton btnPrimer;
    private javax.swing.JButton btnSeguent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblPrimerCognom;
    private javax.swing.JLabel lblPrimerCognom1;
    private javax.swing.JLabel lblPrimerCognom2;
    private javax.swing.JLabel lblRegistres;
    private javax.swing.JTextField txtDNI1;
    private javax.swing.JTextField txtEdat;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrimerCognom;
    private javax.swing.JTextField txtSegonCognom;
    // End of variables declaration//GEN-END:variables
}
