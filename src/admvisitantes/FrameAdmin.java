package admvisitantes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class FrameAdmin extends javax.swing.JFrame {

    private DefaultTableModel model;
    private Connection con;
    private Statement sent;

    String[] fila;
    public FrameAdmin() {
        initComponents();

        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        con = ConexionDB.getConnection();
        jplUsuarios.setVisible(false);
        jplNuevoUsuario.setVisible(false);
        setSize(460, 380);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplInicioAdmin = new javax.swing.JPanel();
        jlAdministrador = new javax.swing.JLabel();
        jplNuevoUsuario = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jlPerfil = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jcbPerfil = new javax.swing.JComboBox();
        jplUsuarios = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnSalirUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplInicioAdmin.setForeground(new java.awt.Color(0, 204, 204));

        jlAdministrador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlAdministrador.setText("Administrador");

        javax.swing.GroupLayout jplInicioAdminLayout = new javax.swing.GroupLayout(jplInicioAdmin);
        jplInicioAdmin.setLayout(jplInicioAdminLayout);
        jplInicioAdminLayout.setHorizontalGroup(
            jplInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplInicioAdminLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jlAdministrador)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jplInicioAdminLayout.setVerticalGroup(
            jplInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplInicioAdminLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jlAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );

        jplNuevoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del nuevo usuario"));

        jlNombre.setText("Nombre: ");

        jlApellido.setText("Apellido:");

        jlUsuario.setText("Usuario:");

        jlPassword.setText("Contraseña:");

        jlPerfil.setText("Perfil de Usuario:  ");

        btnAgregarUsuario.setText("Guardar");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una opción", "Administrador", "Portero" }));
        jcbPerfil.setName("jcbPerfil"); // NOI18N
        jcbPerfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPerfilItemStateChanged(evt);
            }
        });
        jcbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplNuevoUsuarioLayout = new javax.swing.GroupLayout(jplNuevoUsuario);
        jplNuevoUsuario.setLayout(jplNuevoUsuarioLayout);
        jplNuevoUsuarioLayout.setHorizontalGroup(
            jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                        .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                        .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                                        .addComponent(btnAgregarUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar))
                                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jplNuevoUsuarioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfApellido, jtfNombre, jtfPassword, jtfUsuario});

        jplNuevoUsuarioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlApellido, jlNombre, jlPassword, jlPerfil, jlUsuario});

        jplNuevoUsuarioLayout.setVerticalGroup(
            jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jlApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jplNuevoUsuarioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtfApellido, jtfNombre, jtfPassword, jtfUsuario});

        jplNuevoUsuarioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlApellido, jlNombre, jlPassword, jlPerfil, jlUsuario});

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnSalirUsuario.setText("Salir");

        jtUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuarios.setEditingColumn(0);
        jtUsuarios.setEditingRow(0);
        jtUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtUsuarios);
        if (jtUsuarios.getColumnModel().getColumnCount() > 0) {
            jtUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jtUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jtUsuarios.getColumnModel().getColumn(2).setResizable(false);
            jtUsuarios.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jplUsuariosLayout = new javax.swing.GroupLayout(jplUsuarios);
        jplUsuarios.setLayout(jplUsuariosLayout);
        jplUsuariosLayout.setHorizontalGroup(
            jplUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplUsuariosLayout.createSequentialGroup()
                .addGroup(jplUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplUsuariosLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jplUsuariosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnModificarUsuario, btnNuevo});

        jplUsuariosLayout.setVerticalGroup(
            jplUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jplUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificarUsuario)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnSalirUsuario)))
        );

        jplUsuariosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminarUsuario, btnModificarUsuario, btnNuevo});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Mantenimiento");

        jMenuItem2.setText("Usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eventos");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Invitados");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Invitaciones");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Reportes");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones de portero");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jplInicioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jplNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jplUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jplInicioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 295, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jplUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jplNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenarTabla() {
        try {
            TitledBorder title = BorderFactory.createTitledBorder("Usuarios registrados");
            jplUsuarios.setBorder(title);
            con = ConexionDB.getConnection();
            String[] titulos = {"Nombre", "Apellido", "Usuario", "Contraseña", "Perfil de usuario"};
            String sql = "select * from Usuarios";
            model = new DefaultTableModel(null, titulos);
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            fila = new String[5];
            while (rs.next()) {
                fila[0] = rs.getString("Nombre");
                fila[1] = rs.getString("Apellido");
                fila[2] = rs.getString("Usuario");
                fila[3] = rs.getString("Contraseña");
                fila[4] = rs.getString("Perfil_usuario");
                model.addRow(fila);
            }
            jtUsuarios.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if(!jtfNombre.getText().isEmpty() || !jtfApellido.getText().isEmpty() || !jtfUsuario.getText().isEmpty() || !jtfPassword.getText().isEmpty()){
            jtfNombre.setText("");
            jtfApellido.setText("");
            jtfUsuario.setText("");
            jtfPassword.setText("");
        }
        jplNuevoUsuario.setVisible(true);
        this.setSize(520, 600);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        try {
            String textJCBPerfil = (String)jcbPerfil.getSelectedItem();
            String sql = "insert into Usuarios(Nombre, Apellido, Usuario, Contraseña, Perfil_usuario)values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, jtfNombre.getText());
            ps.setString(2, jtfApellido.getText());
            ps.setString(3, jtfUsuario.getText());
            ps.setString(4, jtfPassword.getText());
            ps.setString(5, textJCBPerfil);
            
            int n = ps.executeUpdate();
            if (n > 0){
                JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getCause());
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        llenarTabla();
        this.setSize(520, 300);
        jplNuevoUsuario.setVisible(false);
        jplUsuarios.setVisible(true);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void jcbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPerfilActionPerformed

    private void jcbPerfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPerfilItemStateChanged
        if (evt.getSource()==jcbPerfil) {
            String seleccionado=(String)jcbPerfil.getSelectedItem();
            setTitle(seleccionado);
        }
    }//GEN-LAST:event_jcbPerfilItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jplNuevoUsuario.setVisible(false);
        this.setSize(520, 300);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        int fila = jtUsuarios.getSelectedRow();
        try{
            String sql = "select * from Usuarios where Usuario = '"+jtUsuarios.getValueAt(fila, 2)+"'";
            sent = con.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            rs.next();
            jtfNombre.setText(rs.getString("Nombre"));
            jtfApellido.setText(rs.getString("Apellido"));
            jtfUsuario.setText(rs.getString("Usuario"));
            jtfPassword.setText(rs.getString("Contraseña"));
            jplNuevoUsuario.setVisible(true);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jplInicioAdmin.setVisible(false);
        llenarTabla();
        this.setSize(520, 300);
        jplUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        try{
            int fila = jtUsuarios.getSelectedRow();
            String sql = "delete from Usuarios where usuario = '"+jtUsuarios.getValueAt(fila, 2)+"'";
            sent = con.createStatement();
            int n = sent.executeUpdate(sql);
            if(n > 0){
                llenarTabla();
                JOptionPane.showMessageDialog(null, "Los datos han sido eliminados!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalirUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbPerfil;
    private javax.swing.JLabel jlAdministrador;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlPerfil;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jplInicioAdmin;
    private javax.swing.JPanel jplNuevoUsuario;
    private javax.swing.JPanel jplUsuarios;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
