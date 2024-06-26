/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import controller.Controller;
import java.util.List;
import java.util.Random;
import model.Autor;
import model.Zanr;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Knjiga;
/**
 *
 * @author x
 */
public class FormaKnjiga extends javax.swing.JDialog {

    private Controller kontroler;
    private GlavnaForma gf;
    private Knjiga knjigaZaIzmenu;
    /**
     * Creates new form FormaKnjiga
     */

      public FormaKnjiga(java.awt.Frame parent, boolean modal,Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        initComponents();
        kontroler=Controller.getInstance();
        this.gf=(GlavnaForma) parent;
        popuniComboBoxAutorima();
        if(knjigaZaIzmenu!=null){
            this.knjigaZaIzmenu=knjigaZaIzmenu;
            jTextFieldNaziv.setText(knjigaZaIzmenu.getNaslov());
            jComboBoxAutori.setSelectedItem(knjigaZaIzmenu.getAutor());
            jTextFieldISBN.setText(knjigaZaIzmenu.getISBN());
            jTextFieldISBN.setEnabled(false);
            jTextFieldGodinaIzdanja.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            jComboBoxZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            jButtonDodaj.setVisible(false);
        }
        else{
            jButtonIzmeni.setVisible(false);
        }
        
    }

  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldGodinaIzdanja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAutori = new javax.swing.JComboBox<>();
        jButtonDodaj = new javax.swing.JButton();
        jButtonOdustani = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jButtonIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv");

        jLabel2.setText("Godina izdanja");

        jLabel3.setText("ISBN");

        jLabel4.setText("Autor");

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jButtonOdustani.setText("Odustani");
        jButtonOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOdustaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Zanr");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jButtonIzmeni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDodaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOdustani)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDodaj)
                    .addComponent(jButtonOdustani)
                    .addComponent(jButtonIzmeni))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOdustaniActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jButtonOdustaniActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        String naziv=jTextFieldNaziv.getText();
        String isbn=jTextFieldISBN.getText();
        int godIzdanja;
        try{
            godIzdanja=Integer.parseInt(jTextFieldGodinaIzdanja.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj","Greska",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Zanr zanr =(Zanr) jComboBoxZanr.getSelectedItem();
        Autor odabraniAutor=(Autor) jComboBoxAutori.getSelectedItem();
        Random rand=new Random();
        int id=101+rand.nextInt(Integer.MAX_VALUE-100);
        
        Knjiga novaKnjiga=new Knjiga(id,naziv, odabraniAutor, isbn, godIzdanja, zanr);
        kontroler.dodajKnjigu(novaKnjiga);
        gf.osveziTabelu();
        JOptionPane.showMessageDialog(this, "Knjiga je uspesno dodata","Uspesno",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        String naziv=jTextFieldNaziv.getText();
        int godIzdanja;
        try{
            godIzdanja=Integer.parseInt(jTextFieldGodinaIzdanja.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj","Greska",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Zanr zanr =(Zanr) jComboBoxZanr.getSelectedItem();
        Autor odabraniAutor=(Autor) jComboBoxAutori.getSelectedItem();
        
        knjigaZaIzmenu.setAutor(odabraniAutor);
        knjigaZaIzmenu.setGodinaIzdanja(godIzdanja);
        knjigaZaIzmenu.setNaslov(naziv);
        knjigaZaIzmenu.setZanr(zanr);
        
        
        kontroler.azurirajKnjigu(knjigaZaIzmenu);
        gf.osveziTabelu();
        JOptionPane.showMessageDialog(this, "Uspesna izmena knjige!","Uspesno",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonOdustani;
    private javax.swing.JComboBox<Autor> jComboBoxAutori;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGodinaIzdanja;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
        jComboBoxAutori.removeAllItems();
        List<Autor> autori=kontroler.ucitajListuAutoraIzBaze();
        for(Autor autor :autori){
             jComboBoxAutori.addItem(autor);
        }
    }
}
