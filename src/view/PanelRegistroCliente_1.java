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
public final class PanelRegistroCliente_1 extends javax.swing.JPanel  implements InterfacePanel{

    /**
     * Creates new form PersonalPanel
     */
    private ValidadorDeCampos validador;
    
    public PanelRegistroCliente_1() {
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
        tablaEmpleados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbtn_Volver = new javax.swing.JButton();
        jbtn_Aceptar = new javax.swing.JButton();
        jbtn_Cancelar = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jrb_Nombre = new javax.swing.JRadioButton();
        jrb_Codigo = new javax.swing.JRadioButton();
        jrb_CuitDni = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlbl_ID1 = new javax.swing.JLabel();
        jtf_ID1 = new javax.swing.JTextField();
        jlbl_Nombre1 = new javax.swing.JLabel();
        jtf_Nombre1 = new javax.swing.JTextField();
        jlbl_Apellido1 = new javax.swing.JLabel();
        jtf_Apellido1 = new javax.swing.JTextField();
        jlbl_DNI1 = new javax.swing.JLabel();
        jtf_DNI1 = new javax.swing.JTextField();
        jlbl_tipoCliente1 = new javax.swing.JLabel();
        jcb_tipoCliente1 = new javax.swing.JComboBox<>();
        jlbl_ctaCte1 = new javax.swing.JLabel();
        jtf_ctaCte1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jbtn_Nuevo = new javax.swing.JButton();
        jbtn_Modificar = new javax.swing.JButton();
        jbtn_Eliminar = new javax.swing.JButton();
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

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(0).setMinWidth(120);
            tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(120);
            tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(120);
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
        jbtn_Volver.setBounds(260, 690, 170, 26);

        jbtn_Aceptar.setText("GRABAR E IMPRIMIR");
        add(jbtn_Aceptar);
        jbtn_Aceptar.setBounds(660, 690, 170, 25);

        jbtn_Cancelar.setText("SALIR SIN GRABAR");
        add(jbtn_Cancelar);
        jbtn_Cancelar.setBounds(460, 690, 170, 25);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCIÓN DE CLIENTE"));
        jPanel1.setLayout(null);

        jlbl_zona_direccion.setText("Zona:");
        jPanel1.add(jlbl_zona_direccion);
        jlbl_zona_direccion.setBounds(40, 30, 60, 15);

        jPanel1.add(jcb_zona_direccion);
        jcb_zona_direccion.setBounds(150, 30, 330, 24);

        jlbl_provincia_direccion.setText("Provincia:");
        jPanel1.add(jlbl_provincia_direccion);
        jlbl_provincia_direccion.setBounds(40, 60, 60, 15);

        jPanel1.add(jcb_provincia_direccion);
        jcb_provincia_direccion.setBounds(150, 60, 330, 24);

        jlbl_localidad_direccion.setText("Localidad:");
        jPanel1.add(jlbl_localidad_direccion);
        jlbl_localidad_direccion.setBounds(40, 90, 60, 15);

        jPanel1.add(jcb_localidad_direccion);
        jcb_localidad_direccion.setBounds(150, 90, 330, 24);

        jlbl_calle_direccion.setText("Calle:");
        jPanel1.add(jlbl_calle_direccion);
        jlbl_calle_direccion.setBounds(40, 130, 60, 15);
        jPanel1.add(jtf_calle_direccion);
        jtf_calle_direccion.setBounds(150, 130, 330, 19);

        jlbl_numero_direccion.setText("Número:");
        jPanel1.add(jlbl_numero_direccion);
        jlbl_numero_direccion.setBounds(40, 160, 60, 15);
        jPanel1.add(jtf_numero_direccion);
        jtf_numero_direccion.setBounds(150, 160, 330, 19);

        jlbl_piso_direccion.setText("Piso:");
        jPanel1.add(jlbl_piso_direccion);
        jlbl_piso_direccion.setBounds(40, 190, 60, 15);
        jPanel1.add(jtf_piso_direccion);
        jtf_piso_direccion.setBounds(150, 190, 330, 19);

        jlbl_departamento_direccion.setText("Departamento:");
        jPanel1.add(jlbl_departamento_direccion);
        jlbl_departamento_direccion.setBounds(40, 220, 90, 15);
        jPanel1.add(jtf_departamento_direccion);
        jtf_departamento_direccion.setBounds(150, 220, 330, 19);

        add(jPanel1);
        jPanel1.setBounds(330, 160, 500, 250);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 0, 51));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("N° ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(460, 10, 25, 20);

        jLabel7.setText("UNIDAD:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 10, 50, 20);
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(720, 10, 90, 20);

        jLabel8.setText("FECHA:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(660, 10, 60, 20);

        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(70, 10, 140, 24);

        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(310, 10, 140, 24);

        jLabel9.setBackground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("COMPROBANTE:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(220, 10, 90, 20);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(490, 10, 160, 20);

        add(jPanel3);
        jPanel3.setBounds(10, 40, 820, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente por:"));
        jPanel4.setLayout(null);
        jPanel4.add(jTextField1);
        jTextField1.setBounds(310, 20, 340, 20);

        busquedaCliente.add(jrb_Nombre);
        jrb_Nombre.setSelected(true);
        jrb_Nombre.setText("Nombre");
        jrb_Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jrb_Nombre);
        jrb_Nombre.setBounds(10, 20, 62, 20);

        busquedaCliente.add(jrb_Codigo);
        jrb_Codigo.setText("Codiigo");
        jPanel4.add(jrb_Codigo);
        jrb_Codigo.setBounds(120, 20, 60, 20);

        busquedaCliente.add(jrb_CuitDni);
        jrb_CuitDni.setText("CUIT-DNI");
        jPanel4.add(jrb_CuitDni);
        jrb_CuitDni.setBounds(220, 20, 91, 20);

        jButton1.setText("BUSCAR");
        jPanel4.add(jButton1);
        jButton1.setBounds(663, 20, 130, 25);

        add(jPanel4);
        jPanel4.setBounds(10, 100, 820, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));
        jPanel5.setLayout(null);

        jlbl_ID1.setText("ID:");
        jPanel5.add(jlbl_ID1);
        jlbl_ID1.setBounds(20, 30, 60, 15);
        jPanel5.add(jtf_ID1);
        jtf_ID1.setBounds(100, 30, 200, 19);

        jlbl_Nombre1.setText("Nombre:");
        jPanel5.add(jlbl_Nombre1);
        jlbl_Nombre1.setBounds(20, 90, 60, 15);
        jPanel5.add(jtf_Nombre1);
        jtf_Nombre1.setBounds(100, 90, 200, 19);

        jlbl_Apellido1.setText("Apellido:");
        jPanel5.add(jlbl_Apellido1);
        jlbl_Apellido1.setBounds(20, 190, 60, 15);
        jPanel5.add(jtf_Apellido1);
        jtf_Apellido1.setBounds(100, 190, 200, 19);

        jlbl_DNI1.setText("DNI - CUIT:");
        jPanel5.add(jlbl_DNI1);
        jlbl_DNI1.setBounds(20, 160, 60, 15);
        jPanel5.add(jtf_DNI1);
        jtf_DNI1.setBounds(100, 160, 200, 19);

        jlbl_tipoCliente1.setText("Tipo Cliente:");
        jPanel5.add(jlbl_tipoCliente1);
        jlbl_tipoCliente1.setBounds(20, 120, 70, 15);

        jPanel5.add(jcb_tipoCliente1);
        jcb_tipoCliente1.setBounds(100, 120, 200, 24);

        jlbl_ctaCte1.setText("CTA / CTE:");
        jPanel5.add(jlbl_ctaCte1);
        jlbl_ctaCte1.setBounds(20, 220, 60, 15);
        jPanel5.add(jtf_ctaCte1);
        jtf_ctaCte1.setBounds(100, 220, 200, 19);

        add(jPanel5);
        jPanel5.setBounds(10, 160, 310, 250);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DEPOSITO")));
        jPanel6.setLayout(null);

        jLabel10.setText("DEPOSITO:");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(20, 20, 70, 20);

        jPanel6.add(jComboBox5);
        jComboBox5.setBounds(100, 20, 200, 24);

        add(jPanel6);
        jPanel6.setBounds(10, 620, 820, 60);

        jbtn_Nuevo.setText("CARGAR ITEM");
        add(jbtn_Nuevo);
        jbtn_Nuevo.setBounds(370, 430, 120, 30);

        jbtn_Modificar.setText("MODIFICAR ITEM");
        add(jbtn_Modificar);
        jbtn_Modificar.setBounds(530, 430, 120, 30);

        jbtn_Eliminar.setText("ELIMINAR ITEM");
        add(jbtn_Eliminar);
        jbtn_Eliminar.setBounds(690, 430, 120, 30);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DEPOSITO")));
        jPanel7.setLayout(null);

        jLabel11.setText("DEPOSITO:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(20, 20, 70, 20);

        jPanel7.add(jComboBox6);
        jComboBox6.setBounds(100, 20, 200, 24);

        add(jPanel7);
        jPanel7.setBounds(10, 410, 310, 60);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup busquedaCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtn_Aceptar;
    private javax.swing.JButton jbtn_Cancelar;
    private javax.swing.JButton jbtn_Eliminar;
    private javax.swing.JButton jbtn_Modificar;
    private javax.swing.JButton jbtn_Nuevo;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JComboBox<String> jcb_localidad_direccion;
    private javax.swing.JComboBox<String> jcb_provincia_direccion;
    private javax.swing.JComboBox<String> jcb_tipoCliente1;
    private javax.swing.JComboBox<String> jcb_zona_direccion;
    private javax.swing.JLabel jlbl_Apellido1;
    private javax.swing.JLabel jlbl_DNI1;
    private javax.swing.JLabel jlbl_ID1;
    private javax.swing.JLabel jlbl_Nombre1;
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
    private javax.swing.JTextField jtf_Apellido1;
    private javax.swing.JTextField jtf_DNI1;
    private javax.swing.JTextField jtf_ID1;
    private javax.swing.JTextField jtf_Nombre1;
    private javax.swing.JTextField jtf_calle_direccion;
    private javax.swing.JTextField jtf_ctaCte1;
    private javax.swing.JTextField jtf_departamento_direccion;
    private javax.swing.JTextField jtf_numero_direccion;
    private javax.swing.JTextField jtf_piso_direccion;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void setControlador(Controller c) {
        
        //Agrega Botones al Escuchador ActionListener para manejar los eventos realizados
        jbtn_Nuevo.addActionListener(c);
        
        jbtn_Modificar.addActionListener(c);
        jbtn_Eliminar.addActionListener(c);       
        jbtn_Aceptar.addActionListener(c);
        jbtn_Cancelar.addActionListener(c);      
        jbtn_Volver.addActionListener(c); 
        
        
        
        
        //Agrego la tabla al escuchador Mouse Listener para verificar elementos seleccionados
        tablaEmpleados.addMouseListener(c);
        
        
        
    }

    /*
    CAMPOS del PANEL Getters y Setters
    */
    
    
    
    
    /*
    BOTONES del PANEL
    */
        
    public javax.swing.JButton getJbtn_Aceptar() {
        return jbtn_Aceptar;
    }

    public javax.swing.JButton getJbtn_Cancelar() {
        return jbtn_Cancelar;
    }

    public javax.swing.JButton getJbtn_Eliminar() {
        return jbtn_Eliminar;
    }


    public javax.swing.JButton getJbtn_Modificar() {
        return jbtn_Modificar;
    }

    public javax.swing.JButton getJbtn_Agregar() {
        return jbtn_Nuevo;
    }

    public javax.swing.JButton getJbtn_Volver() {
        return jbtn_Volver;
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

    public javax.swing.JTable getTablaEmpleados() {
        return tablaEmpleados;
    }

    @Override
    public void habilitarCombobox(boolean h, JComboBox campo) {
        campo.setEnabled(h);
    }

    @Override
    public void limpiarCombobox(JComboBox campo) {
        campo.removeAllItems();
    }

    

    
    
}
