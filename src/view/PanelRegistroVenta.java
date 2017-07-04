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
public final class PanelRegistroVenta extends javax.swing.JPanel  implements InterfacePanel{

    /**
     * Creates new form PersonalPanel
     */
    private ValidadorDeCampos validador;
    
    public PanelRegistroVenta() {
        initComponents();      
        this.validador = new ValidadorDeCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busquedaCliente = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLineaDeVenta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbtn_Volver = new javax.swing.JButton();
        jbtn_GrabarEImprimir = new javax.swing.JButton();
        jbtn_SalirSinGrabar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlbl_zona_direccion = new javax.swing.JLabel();
        jcb_zona_direccion = new javax.swing.JComboBox<>();
        jlbl_provincia_direccion = new javax.swing.JLabel();
        jcb_provincia_direccion = new javax.swing.JComboBox<>();
        jlbl_localidad_direccion = new javax.swing.JLabel();
        jcb_localidad_direccion = new javax.swing.JComboBox<>();
        jlbl_calle_direccion = new javax.swing.JLabel();
        jtf_calle_direccion = new javax.swing.JTextField();
        jlbl_numero_direccion = new javax.swing.JLabel();
        jtf_numero_direccion = new javax.swing.JTextField();
        jlbl_piso_direccion = new javax.swing.JLabel();
        jtf_piso_direccion = new javax.swing.JTextField();
        jlbl_departamento_direccion = new javax.swing.JLabel();
        jtf_departamento_direccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbl_Unidad = new javax.swing.JLabel();
        jdc_fechaComprobante = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jcb_Unidad = new javax.swing.JComboBox<>();
        jcb_Comprobante = new javax.swing.JComboBox<>();
        jlbl_Comprobante = new javax.swing.JLabel();
        jtf_NumeroComprobante = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jrb_Nombre = new javax.swing.JRadioButton();
        jrb_Codigo = new javax.swing.JRadioButton();
        jrb_CuitDni = new javax.swing.JRadioButton();
        jbtn_Buscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlbl_ID1 = new javax.swing.JLabel();
        jtf_ID = new javax.swing.JTextField();
        jlbl_Nombre1 = new javax.swing.JLabel();
        jtf_Nombre = new javax.swing.JTextField();
        jlbl_Apellido1 = new javax.swing.JLabel();
        jtf_Apellido = new javax.swing.JTextField();
        jlbl_DNI1 = new javax.swing.JLabel();
        jtf_DNI = new javax.swing.JTextField();
        jlbl_tipoCliente1 = new javax.swing.JLabel();
        jcb_tipoCliente = new javax.swing.JComboBox<>();
        jlbl_ctaCte1 = new javax.swing.JLabel();
        jtf_ctaCte = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jlbl_Deposito = new javax.swing.JLabel();
        jcb_Deposito = new javax.swing.JComboBox<>();
        jbtn_CargarItem = new javax.swing.JButton();
        jbtn_ModificarItem = new javax.swing.JButton();
        jbtn_EliminarItem = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(950, 800));
        setMinimumSize(new java.awt.Dimension(950, 800));
        setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "LINEA DE VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(730, 290));
        jPanel2.setLayout(null);

        tablaLineaDeVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaLineaDeVenta);
        if (tablaLineaDeVenta.getColumnModel().getColumnCount() > 0) {
            tablaLineaDeVenta.getColumnModel().getColumn(0).setMinWidth(120);
            tablaLineaDeVenta.getColumnModel().getColumn(0).setPreferredWidth(120);
            tablaLineaDeVenta.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 780, 90);

        add(jPanel2);
        jPanel2.setBounds(10, 480, 820, 130);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Registro de Comprobante");
        add(jLabel4);
        jLabel4.setBounds(300, 0, 220, 30);

        jbtn_Volver.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbtn_Volver.setText("VOLVER");
        add(jbtn_Volver);
        jbtn_Volver.setBounds(260, 690, 170, 25);

        jbtn_GrabarEImprimir.setText("GRABAR E IMPRIMIR");
        add(jbtn_GrabarEImprimir);
        jbtn_GrabarEImprimir.setBounds(660, 690, 170, 23);

        jbtn_SalirSinGrabar.setText("SALIR SIN GRABAR");
        add(jbtn_SalirSinGrabar);
        jbtn_SalirSinGrabar.setBounds(460, 690, 170, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCIÓN DE CLIENTE"));
        jPanel1.setLayout(null);

        jlbl_zona_direccion.setText("Zona:");
        jPanel1.add(jlbl_zona_direccion);
        jlbl_zona_direccion.setBounds(40, 30, 60, 14);

        jPanel1.add(jcb_zona_direccion);
        jcb_zona_direccion.setBounds(150, 30, 330, 22);

        jlbl_provincia_direccion.setText("Provincia:");
        jPanel1.add(jlbl_provincia_direccion);
        jlbl_provincia_direccion.setBounds(40, 60, 60, 14);

        jPanel1.add(jcb_provincia_direccion);
        jcb_provincia_direccion.setBounds(150, 60, 330, 22);

        jlbl_localidad_direccion.setText("Localidad:");
        jPanel1.add(jlbl_localidad_direccion);
        jlbl_localidad_direccion.setBounds(40, 90, 60, 14);

        jPanel1.add(jcb_localidad_direccion);
        jcb_localidad_direccion.setBounds(150, 90, 330, 22);

        jlbl_calle_direccion.setText("Calle:");
        jPanel1.add(jlbl_calle_direccion);
        jlbl_calle_direccion.setBounds(40, 130, 60, 14);
        jPanel1.add(jtf_calle_direccion);
        jtf_calle_direccion.setBounds(150, 130, 330, 20);

        jlbl_numero_direccion.setText("Número:");
        jPanel1.add(jlbl_numero_direccion);
        jlbl_numero_direccion.setBounds(40, 160, 60, 14);
        jPanel1.add(jtf_numero_direccion);
        jtf_numero_direccion.setBounds(150, 160, 330, 20);

        jlbl_piso_direccion.setText("Piso:");
        jPanel1.add(jlbl_piso_direccion);
        jlbl_piso_direccion.setBounds(40, 190, 60, 14);
        jPanel1.add(jtf_piso_direccion);
        jtf_piso_direccion.setBounds(150, 190, 330, 20);

        jlbl_departamento_direccion.setText("Departamento:");
        jPanel1.add(jlbl_departamento_direccion);
        jlbl_departamento_direccion.setBounds(40, 220, 90, 14);
        jPanel1.add(jtf_departamento_direccion);
        jtf_departamento_direccion.setBounds(150, 220, 330, 20);

        add(jPanel1);
        jPanel1.setBounds(330, 160, 500, 250);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 0, 51));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("N° ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(460, 10, 25, 20);

        jlbl_Unidad.setText("UNIDAD:");
        jPanel3.add(jlbl_Unidad);
        jlbl_Unidad.setBounds(10, 10, 50, 20);
        jPanel3.add(jdc_fechaComprobante);
        jdc_fechaComprobante.setBounds(720, 10, 80, 20);

        jLabel8.setText("FECHA:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(640, 10, 60, 20);

        jPanel3.add(jcb_Unidad);
        jcb_Unidad.setBounds(70, 10, 140, 22);

        jPanel3.add(jcb_Comprobante);
        jcb_Comprobante.setBounds(330, 10, 120, 22);

        jlbl_Comprobante.setBackground(new java.awt.Color(255, 0, 51));
        jlbl_Comprobante.setText("COMPROBANTE:");
        jPanel3.add(jlbl_Comprobante);
        jlbl_Comprobante.setBounds(220, 10, 100, 20);
        jPanel3.add(jtf_NumeroComprobante);
        jtf_NumeroComprobante.setBounds(490, 10, 130, 20);

        add(jPanel3);
        jPanel3.setBounds(10, 100, 820, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente por:"));
        jPanel4.setLayout(null);

        busquedaCliente.add(jrb_Nombre);
        jrb_Nombre.setSelected(true);
        jrb_Nombre.setText("Nombre");
        jrb_Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jrb_Nombre);
        jrb_Nombre.setBounds(10, 20, 80, 20);

        busquedaCliente.add(jrb_Codigo);
        jrb_Codigo.setText("Codiigo");
        jPanel4.add(jrb_Codigo);
        jrb_Codigo.setBounds(120, 20, 80, 20);

        busquedaCliente.add(jrb_CuitDni);
        jrb_CuitDni.setText("CUIT-DNI");
        jPanel4.add(jrb_CuitDni);
        jrb_CuitDni.setBounds(220, 20, 80, 20);

        jbtn_Buscar.setText("BUSCAR");
        jPanel4.add(jbtn_Buscar);
        jbtn_Buscar.setBounds(663, 20, 130, 23);

        add(jPanel4);
        jPanel4.setBounds(10, 30, 820, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));
        jPanel5.setLayout(null);

        jlbl_ID1.setText("ID:");
        jPanel5.add(jlbl_ID1);
        jlbl_ID1.setBounds(20, 30, 60, 14);
        jPanel5.add(jtf_ID);
        jtf_ID.setBounds(100, 30, 200, 20);

        jlbl_Nombre1.setText("Nombre:");
        jPanel5.add(jlbl_Nombre1);
        jlbl_Nombre1.setBounds(20, 90, 60, 14);
        jPanel5.add(jtf_Nombre);
        jtf_Nombre.setBounds(100, 90, 200, 20);

        jlbl_Apellido1.setText("Apellido:");
        jPanel5.add(jlbl_Apellido1);
        jlbl_Apellido1.setBounds(20, 190, 60, 14);
        jPanel5.add(jtf_Apellido);
        jtf_Apellido.setBounds(100, 190, 200, 20);

        jlbl_DNI1.setText("DNI - CUIT:");
        jPanel5.add(jlbl_DNI1);
        jlbl_DNI1.setBounds(20, 160, 60, 14);
        jPanel5.add(jtf_DNI);
        jtf_DNI.setBounds(100, 160, 200, 20);

        jlbl_tipoCliente1.setText("Tipo Cliente:");
        jPanel5.add(jlbl_tipoCliente1);
        jlbl_tipoCliente1.setBounds(20, 120, 70, 14);

        jPanel5.add(jcb_tipoCliente);
        jcb_tipoCliente.setBounds(100, 120, 200, 22);

        jlbl_ctaCte1.setText("CTA / CTE:");
        jPanel5.add(jlbl_ctaCte1);
        jlbl_ctaCte1.setBounds(20, 220, 60, 14);
        jPanel5.add(jtf_ctaCte);
        jtf_ctaCte.setBounds(100, 220, 200, 20);

        add(jPanel5);
        jPanel5.setBounds(10, 160, 310, 250);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DEPOSITO")));
        jPanel6.setLayout(null);

        jlbl_Deposito.setText("DEPOSITO:");
        jPanel6.add(jlbl_Deposito);
        jlbl_Deposito.setBounds(20, 20, 70, 20);

        jPanel6.add(jcb_Deposito);
        jcb_Deposito.setBounds(100, 20, 200, 22);

        add(jPanel6);
        jPanel6.setBounds(10, 620, 820, 60);

        jbtn_CargarItem.setText("CARGAR ITEM");
        add(jbtn_CargarItem);
        jbtn_CargarItem.setBounds(370, 430, 130, 30);

        jbtn_ModificarItem.setText("MODIFICAR ITEM");
        add(jbtn_ModificarItem);
        jbtn_ModificarItem.setBounds(530, 430, 130, 30);

        jbtn_EliminarItem.setText("ELIMINAR ITEM");
        add(jbtn_EliminarItem);
        jbtn_EliminarItem.setBounds(680, 430, 130, 30);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DEPOSITO")));
        jPanel7.setLayout(null);

        jLabel11.setText("DEPOSITO:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(20, 20, 70, 20);

        jPanel7.add(jComboBox6);
        jComboBox6.setBounds(100, 20, 200, 22);

        add(jPanel7);
        jPanel7.setBounds(10, 410, 310, 60);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup busquedaCliente;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_Buscar;
    private javax.swing.JButton jbtn_CargarItem;
    private javax.swing.JButton jbtn_EliminarItem;
    private javax.swing.JButton jbtn_GrabarEImprimir;
    private javax.swing.JButton jbtn_ModificarItem;
    private javax.swing.JButton jbtn_SalirSinGrabar;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JComboBox<String> jcb_Comprobante;
    private javax.swing.JComboBox<String> jcb_Deposito;
    private javax.swing.JComboBox<String> jcb_Unidad;
    private javax.swing.JComboBox<String> jcb_localidad_direccion;
    private javax.swing.JComboBox<String> jcb_provincia_direccion;
    private javax.swing.JComboBox<String> jcb_tipoCliente;
    private javax.swing.JComboBox<String> jcb_zona_direccion;
    private com.toedter.calendar.JDateChooser jdc_fechaComprobante;
    private javax.swing.JLabel jlbl_Apellido1;
    private javax.swing.JLabel jlbl_Comprobante;
    private javax.swing.JLabel jlbl_DNI1;
    private javax.swing.JLabel jlbl_Deposito;
    private javax.swing.JLabel jlbl_ID1;
    private javax.swing.JLabel jlbl_Nombre1;
    private javax.swing.JLabel jlbl_Unidad;
    private javax.swing.JLabel jlbl_calle_direccion;
    private javax.swing.JLabel jlbl_ctaCte1;
    private javax.swing.JLabel jlbl_departamento_direccion;
    private javax.swing.JLabel jlbl_localidad_direccion;
    private javax.swing.JLabel jlbl_numero_direccion;
    private javax.swing.JLabel jlbl_piso_direccion;
    private javax.swing.JLabel jlbl_provincia_direccion;
    private javax.swing.JLabel jlbl_tipoCliente1;
    private javax.swing.JLabel jlbl_zona_direccion;
    private javax.swing.JRadioButton jrb_Codigo;
    private javax.swing.JRadioButton jrb_CuitDni;
    private javax.swing.JRadioButton jrb_Nombre;
    private javax.swing.JTextField jtf_Apellido;
    private javax.swing.JTextField jtf_DNI;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_NumeroComprobante;
    private javax.swing.JTextField jtf_calle_direccion;
    private javax.swing.JTextField jtf_ctaCte;
    private javax.swing.JTextField jtf_departamento_direccion;
    private javax.swing.JTextField jtf_numero_direccion;
    private javax.swing.JTextField jtf_piso_direccion;
    private javax.swing.JTable tablaLineaDeVenta;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void setControlador(Controller c) {
        
        //Agrega Botones al Escuchador ActionListener para manejar los eventos realizados         
        jbtn_Buscar.addActionListener(c); 
        jbtn_CargarItem.addActionListener(c); 
        jbtn_ModificarItem.addActionListener(c); 
        jbtn_EliminarItem.addActionListener(c); 
        jbtn_Volver.addActionListener(c); 
        jbtn_SalirSinGrabar.addActionListener(c); 
        jbtn_GrabarEImprimir.addActionListener(c); 
        
        //Agrega JcomboBox del Panel Direccion al escuchador ItemListener para verificar items seleccionados
        jcb_Unidad.addItemListener(c);
        jcb_Comprobante.addItemListener(c);
        jcb_tipoCliente.addItemListener(c);
        jcb_zona_direccion.addItemListener(c);
        jcb_provincia_direccion.addItemListener(c);
        jcb_localidad_direccion.addItemListener(c);
        jcb_Deposito.addItemListener(c);
        
        //Agrega JcomboBox del Panel Direccion al escuchador FocusListener para verificar items seleccionados
        jcb_Unidad.addFocusListener(c);
        jcb_Comprobante.addFocusListener(c);
        jcb_tipoCliente.addFocusListener(c);
        jcb_zona_direccion.addFocusListener(c);
        jcb_provincia_direccion.addFocusListener(c);
        jcb_localidad_direccion.addFocusListener(c);
        jcb_Deposito.addFocusListener(c);
        
        //Agrega JTextField del Panel Direccion al escuchador KeyListener para verificar campos ingresados     
        jtf_NumeroComprobante.addKeyListener(c);
        jtf_ID.addKeyListener(c);
        jtf_Nombre.addKeyListener(c);
        jtf_DNI.addKeyListener(c);
        jtf_Apellido.addKeyListener(c);
        jtf_ctaCte.addKeyListener(c);
        jtf_calle_direccion.addKeyListener(c);
        jtf_numero_direccion.addKeyListener(c);
        jtf_piso_direccion.addKeyListener(c);
        jtf_departamento_direccion.addKeyListener(c);
        
        //Agrego la tabla al escuchador Mouse Listener para verificar elementos seleccionados
        tablaLineaDeVenta.addMouseListener(c);
        
        //Botones de Radio        
        jrb_Codigo.addItemListener(c);
        jrb_CuitDni.addItemListener(c);
        jrb_Nombre.addItemListener(c);
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

    
    
    
    /*
    BOTONES del PANEL
    */        
    public javax.swing.JTable getTablaLineaDeVenta() {
        return tablaLineaDeVenta;
    }

    public javax.swing.JButton getJbtn_Buscar() {
        return jbtn_Buscar;
    }

    public javax.swing.JButton getJbtn_CargarItem() {
        return jbtn_CargarItem;
    }

    public javax.swing.JButton getJbtn_EliminarItem() {
        return jbtn_EliminarItem;
    }

    public javax.swing.JButton getJbtn_GrabarEImprimir() {
        return jbtn_GrabarEImprimir;
    }

    public javax.swing.JButton getJbtn_ModificarItem() {
        return jbtn_ModificarItem;
    }

    public javax.swing.JButton getJbtn_SalirSinGrabar() {
        return jbtn_SalirSinGrabar;
    }

    public javax.swing.JButton getJbtn_Volver() {
        return jbtn_Volver;
    }

    
     /*
    CAMPOS del PANEL Getters y Setters
    */
    public javax.swing.JTextField getJtf_Apellido() {
        return jtf_Apellido;
    }

    public void setJtf_Apellido(javax.swing.JTextField jtf_Apellido) {
        this.jtf_Apellido = jtf_Apellido;
    }

    public javax.swing.JTextField getJtf_DNI() {
        return jtf_DNI;
    }

    public void setJtf_DNI(javax.swing.JTextField jtf_DNI) {
        this.jtf_DNI = jtf_DNI;
    }

    public javax.swing.JTextField getJtf_ID() {
        return jtf_ID;
    }

    public void setJtf_ID(javax.swing.JTextField jtf_ID) {
        this.jtf_ID = jtf_ID;
    }

    public javax.swing.JTextField getJtf_Nombre() {
        return jtf_Nombre;
    }

    public void setJtf_Nombre(javax.swing.JTextField jtf_Nombre) {
        this.jtf_Nombre = jtf_Nombre;
    }

    public javax.swing.JTextField getJtf_NumeroComprobante() {
        return jtf_NumeroComprobante;
    }

    public void setJtf_NumeroComprobante(javax.swing.JTextField jtf_NumeroComprobante) {
        this.jtf_NumeroComprobante = jtf_NumeroComprobante;
    }

    public javax.swing.JTextField getJtf_calle_direccion() {
        return jtf_calle_direccion;
    }

    public void setJtf_calle_direccion(javax.swing.JTextField jtf_calle_direccion) {
        this.jtf_calle_direccion = jtf_calle_direccion;
    }

    public javax.swing.JTextField getJtf_ctaCte() {
        return jtf_ctaCte;
    }

    public void setJtf_ctaCte(javax.swing.JTextField jtf_ctaCte) {
        this.jtf_ctaCte = jtf_ctaCte;
    }

    public javax.swing.JTextField getJtf_departamento_direccion() {
        return jtf_departamento_direccion;
    }

    public void setJtf_departamento_direccion(javax.swing.JTextField jtf_departamento_direccion) {
        this.jtf_departamento_direccion = jtf_departamento_direccion;
    }

    public javax.swing.JTextField getJtf_numero_direccion() {
        return jtf_numero_direccion;
    }

    public void setJtf_numero_direccion(javax.swing.JTextField jtf_numero_direccion) {
        this.jtf_numero_direccion = jtf_numero_direccion;
    }

    public javax.swing.JTextField getJtf_piso_direccion() {
        return jtf_piso_direccion;
    }

    public void setJtf_piso_direccion(javax.swing.JTextField jtf_piso_direccion) {
        this.jtf_piso_direccion = jtf_piso_direccion;
    }

     /*
    CAMPOS del PANEL Getters y Setters JComboBox
    */

    public javax.swing.JComboBox<String> getJcb_Comprobante() {
        return jcb_Comprobante;
    }

    public void setJcb_Comprobante(javax.swing.JComboBox<String> jcb_Comprobante) {
        this.jcb_Comprobante = jcb_Comprobante;
    }

    public javax.swing.JComboBox<String> getJcb_Deposito() {
        return jcb_Deposito;
    }

    public void setJcb_Deposito(javax.swing.JComboBox<String> jcb_Deposito) {
        this.jcb_Deposito = jcb_Deposito;
    }

    public javax.swing.JComboBox<String> getJcb_Unidad() {
        return jcb_Unidad;
    }

    public void setJcb_Unidad(javax.swing.JComboBox<String> jcb_Unidad) {
        this.jcb_Unidad = jcb_Unidad;
    }

    public javax.swing.JComboBox<String> getJcb_localidad_direccion() {
        return jcb_localidad_direccion;
    }

    public void setJcb_localidad_direccion(javax.swing.JComboBox<String> jcb_localidad_direccion) {
        this.jcb_localidad_direccion = jcb_localidad_direccion;
    }

    public javax.swing.JComboBox<String> getJcb_provincia_direccion() {
        return jcb_provincia_direccion;
    }

    public void setJcb_provincia_direccion(javax.swing.JComboBox<String> jcb_provincia_direccion) {
        this.jcb_provincia_direccion = jcb_provincia_direccion;
    }

    public javax.swing.JComboBox<String> getJcb_tipoCliente() {
        return jcb_tipoCliente;
    }

    public void setJcb_tipoCliente(javax.swing.JComboBox<String> jcb_tipoCliente) {
        this.jcb_tipoCliente = jcb_tipoCliente;
    }

    public javax.swing.JComboBox<String> getJcb_zona_direccion() {
        return jcb_zona_direccion;
    }

    public void setJcb_zona_direccion(javax.swing.JComboBox<String> jcb_zona_direccion) {
        this.jcb_zona_direccion = jcb_zona_direccion;
    }

    public com.toedter.calendar.JDateChooser getJdc_fechaComprobante() {
        return jdc_fechaComprobante;
    }

    public void setJdc_fechaComprobante(com.toedter.calendar.JDateChooser jdc_fechaComprobante) {
        this.jdc_fechaComprobante = jdc_fechaComprobante;
    }

    public javax.swing.JRadioButton getJrb_Codigo() {
        return jrb_Codigo;
    }

    public javax.swing.JRadioButton getJrb_CuitDni() {
        return jrb_CuitDni;
    }

    public javax.swing.JRadioButton getJrb_Nombre() {
        return jrb_Nombre;
    }

    
    
    
    
}