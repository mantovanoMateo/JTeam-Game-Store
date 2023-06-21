/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import GUISS.LogIn;
import GUISS.MenuPrincipalAdmin;
import Model.Clases.Admin;
import Model.Clases.Steam;
import Model.Clases.Validar;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class vistaAjustesAdmin extends javax.swing.JPanel {

    /**
     * Creates new form vistaAjustes
     */
    
    private Steam steam;
    private Admin admin;
    private ObjectMapper mapper;
    private File file;
    private MenuPrincipalAdmin ma;
    private LogIn lw;
    
    public vistaAjustesAdmin(Steam steam,Admin admin,ObjectMapper mapper,File file,MenuPrincipalAdmin ma,LogIn lw){
        this.steam=steam;
        this.admin=admin;
        this.mapper=mapper;
        this.file=file;
        this.ma=ma;
        this.lw=lw;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoModifiicar = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoApellido = new javax.swing.JLabel();
        textoContrasenia = new javax.swing.JLabel();
        textoEmail = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        campoApellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        campoEmail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        campoContrasenia = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        fondoAceptarApellido = new javax.swing.JPanel();
        botonAceptarApellido = new javax.swing.JLabel();
        fondoAceptarEmail = new javax.swing.JPanel();
        botonAceptarEmail = new javax.swing.JLabel();
        fondoAceptarContrasenia = new javax.swing.JPanel();
        botonAceptarContrasenia = new javax.swing.JLabel();
        fondoAceptarNombre = new javax.swing.JPanel();
        botonAceptarNombre = new javax.swing.JLabel();
        fondoDarseDeBaja = new javax.swing.JPanel();
        botonDarseDeBaja = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        textoModifiicar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        textoModifiicar.setForeground(new java.awt.Color(255, 255, 255));
        textoModifiicar.setText("Modificar:");

        textoNombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setText("Nombre:");

        textoApellido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoApellido.setForeground(new java.awt.Color(255, 255, 255));
        textoApellido.setText("Apellido:");

        textoContrasenia.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        textoContrasenia.setText("Contraseña:");

        textoEmail.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoEmail.setForeground(new java.awt.Color(255, 255, 255));
        textoEmail.setText("E-Mail:");

        campoNombre.setBackground(new java.awt.Color(51, 51, 51));
        campoNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(255, 255, 255));
        campoNombre.setText("Ingrese su nuevo nombre");
        campoNombre.setBorder(null);

        campoApellido.setBackground(new java.awt.Color(51, 51, 51));
        campoApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(255, 255, 255));
        campoApellido.setText("Ingrese su nuevo apellido");
        campoApellido.setBorder(null);

        campoEmail.setBackground(new java.awt.Color(51, 51, 51));
        campoEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setText("Ingrese su nuevo e-mail");
        campoEmail.setBorder(null);

        campoContrasenia.setBackground(new java.awt.Color(51, 51, 51));
        campoContrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        campoContrasenia.setText("Ingrese su nueva contraseña");
        campoContrasenia.setBorder(null);

        fondoAceptarApellido.setBackground(new java.awt.Color(153, 0, 255));

        botonAceptarApellido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonAceptarApellido.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptarApellido.setText("   Aceptar");
        botonAceptarApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarApellidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarApellidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarApellidoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoAceptarApellidoLayout = new javax.swing.GroupLayout(fondoAceptarApellido);
        fondoAceptarApellido.setLayout(fondoAceptarApellidoLayout);
        fondoAceptarApellidoLayout.setHorizontalGroup(
            fondoAceptarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        fondoAceptarApellidoLayout.setVerticalGroup(
            fondoAceptarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        fondoAceptarEmail.setBackground(new java.awt.Color(153, 0, 255));

        botonAceptarEmail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonAceptarEmail.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptarEmail.setText("   Aceptar");
        botonAceptarEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarEmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarEmailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoAceptarEmailLayout = new javax.swing.GroupLayout(fondoAceptarEmail);
        fondoAceptarEmail.setLayout(fondoAceptarEmailLayout);
        fondoAceptarEmailLayout.setHorizontalGroup(
            fondoAceptarEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        fondoAceptarEmailLayout.setVerticalGroup(
            fondoAceptarEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        fondoAceptarContrasenia.setBackground(new java.awt.Color(153, 0, 255));

        botonAceptarContrasenia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonAceptarContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptarContrasenia.setText("   Aceptar");
        botonAceptarContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarContraseniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarContraseniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarContraseniaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoAceptarContraseniaLayout = new javax.swing.GroupLayout(fondoAceptarContrasenia);
        fondoAceptarContrasenia.setLayout(fondoAceptarContraseniaLayout);
        fondoAceptarContraseniaLayout.setHorizontalGroup(
            fondoAceptarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        fondoAceptarContraseniaLayout.setVerticalGroup(
            fondoAceptarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        fondoAceptarNombre.setBackground(new java.awt.Color(153, 0, 255));

        botonAceptarNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonAceptarNombre.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptarNombre.setText("   Aceptar");
        botonAceptarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarNombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarNombreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoAceptarNombreLayout = new javax.swing.GroupLayout(fondoAceptarNombre);
        fondoAceptarNombre.setLayout(fondoAceptarNombreLayout);
        fondoAceptarNombreLayout.setHorizontalGroup(
            fondoAceptarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        fondoAceptarNombreLayout.setVerticalGroup(
            fondoAceptarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAceptarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        fondoDarseDeBaja.setBackground(new java.awt.Color(153, 0, 255));

        botonDarseDeBaja.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonDarseDeBaja.setForeground(new java.awt.Color(255, 255, 255));
        botonDarseDeBaja.setText("        Darse de baja");
        botonDarseDeBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDarseDeBajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDarseDeBajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDarseDeBajaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoDarseDeBajaLayout = new javax.swing.GroupLayout(fondoDarseDeBaja);
        fondoDarseDeBaja.setLayout(fondoDarseDeBajaLayout);
        fondoDarseDeBajaLayout.setHorizontalGroup(
            fondoDarseDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonDarseDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        fondoDarseDeBajaLayout.setVerticalGroup(
            fondoDarseDeBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonDarseDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoContrasenia)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoModifiicar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textoApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(textoEmail)
                                                .addGap(28, 28, 28)
                                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(campoContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(jSeparator4)))))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondoAceptarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoAceptarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoAceptarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoAceptarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 514, Short.MAX_VALUE)
                .addComponent(fondoDarseDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(textoModifiicar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fondoAceptarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fondoAceptarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoAceptarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoAceptarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(fondoDarseDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarNombreMouseClicked
        // TODO add your handling code here:
        if(!campoNombre.getText().equals("Ingrese su nuevo nombre")){
            this.admin.setNombre(campoNombre.getText());
        }
    }//GEN-LAST:event_botonAceptarNombreMouseClicked

    private void botonAceptarNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarNombreMouseEntered
        // TODO add your handling code here:
        fondoAceptarNombre.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonAceptarNombreMouseEntered

    private void botonAceptarNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarNombreMouseExited
        // TODO add your handling code here:
        fondoAceptarNombre.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonAceptarNombreMouseExited

    private void botonAceptarApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarApellidoMouseClicked
        // TODO add your handling code here:
        if(!campoApellido.getText().equals("Ingrese su nuevo apellido")){
          this.admin.setApellido(campoApellido.getText());
        }
    }//GEN-LAST:event_botonAceptarApellidoMouseClicked

    private void botonAceptarApellidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarApellidoMouseEntered
        // TODO add your handling code here:
        fondoAceptarApellido.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonAceptarApellidoMouseEntered

    private void botonAceptarApellidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarApellidoMouseExited
        // TODO add your handling code here:
        fondoAceptarApellido.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonAceptarApellidoMouseExited

    private void botonAceptarEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarEmailMouseClicked
        // TODO add your handling code here:
        if(!campoEmail.getText().equals("Ingrese su nuevo e-mail"))
       {
        ArrayList<Boolean> validaciones=Validar.mailAdmin(campoEmail.getText(), this.steam.getUsuariosAdmins());
        if(validaciones.get(0)==true){
            this.admin.setMail(campoEmail.getText());
            JOptionPane.showConfirmDialog(this, "Mail cambiado exitosamente");
        }else if(validaciones.get(1)==false){
            JOptionPane.showConfirmDialog(this, "El mail no continene @ o .com");
        }else if(validaciones.get(2)==false){
            JOptionPane.showConfirmDialog(this, "El mail ya se encuentra registrado en el sistema");
        }
       }
     
    }//GEN-LAST:event_botonAceptarEmailMouseClicked

    private void botonAceptarEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarEmailMouseEntered
        // TODO add your handling code here:
        fondoAceptarEmail.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonAceptarEmailMouseEntered

    private void botonAceptarEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarEmailMouseExited
        // TODO add your handling code here:
        fondoAceptarEmail.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonAceptarEmailMouseExited

    private void botonAceptarContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarContraseniaMouseClicked
        // TODO add your handling code here:
        if(!campoContrasenia.getText().equals("Ingrese su nueva contraseña")){
            ArrayList<Boolean> validacion = Validar.contrasena(campoContrasenia.getText());
            if(validacion.get(0)==true){
                this.admin.setContrasena(campoContrasenia.getText());
                JOptionPane.showConfirmDialog(this, "contraseña cambiada correctamente");
            }else if(validacion.get(1)==false){
                JOptionPane.showConfirmDialog(this, "Debe contener almenos una mayuscula");
            }else if(validacion.get(2)==false){
                JOptionPane.showConfirmDialog(this, "Debe contener almenos un numero");
            }else if(validacion.get(3)==false){
                JOptionPane.showConfirmDialog(this, "Debe contener almenos ocho caracteres");
            }
        }
    }//GEN-LAST:event_botonAceptarContraseniaMouseClicked

    private void botonAceptarContraseniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarContraseniaMouseEntered
        // TODO add your handling code here:
        fondoAceptarContrasenia.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonAceptarContraseniaMouseEntered

    private void botonAceptarContraseniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarContraseniaMouseExited
        // TODO add your handling code here:
        fondoAceptarContrasenia.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonAceptarContraseniaMouseExited

    private void botonDarseDeBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDarseDeBajaMouseClicked
        // TODO add your handling code here:
        int valor=JOptionPane.showConfirmDialog(this, "Realmente desea darse de baja?", "Warning baja", JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION){
            this.steam.eliminarAdmin(this.admin);
            try {
                this.mapper.writerWithDefaultPrettyPrinter().writeValue(this.file,this.steam);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lw.setVisible(true);
            ma.dispose();
            JOptionPane.showMessageDialog(this, "Usted se a dado de baja");

        }
    }//GEN-LAST:event_botonDarseDeBajaMouseClicked

    
    private void botonDarseDeBajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDarseDeBajaMouseExited
        // TODO add your handling code here:
        fondoDarseDeBaja.setBackground(new Color(153,0,255));
    }//GEN-LAST:event_botonDarseDeBajaMouseExited

    private void botonDarseDeBajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDarseDeBajaMouseEntered
        // TODO add your handling code here:
        fondoDarseDeBaja.setBackground(new Color(153,0,236));
    }//GEN-LAST:event_botonDarseDeBajaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAceptarApellido;
    private javax.swing.JLabel botonAceptarContrasenia;
    private javax.swing.JLabel botonAceptarEmail;
    private javax.swing.JLabel botonAceptarNombre;
    private javax.swing.JLabel botonDarseDeBaja;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoContrasenia;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPanel fondoAceptarApellido;
    private javax.swing.JPanel fondoAceptarContrasenia;
    private javax.swing.JPanel fondoAceptarEmail;
    private javax.swing.JPanel fondoAceptarNombre;
    private javax.swing.JPanel fondoDarseDeBaja;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoContrasenia;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoModifiicar;
    private javax.swing.JLabel textoNombre;
    // End of variables declaration//GEN-END:variables
}
