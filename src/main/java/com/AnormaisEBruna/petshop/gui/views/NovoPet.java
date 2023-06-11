/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author detup
 */
public class NovoPet extends JPanel {

    /**
     * Creates new form NovoPet
     */
    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,-20 ); // abre o painel já no local desejado
        CadastroPetPanel.add(p);
        CadastroPetPanel.revalidate();
        CadastroPetPanel.repaint();
    }

    public NovoPet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroPetPanel = new JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomepet = new javax.swing.JFormattedTextField();
        raçapet = new javax.swing.JFormattedTextField();
        adicionarpetbutton = new javax.swing.JButton();
        CuidadorDoPet = new javax.swing.JComboBox<>();
        adicionarImagemPet = new javax.swing.JLabel();

        CadastroPetPanel.setBackground(new java.awt.Color(255, 255, 255));
        CadastroPetPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));

        jLabel9.setText("Nome");

        jLabel11.setText("Raça");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar pet");

        nomepet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomepetActionPerformed(evt);
            }
        });

        raçapet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raçapetActionPerformed(evt);
            }
        });

        adicionarpetbutton.setBackground(new java.awt.Color(0, 102, 204));
        adicionarpetbutton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarpetbutton.setText("Adicionar");
        adicionarpetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarpetbuttonActionPerformed(evt);
            }
        });

        CuidadorDoPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CuidadorDoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadorDoPetActionPerformed(evt);
            }
        });

        adicionarImagemPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adicionarImagemPet.setText("Adicionar Imagem do Pet");
        adicionarImagemPet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        adicionarImagemPet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout CadastroPetPanelLayout = new javax.swing.GroupLayout(CadastroPetPanel);
        CadastroPetPanel.setLayout(CadastroPetPanelLayout);
        CadastroPetPanelLayout.setHorizontalGroup(
            CadastroPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroPetPanelLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(440, 440, 440))
            .addGroup(CadastroPetPanelLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(CadastroPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomepet)
                    .addComponent(raçapet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addGroup(CadastroPetPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(adicionarpetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CuidadorDoPet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionarImagemPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroPetPanelLayout.setVerticalGroup(
            CadastroPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroPetPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(adicionarImagemPet, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomepet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raçapet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(CuidadorDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(adicionarpetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroPetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroPetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomepetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomepetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomepetActionPerformed

    private void raçapetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raçapetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raçapetActionPerformed

    private void adicionarpetbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(nomepet.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Nome Invalido!");
        }else if(raçapet.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Raça Invalido!");
        }else{
            Pet layoutpet =  new Pet();
            JOptionPane.showMessageDialog(null,"Pet adicionado com Sucesso!");
            layoutpet.setnomepet(nomepet.getText()); // seta  nome
            layoutpet.setraçapet(raçapet.getText()); // seta raça
            layoutpet.guardarnomecuidador=layoutpet.nomecuidador[CuidadorDoPet.getSelectedIndex()]; // seta o nome do cuidador que foi selecionado
            layoutpet.refreshtable();
            CadastroPetPanel.removeAll();
            setconfpanel(layoutpet);
        }
    }

    private void CuidadorDoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadorDoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuidadorDoPetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel CadastroPetPanel;
    private javax.swing.JComboBox<String> CuidadorDoPet;
    private javax.swing.JLabel adicionarImagemPet;
    public javax.swing.JButton adicionarpetbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JFormattedTextField nomepet;
    public javax.swing.JFormattedTextField raçapet;
    // End of variables declaration//GEN-END:variables
}
