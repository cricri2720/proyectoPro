package proyectotl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mantenimientoUser extends javax.swing.JFrame {

    public mantenimientoUser() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        agregarUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        admin = new javax.swing.JRadioButton();
        regularUser = new javax.swing.JRadioButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");

        usuarioLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        usuarioLabel.setText("Usuario");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        passwordLabel.setText("Contraseña");

        agregarUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crismely\\Documents\\imagenes\\saveicon2.jpg")); // NOI18N
        agregarUser.setBorder(null);
        agregarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUserActionPerformed(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(255, 255, 255));
        deleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crismely\\Documents\\imagenes\\deleteII.png")); // NOI18N
        deleteUser.setBorder(null);
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        editUser.setBackground(new java.awt.Color(255, 255, 255));
        editUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crismely\\Documents\\imagenes\\edit-new.png")); // NOI18N
        editUser.setBorder(null);
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        limpiarBtn.setBackground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crismely\\Documents\\imagenes\\cleaning-icon1.png")); // NOI18N
        limpiarBtn.setBorder(null);
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setText("Nivel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setText("Email");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");

        regularUser.setBackground(new java.awt.Color(255, 255, 255));
        regularUser.setText("Regular");
        regularUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularUserActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Crismely\\Documents\\imagenes\\searchIcon.png")); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(limpiarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(usuarioLabel)
                            .addComponent(jLabel2)
                            .addComponent(passwordLabel)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(regularUser))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usuarioLabel)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin)
                            .addComponent(regularUser))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editUser)
                        .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void agregarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUserActionPerformed

        //variables
        String user = usuario.getText();
        String pass = new String(password.getPassword());
        String name = nombre.getText();
        String lastname = apellidos.getText();
        String correo = email.getText();
        String nivel = "";

        if (admin.isSelected()) {
            nivel = "admin";
        } else if (regularUser.isSelected()) {
            nivel = "regular";
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt", true)); //se crea el archivo
            bw.write(user + "," + pass + "," + nivel + "," + name + "," + lastname + "," + correo);
            bw.newLine(); //para saltar a la sigt linea 
            bw.close();

            JOptionPane.showMessageDialog(this, "Usuario agregado"); //mensaje

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar");
        }
    }//GEN-LAST:event_agregarUserActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editUserActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void regularUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularUserActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        usuario.setText("");
        password.setText("");
        nombre.setText("");
        apellidos.setText("");
        email.setText("");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String user = usuario.getText();

        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el usuario a buscar");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos[0].equals(user)) {

                    usuario.setText(datos[0]); //se van llenando los campos
                    password.setText(datos[1]);
                    String tipo = datos[2];

                    if (tipo.equals("admin")) {
                        admin.setSelected(true);
                    } else {
                        regularUser.setSelected(true);
                    }
                    nombre.setText(datos[3]);
                    apellidos.setText(datos[4]);
                    email.setText(datos[5]);

                    encontrado = true;
                    //JOptionPane.showMessageDialog(this, "Usuario encontrado");
                    break;
                }
            }
            br.close();

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        String user = usuario.getText();
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay usuario cargado");
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Deseas eliminar este usuario?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion != JOptionPane.YES_OPTION) {
            return;
        }

        ArrayList<String> lista = new ArrayList<>();
        boolean eliminado = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                if (!datos[0].equals(user)) {
                    lista.add(linea); // guardar los que no son ese usuario
                } else {
                    eliminado = true;
                }
            }
            br.close();

            //reescribir el archivo sin ese usuario que se borró
            BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt"));

            for (String l : lista) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                usuario.setText("");
                password.setText("");
                nombre.setText("");
                apellidos.setText("");
                email.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }

    }//GEN-LAST:event_deleteUserActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mantenimientoUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JButton agregarUser;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton buscar;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton editUser;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton regularUser;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
