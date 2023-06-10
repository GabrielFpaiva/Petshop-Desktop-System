/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author bielf
 */
public class NovoCuidador extends JPanel {

    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,-20 ); // setlocation 0 p ser no meio da tela
        novoCuidadorPanel.add(p);
        novoCuidadorPanel.revalidate();
        novoCuidadorPanel.repaint();
    }
    public NovoCuidador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        novoCuidadorPanel = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JFormattedTextField();
        labelTitle = new javax.swing.JLabel();
        textFieldName = new javax.swing.JFormattedTextField();
        textFieldEmail = new javax.swing.JFormattedTextField();
        cadastrarCuidador = new javax.swing.JButton();
        labelBairro = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        textFieldBairro = new javax.swing.JFormattedTextField();
        textFieldCidade = new javax.swing.JFormattedTextField();
        labelNumero = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JFormattedTextField();
        textFieldCep = new javax.swing.JFormattedTextField();

        novoCuidadorPanel.setBackground(new java.awt.Color(255, 255, 255));
        novoCuidadorPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));

        labelName.setText("Nome");

        labelTelefone.setText("Número de telefone");

        labelEmail.setText("E-mail");

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitle.setText("Realizar Cadastro");

        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        cadastrarCuidador.setBackground(new java.awt.Color(0, 102, 204));
        cadastrarCuidador.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarCuidador.setText("Cadastrar");
        cadastrarCuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCuidadorActionPerformed(evt);
            }
        });

        labelBairro.setText("Bairro");

        labelCidade.setText("Cidade");

        labelNumero.setText("Numero");

        labelCep.setText("Cep");


        javax.swing.GroupLayout novoCuidadorPanelLayout = new javax.swing.GroupLayout(novoCuidadorPanel);
        novoCuidadorPanel.setLayout(novoCuidadorPanelLayout);
        novoCuidadorPanelLayout.setHorizontalGroup(
                novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                .addContainerGap(365, Short.MAX_VALUE)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoCuidadorPanelLayout.createSequentialGroup()
                                                .addComponent(labelTitle)
                                                .addGap(413, 413, 413))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoCuidadorPanelLayout.createSequentialGroup()
                                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(textFieldBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(textFieldCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(textFieldName)
                                                                        .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(labelTelefone)
                                                                .addComponent(labelCep)
                                                                .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(labelNumero)
                                                                .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(360, 360, 360))))
                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(cadastrarCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        novoCuidadorPanelLayout.setVerticalGroup(
                novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cadastrarCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(418, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(novoCuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(novoCuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void cadastrarCuidadorActionPerformed(ActionEvent evt) {
        if(textFieldName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Nome Invalido!");
        }else if(textFieldEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Email Invalido!");
        }else{
            Cuidador layoutcuidador = new Cuidador();
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
            layoutcuidador.setNovoEmail(textFieldEmail.getText());
            layoutcuidador.setNovoNome(textFieldName.getText());
            layoutcuidador.refreshtable();
            novoCuidadorPanel.removeAll();
            setconfpanel(layoutcuidador);
        }
    }

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton cadastrarCuidador;
    private javax.swing.JLabel imageCuidador;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel novoCuidadorPanel;
    private javax.swing.JFormattedTextField textFieldName;
    private javax.swing.JFormattedTextField textFieldBairro;
    private javax.swing.JFormattedTextField textFieldCep;
    private javax.swing.JFormattedTextField textFieldCidade;
    private javax.swing.JFormattedTextField textFieldEmail;
    private javax.swing.JFormattedTextField textFieldNumero;
    private javax.swing.JFormattedTextField textFieldTelefone;
    // End of variables declaration                   
}
