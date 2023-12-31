/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import Model.Clases.Cliente;
import Model.Clases.Mensaje;
import Model.Clases.Steam;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paola
 */
public class vistaMensajes extends javax.swing.JPanel {
    private Steam steam;
    private Cliente cliente;
    private Mensaje mensaje;
    /**
     * Creates new form vistaMensajes
     */
    public vistaMensajes(Steam steam,Cliente cliente) {
        this.steam=steam;
        this.cliente=cliente;
        initComponents();
        listarMensajes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bandejaEntrada = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoMensaje = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JLabel();
        textoDestinatario = new javax.swing.JLabel();
        campoNickname = new javax.swing.JTextField();
        panelFondoEnviar = new javax.swing.JPanel();
        botonEnviar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Usuario", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        bandejaEntrada.setViewportView(jTable1);

        campoMensaje.setBackground(new java.awt.Color(51, 51, 51));
        campoMensaje.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoMensaje.setForeground(new java.awt.Color(255, 255, 255));
        campoMensaje.setText("Escriba aqui");

        txtMensaje.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(255, 255, 255));
        txtMensaje.setText("Mensaje:");

        textoDestinatario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textoDestinatario.setForeground(new java.awt.Color(255, 255, 255));
        textoDestinatario.setText("Destinatario : ");

        campoNickname.setBackground(new java.awt.Color(51, 51, 51));
        campoNickname.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        campoNickname.setForeground(new java.awt.Color(255, 255, 255));
        campoNickname.setText("Ingrese nickName");

        panelFondoEnviar.setBackground(new java.awt.Color(153, 0, 255));

        botonEnviar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        botonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        botonEnviar.setText("  Enviar");
        botonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEnviarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelFondoEnviarLayout = new javax.swing.GroupLayout(panelFondoEnviar);
        panelFondoEnviar.setLayout(panelFondoEnviarLayout);
        panelFondoEnviarLayout.setHorizontalGroup(
            panelFondoEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        panelFondoEnviarLayout.setVerticalGroup(
            panelFondoEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(textoDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(panelFondoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(bandejaEntrada)
                    .addComponent(campoMensaje))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bandejaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(panelFondoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnviarMouseClicked
        // TODO add your handling code here:
        Boolean nicknameOK=true;
        Boolean mensajeOK=true;
        if(campoNickname.getText().equals("Ingrese nickName")){
            nicknameOK=false;
            JOptionPane.showMessageDialog(this, "Complete el campo con el destinatario");
        }
        
        if(campoMensaje.getText().equals("Escriba aqui")){
            mensajeOK=false;
            JOptionPane.showMessageDialog(this, "Por favor escriba un mensaje");
        }
        
        if(mensajeOK && nicknameOK){
            this.mensaje=new Mensaje(campoNickname.getText(),cliente.getNickName(),campoMensaje.getText());
            steam.logisticaDeMensajes(mensaje);
            JOptionPane.showMessageDialog(this, "Mensaje enviado correctamente a "+ campoNickname.getText());
        }
    }//GEN-LAST:event_botonEnviarMouseClicked

    private void botonEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnviarMouseEntered
        // TODO add your handling code here:
        panelFondoEnviar.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonEnviarMouseEntered

    private void botonEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEnviarMouseExited
        // TODO add your handling code here:
        panelFondoEnviar.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonEnviarMouseExited

    public void listarMensajes(){
        DefaultTableModel datos=(DefaultTableModel)jTable1.getModel();
        datos.setNumRows(0);
        int i=cliente.getMensajes().size()-1;
        Mensaje mensaje=null;
        while(i>=0){
            mensaje=this.cliente.getMensajes().get(i);
            Object [] fila = {mensaje.getFecha(),mensaje.getNicknameEmisor(),mensaje.getMensaje()};
            datos.addRow(fila);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane bandejaEntrada;
    private javax.swing.JLabel botonEnviar;
    private javax.swing.JTextField campoMensaje;
    private javax.swing.JTextField campoNickname;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelFondoEnviar;
    private javax.swing.JLabel textoDestinatario;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables
}
