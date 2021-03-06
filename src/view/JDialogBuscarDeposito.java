/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Ariel
 */
public class JDialogBuscarDeposito extends javax.swing.JDialog implements InterfacePanel {

    private ValidadorDeCampos validador;
    /**
     * Constructor JDialog Buscar Deposito
     * @param parent padre al que pertenece
     * @param modal mientras este activo el JDialog todos los demas elementos quedan inactivos
     */
    public JDialogBuscarDeposito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.validador = new ValidadorDeCampos();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jtf_BuscarDeposito = new javax.swing.JTextField();
        jlbl_TituloBusqueda = new javax.swing.JLabel();
        jTabbedPaneContenedor = new javax.swing.JTabbedPane();
        jPanelEmpleado = new javax.swing.JPanel();
        jlbl_descripcion = new javax.swing.JLabel();
        jlbl_ID = new javax.swing.JLabel();
        jtf_ID = new javax.swing.JTextField();
        jtf_descripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcb_Unidad = new javax.swing.JComboBox<>();
        jlbl_unidad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaDeDeposito = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbl_TituloBusqueda.setText("Deposito:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_TituloBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_BuscarDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_BuscarDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_TituloBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 20, 580, 50);

        jPanelEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEmpleado.setName("Empleado"); // NOI18N
        jPanelEmpleado.setLayout(null);

        jlbl_descripcion.setText("Descripción:");
        jPanelEmpleado.add(jlbl_descripcion);
        jlbl_descripcion.setBounds(60, 80, 100, 14);

        jlbl_ID.setText("ID:");
        jPanelEmpleado.add(jlbl_ID);
        jlbl_ID.setBounds(60, 40, 90, 14);
        jPanelEmpleado.add(jtf_ID);
        jtf_ID.setBounds(160, 40, 272, 20);
        jPanelEmpleado.add(jtf_descripcion);
        jtf_descripcion.setBounds(160, 80, 272, 20);
        jPanelEmpleado.add(jLabel1);
        jLabel1.setBounds(450, 40, 210, 0);

        jPanelEmpleado.add(jcb_Unidad);
        jcb_Unidad.setBounds(160, 120, 270, 22);

        jlbl_unidad.setText("Unidad:");
        jPanelEmpleado.add(jlbl_unidad);
        jlbl_unidad.setBounds(60, 120, 60, 14);

        jTabbedPaneContenedor.addTab("Deposito", jPanelEmpleado);

        jPanel1.add(jTabbedPaneContenedor);
        jTabbedPaneContenedor.setBounds(10, 330, 580, 200);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lista de Depositos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(730, 290));
        jPanel2.setLayout(null);

        jbtn_Agregar.setText("Agregar");
        jPanel2.add(jbtn_Agregar);
        jbtn_Agregar.setBounds(30, 190, 80, 30);

        tablaListaDeDeposito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListaDeDeposito);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 500, 150);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 580, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneContenedor;
    private javax.swing.JButton jbtn_Agregar;
    private javax.swing.JComboBox<String> jcb_Unidad;
    private javax.swing.JLabel jlbl_ID;
    private javax.swing.JLabel jlbl_TituloBusqueda;
    private javax.swing.JLabel jlbl_descripcion;
    private javax.swing.JLabel jlbl_unidad;
    private javax.swing.JTextField jtf_BuscarDeposito;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTable tablaListaDeDeposito;
    // End of variables declaration//GEN-END:variables


    @Override
    public void setControlador(Controller c) {
    try {
        //Agrega Botones al Escuchador ActionListener para manejar los eventos realizados
        jbtn_Agregar.addActionListener(c);
        
        
        //Agrega JTextField del Panel Datos del Empleado al escuchador KeyListener para verificar campos ingresados
        
        jtf_ID.addActionListener(c);
        jtf_descripcion.addActionListener(c);
        
        jtf_BuscarDeposito.addKeyListener(c);
        jtf_BuscarDeposito.addFocusListener(c);
        
        //Agrego la tabla al escuchador Mouse Listener para verificar elementos seleccionados
        tablaListaDeDeposito.addMouseListener(c);
    } catch (Exception e) {
    }
        
    }

    @Override
    public void limpiarCampo(JTextField campo){
        campo.setText("");        
    }
    
    @Override
    public void habilitarCampo(boolean h, JTextField campo){
        campo.setEditable(h);
        
    }

    @Override
   public void habilitarBoton(boolean h, JButton btn){
       btn.setEnabled(h);
   }

    @Override
    public ValidadorDeCampos getValidador() {
        return validador;
    }
    

    @Override
    public void habilitarCombobox(boolean h, JComboBox campo) {
        campo.setEnabled(h);
    }

    @Override
    public void limpiarCombobox(JComboBox campo) {
        campo.removeAllItems();
    }

    public javax.swing.JButton getJbtn_AgregarDeposito() {
        return jbtn_Agregar;
    }
    

    public javax.swing.JLabel getJlbl_TituloBusqueda() {
        return jlbl_TituloBusqueda;
    }

    public void setJlbl_TituloBusqueda(javax.swing.JLabel jlbl_TituloBusqueda) {
        this.jlbl_TituloBusqueda = jlbl_TituloBusqueda;
    }

    public javax.swing.JComboBox<String> getJcb_Unidad() {
        return jcb_Unidad;
    }

    public void setJcb_Unidad(javax.swing.JComboBox<String> jcb_Unidad) {
        this.jcb_Unidad = jcb_Unidad;
    }

    public javax.swing.JTextField getJtf_BuscarDeposito() {
        return jtf_BuscarDeposito;
    }

    public void setJtf_BuscarDeposito(javax.swing.JTextField jtf_BuscarDeposito) {
        this.jtf_BuscarDeposito = jtf_BuscarDeposito;
    }

    public javax.swing.JTextField getJtf_ID() {
        return jtf_ID;
    }

    public void setJtf_ID(javax.swing.JTextField jtf_ID) {
        this.jtf_ID = jtf_ID;
    }

    public javax.swing.JTextField getJtf_descripcion() {
        return jtf_descripcion;
    }

    public void setJtf_descripcion(javax.swing.JTextField jtf_descripcion) {
        this.jtf_descripcion = jtf_descripcion;
    }

    public javax.swing.JTable getTablaListaDeDeposito() {
        return tablaListaDeDeposito;
    }

    public void setTablaListaDeDeposito(javax.swing.JTable tablaListaDeDeposito) {
        this.tablaListaDeDeposito = tablaListaDeDeposito;
    }
    
    
}
