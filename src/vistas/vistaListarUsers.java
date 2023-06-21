/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;


import Model.Clases.Cliente;
import Model.Clases.Steam;
import Model.Clases.UserBasico;
import Model.Clases.UsuarioPremium;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paola
 */
public class vistaListarUsers extends javax.swing.JPanel {
    
    private Steam steam;

    /**
     * Creates new form listarUsers
     */
    public vistaListarUsers(Steam steam) {
        this.steam=steam;
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

        tablaUsers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        textoListaDeUsuarios = new javax.swing.JLabel();
        fondoPremium = new javax.swing.JPanel();
        botonPremium = new javax.swing.JLabel();
        fondoBasico = new javax.swing.JPanel();
        botonBasico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dni", "NickName", "E-mail", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsers.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        textoListaDeUsuarios.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoListaDeUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        textoListaDeUsuarios.setText("Listado De Usuarios");

        fondoPremium.setBackground(new java.awt.Color(153, 0, 255));

        botonPremium.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonPremium.setForeground(new java.awt.Color(255, 255, 255));
        botonPremium.setText("           Premium");
        botonPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPremiumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPremiumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPremiumMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoPremiumLayout = new javax.swing.GroupLayout(fondoPremium);
        fondoPremium.setLayout(fondoPremiumLayout);
        fondoPremiumLayout.setHorizontalGroup(
            fondoPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPremium, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        fondoPremiumLayout.setVerticalGroup(
            fondoPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondoBasico.setBackground(new java.awt.Color(153, 0, 255));

        botonBasico.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonBasico.setForeground(new java.awt.Color(255, 255, 255));
        botonBasico.setText("            Basico");
        botonBasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBasicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBasicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBasicoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBasicoLayout = new javax.swing.GroupLayout(fondoBasico);
        fondoBasico.setLayout(fondoBasicoLayout);
        fondoBasicoLayout.setHorizontalGroup(
            fondoBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonBasico, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        fondoBasicoLayout.setVerticalGroup(
            fondoBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textoListaDeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(fondoPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoListaDeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(fondoPremium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoBasico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tablaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tablaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPremiumMouseClicked
        // TODO add your handling code here:
        listarPremium(this.steam.listarClientesPremium());
    }//GEN-LAST:event_botonPremiumMouseClicked

    private void botonPremiumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPremiumMouseEntered
        // TODO add your handling code here:
        fondoPremium.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonPremiumMouseEntered

    private void botonPremiumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPremiumMouseExited
        // TODO add your handling code here:
        fondoPremium.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonPremiumMouseExited

    private void botonBasicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBasicoMouseEntered
        // TODO add your handling code here:
        fondoBasico.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonBasicoMouseEntered

    private void botonBasicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBasicoMouseExited
        // TODO add your handling code here:
        fondoBasico.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonBasicoMouseExited

    private void botonBasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBasicoMouseClicked
        // TODO add your handling code here:
        listarBasicos(this.steam.listarClientesBasicos());
    }//GEN-LAST:event_botonBasicoMouseClicked

    private void listarBasicos(ArrayList<UserBasico> clientes){
        DefaultTableModel datos=(DefaultTableModel)jTable1.getModel();
        datos.setNumRows(0);
        for(UserBasico cliente: clientes){
            System.out.println(cliente.getActivo());
                Object [] fila = {cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.getDni(),cliente.getNickName(),cliente.getMail(),cliente.getActivo()};
                datos.addRow(fila);  
        }
    }
    
    private void listarPremium(ArrayList<UsuarioPremium> clientes){
        DefaultTableModel datos=(DefaultTableModel)jTable1.getModel();
        datos.setNumRows(0);
        for(UsuarioPremium cliente: clientes){
                Object [] fila = {cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.getDni(),cliente.getNickName(),cliente.getMail(),cliente.getActivo()};
                datos.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonBasico;
    private javax.swing.JLabel botonPremium;
    private javax.swing.JPanel fondoBasico;
    private javax.swing.JPanel fondoPremium;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tablaUsers;
    private javax.swing.JLabel textoListaDeUsuarios;
    // End of variables declaration//GEN-END:variables
}