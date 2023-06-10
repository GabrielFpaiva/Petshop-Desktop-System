/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;


/**
 *
 * @author detup
 */
public class Pet extends JPanel {

    /**
     * Creates new form Pet
     */
     Object nomepet,raçapet; 
     public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,0 ); // abre o painel já no local desejado
        PetPanel.add(p);
        PetPanel.revalidate();
        PetPanel.repaint();
    }
    public Pet() {
        initComponents();
    }
    public void setnomepet(Object nomepet){
        this.nomepet=nomepet;
    }
    public void setraçapet(Object raçapet){
        this.raçapet=raçapet;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PetPanel = new JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPets = new javax.swing.JTable();
        NewPet = new javax.swing.JButton();
        EditPet = new javax.swing.JButton();
        ViewPet = new javax.swing.JButton();

        setPreferredSize(new Dimension(1024, 1024));
        setLayout(new FlowLayout());

        PetPanel.setBackground(new java.awt.Color(255, 255, 255));
        PetPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Pets");

        tabelaPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaPets.setToolTipText("");
        tabelaPets.setShowGrid(false);
        jScrollPane1.setViewportView(tabelaPets);

        NewPet.setText("Novo Pet");
        NewPet.setMaximumSize(new java.awt.Dimension(75, 22));
        NewPet.setMinimumSize(new java.awt.Dimension(75, 22));
        NewPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPetActionPerformed(evt);
            }
        });

        EditPet.setText("Editar");
        EditPet.setMaximumSize(new java.awt.Dimension(75, 22));
        EditPet.setMinimumSize(new java.awt.Dimension(75, 22));
        EditPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPetActionPerformed(evt);
            }
        });

        ViewPet.setText("Visualizar");
        ViewPet.setMaximumSize(new java.awt.Dimension(75, 22));
        ViewPet.setMinimumSize(new java.awt.Dimension(75, 22));
        ViewPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PetPanelLayout = new javax.swing.GroupLayout(PetPanel);
        PetPanel.setLayout(PetPanelLayout);
        PetPanelLayout.setHorizontalGroup(
            PetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(PetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PetPanelLayout.createSequentialGroup()
                            .addComponent(NewPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ViewPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        PetPanelLayout.setVerticalGroup(
            PetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(87, 87, 87)
                .addGroup(PetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        PetPanel.setBounds(0,0,-1,-1);
        add(PetPanel);

    }// </editor-fold>//GEN-END:initComponents

    private void NewPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPetActionPerformed
        // TODO add your handling code here:
        NovoPet cadastrarpet = new NovoPet();
        PetPanel.removeAll();
        setconfpanel(cadastrarpet);
        
        
    }//GEN-LAST:event_NewPetActionPerformed

    private void EditPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPetActionPerformed
        // TODO add your handling code here:
        
        if(tabelaPets.getSelectedRow() != -1){
            EditarPet editarPet = new EditarPet();
            PetPanel.removeAll();
            setconfpanel(editarPet);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um pet para editar");
        }
        
        
    }//GEN-LAST:event_EditPetActionPerformed

    private void ViewPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPetActionPerformed
        // TODO add your handling code here:
           VerPet visualizarpet = new VerPet();
           PetPanel.removeAll();
           setconfpanel(visualizarpet);
        if(tabelaPets.getSelectedRow() != -1){
           PetPanel.removeAll();
           setconfpanel(visualizarpet);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um pet para visualizar");
        }
    }//GEN-LAST:event_ViewPetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditPet;
    private javax.swing.JButton NewPet;
    private JPanel PetPanel;
    private javax.swing.JButton ViewPet;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPets;
    // End of variables declaration//GEN-END:variables
}