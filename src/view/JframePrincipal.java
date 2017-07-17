/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author Ariel
 */
public class JframePrincipal extends javax.swing.JFrame implements InterfaceView{
    
    private String tipoUsuario = null;
    public static javax.swing.JPanel getjPanelArbol() {
        return jPanelArbol;
    }

    public static void setjPanelArbol(javax.swing.JPanel ajPanelArbol) {
        jPanelArbol = ajPanelArbol;
    }

    /**
     * Creates new form PersonaView
     */
    private static PanelArbolAdministrador unPanelArbolAdministrador = null;
    private static PanelArbolUsuario unPanelArbolUsuario = null;
    private static PanelContenedor unPanelContenedor = null;
    public JframePrincipal() {
        try {
            //Icono de la aplicacion
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo.png")).getImage());
            
        } catch (Exception e) {
        }
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

        jButton1 = new javax.swing.JButton();
        JpanelContenedor = new javax.swing.JPanel();
        jPanelContenido = new javax.swing.JPanel();
        jPanelArbol = new javax.swing.JPanel();
        jpanel_Usuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbl_usuario = new javax.swing.JLabel();
        jlbl_TipoUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GuraSoft");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        JpanelContenedor.setBackground(new java.awt.Color(0, 153, 153));
        JpanelContenedor.setMaximumSize(new java.awt.Dimension(1200, 791));
        JpanelContenedor.setPreferredSize(new java.awt.Dimension(1200, 791));
        JpanelContenedor.setLayout(null);

        jPanelContenido.setBackground(new java.awt.Color(0, 0, 0));
        jPanelContenido.setMaximumSize(null);
        jPanelContenido.setMinimumSize(new java.awt.Dimension(950, 750));
        jPanelContenido.setPreferredSize(new java.awt.Dimension(950, 750));
        jPanelContenido.setRequestFocusEnabled(false);
        jPanelContenido.setLayout(null);
        JpanelContenedor.add(jPanelContenido);
        jPanelContenido.setBounds(350, 0, 850, 750);

        jPanelArbol.setBackground(new java.awt.Color(255, 153, 204));
        jPanelArbol.setAutoscrolls(true);
        jPanelArbol.setMaximumSize(new java.awt.Dimension(350, 1200));
        jPanelArbol.setMinimumSize(new java.awt.Dimension(350, 750));
        jPanelArbol.setPreferredSize(new java.awt.Dimension(350, 750));
        jPanelArbol.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanelArbolAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelArbol.setLayout(null);
        JpanelContenedor.add(jPanelArbol);
        jPanelArbol.setBounds(0, 0, 350, 750);

        jpanel_Usuario.setLayout(null);

        jLabel1.setText("USUARIO:");
        jpanel_Usuario.add(jLabel1);
        jLabel1.setBounds(10, 0, 60, 20);
        jpanel_Usuario.add(jlbl_usuario);
        jlbl_usuario.setBounds(80, 0, 150, 20);
        jpanel_Usuario.add(jlbl_TipoUsuario);
        jlbl_TipoUsuario.setBounds(450, 0, 180, 20);

        jLabel4.setText("TIPO USUARIO:");
        jpanel_Usuario.add(jLabel4);
        jLabel4.setBounds(350, 0, 90, 20);

        JpanelContenedor.add(jpanel_Usuario);
        jpanel_Usuario.setBounds(0, 750, 1200, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelArbolAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanelArbolAncestorAdded
        jPanelContenido.repaint();
        jPanelArbol.repaint();
    }//GEN-LAST:event_jPanelArbolAncestorAdded



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelContenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel jPanelArbol;
    public static javax.swing.JPanel jPanelContenido;
    private javax.swing.JLabel jlbl_TipoUsuario;
    private javax.swing.JLabel jlbl_usuario;
    private javax.swing.JPanel jpanel_Usuario;
    // End of variables declaration//GEN-END:variables



    @Override
    public void arranca() {
        
        if (this.tipoUsuario.equals("1")) {
            unPanelArbolAdministrador = new PanelArbolAdministrador();
            unPanelArbolAdministrador.setSize(350, 750);
            unPanelArbolAdministrador.setLocation(0, 0);

            unPanelContenedor = new PanelContenedor();
            unPanelContenedor.setSize(950, 750);
            unPanelContenedor.setLocation(0, 0);

           jPanelArbol.removeAll();
           jPanelArbol.add(unPanelArbolAdministrador, BorderLayout.NORTH);
           jPanelArbol.repaint();
        }else{
            unPanelArbolUsuario = new PanelArbolUsuario();
            unPanelArbolUsuario.setSize(350, 750);
            unPanelArbolUsuario.setLocation(0, 0);

            unPanelContenedor = new PanelContenedor();
            unPanelContenedor.setSize(950, 750);
            unPanelContenedor.setLocation(0, 0);

           jPanelArbol.removeAll();
           jPanelArbol.add(unPanelArbolUsuario, BorderLayout.NORTH);
           jPanelArbol.repaint();
        
        }
        
       
       jPanelContenido.removeAll();
       jPanelContenido.add(unPanelContenedor, BorderLayout.NORTH);
       jPanelContenido.repaint();
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }

    public static void habilitarArbol(boolean valor) {
        if (unPanelArbolAdministrador!=null) {
            unPanelArbolAdministrador.habilitarArbol(valor);
        }
        if (unPanelArbolUsuario!=null){
            unPanelArbolUsuario.habilitarArbol(valor);
        }    

    }
    
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public javax.swing.JLabel getJlbl_TipoUsuario() {
        return jlbl_TipoUsuario;
    }

    public void setJlbl_TipoUsuario(javax.swing.JLabel jlbl_TipoUsuario) {
        this.jlbl_TipoUsuario = jlbl_TipoUsuario;
    }

    public javax.swing.JLabel getJlbl_usuario() {
        return jlbl_usuario;
    }

    public void setJlbl_usuario(javax.swing.JLabel jlbl_usuario) {
        this.jlbl_usuario = jlbl_usuario;
    }

    
}
