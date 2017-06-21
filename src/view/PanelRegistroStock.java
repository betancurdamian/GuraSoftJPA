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
public final class PanelRegistroStock extends javax.swing.JPanel  implements InterfacePanel{

    /**
     * Creates new form PersonalPanel
     */
    private ValidadorDeCampos validador;
    
    public PanelRegistroStock() {
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

        jPanelListaDePrecio = new javax.swing.JPanel();
        jlbl_TituloListaDePrecio = new javax.swing.JLabel();
        jcb_Deposito = new javax.swing.JComboBox<>();
        jPanelListaDeArticulo = new javax.swing.JPanel();
        jScrollPaneListaDeArticulos = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jPanelArticulo = new javax.swing.JPanel();
        jlbl_ID = new javax.swing.JLabel();
        jtf_ID = new javax.swing.JTextField();
        jlbl_descripcion = new javax.swing.JLabel();
        jtf_Descripcion = new javax.swing.JTextField();
        jlbl_Categoria = new javax.swing.JLabel();
        jcb_Categoria = new javax.swing.JComboBox<>();
        jlbl_Proveedor = new javax.swing.JLabel();
        jcb_Proveedor = new javax.swing.JComboBox<>();
        jbtn_Volver = new javax.swing.JButton();
        jlbl_TituloPanel = new javax.swing.JLabel();
        jbtn_Cancelar = new javax.swing.JButton();
        jbtn_Aceptar = new javax.swing.JButton();
        jPanelStock = new javax.swing.JPanel();
        jbtn_Agregar = new javax.swing.JButton();
        jbtn_Modificar = new javax.swing.JButton();
        jlbl_StockMinimo = new javax.swing.JLabel();
        jtf_stockMinimo = new javax.swing.JTextField();
        jlbl_StockMaximo = new javax.swing.JLabel();
        jtf_stockMaximo = new javax.swing.JTextField();
        jtf_stockActual = new javax.swing.JTextField();
        jlbl_StockActual = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(950, 800));
        setMinimumSize(new java.awt.Dimension(950, 800));
        setLayout(null);

        jPanelListaDePrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelListaDePrecio.setLayout(null);

        jlbl_TituloListaDePrecio.setText("Deposito: ");
        jPanelListaDePrecio.add(jlbl_TituloListaDePrecio);
        jlbl_TituloListaDePrecio.setBounds(20, 30, 130, 20);

        jcb_Deposito.setName(""); // NOI18N
        jPanelListaDePrecio.add(jcb_Deposito);
        jcb_Deposito.setBounds(180, 30, 520, 30);

        add(jPanelListaDePrecio);
        jPanelListaDePrecio.setBounds(60, 40, 730, 100);

        jPanelListaDeArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lista de Articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanelListaDeArticulo.setMinimumSize(new java.awt.Dimension(730, 290));
        jPanelListaDeArticulo.setLayout(null);

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneListaDeArticulos.setViewportView(tablaArticulos);
        if (tablaArticulos.getColumnModel().getColumnCount() > 0) {
            tablaArticulos.getColumnModel().getColumn(0).setMinWidth(120);
            tablaArticulos.getColumnModel().getColumn(0).setPreferredWidth(120);
            tablaArticulos.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        jPanelListaDeArticulo.add(jScrollPaneListaDeArticulos);
        jScrollPaneListaDeArticulos.setBounds(30, 30, 680, 140);

        add(jPanelListaDeArticulo);
        jPanelListaDeArticulo.setBounds(60, 150, 730, 180);

        jPanelArticulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelArticulo.setLayout(null);

        jlbl_ID.setText("ID:");
        jPanelArticulo.add(jlbl_ID);
        jlbl_ID.setBounds(60, 40, 90, 15);

        jtf_ID.setEnabled(false);
        jPanelArticulo.add(jtf_ID);
        jtf_ID.setBounds(160, 40, 230, 19);

        jlbl_descripcion.setText("Descripción:");
        jPanelArticulo.add(jlbl_descripcion);
        jlbl_descripcion.setBounds(60, 80, 100, 15);

        jtf_Descripcion.setEnabled(false);
        jPanelArticulo.add(jtf_Descripcion);
        jtf_Descripcion.setBounds(160, 80, 540, 19);

        jlbl_Categoria.setText("CATEGORIA:");
        jPanelArticulo.add(jlbl_Categoria);
        jlbl_Categoria.setBounds(60, 130, 80, 15);

        jcb_Categoria.setEnabled(false);
        jPanelArticulo.add(jcb_Categoria);
        jcb_Categoria.setBounds(160, 130, 230, 24);

        jlbl_Proveedor.setText("PROVEEDOR: ");
        jPanelArticulo.add(jlbl_Proveedor);
        jlbl_Proveedor.setBounds(60, 180, 80, 15);

        jcb_Proveedor.setEnabled(false);
        jPanelArticulo.add(jcb_Proveedor);
        jcb_Proveedor.setBounds(160, 180, 230, 24);

        add(jPanelArticulo);
        jPanelArticulo.setBounds(60, 340, 730, 220);

        jbtn_Volver.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jbtn_Volver.setText("VOLVER");
        jbtn_Volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_Volver.setBorderPainted(false);
        add(jbtn_Volver);
        jbtn_Volver.setBounds(580, 700, 210, 50);

        jlbl_TituloPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlbl_TituloPanel.setText("GESTIÓN DE STOCK DE ARTICULOS");
        add(jlbl_TituloPanel);
        jlbl_TituloPanel.setBounds(260, 10, 440, 30);

        jbtn_Cancelar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jbtn_Cancelar.setText("CANCELAR");
        jbtn_Cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtn_Cancelar.setBorderPainted(false);
        add(jbtn_Cancelar);
        jbtn_Cancelar.setBounds(280, 700, 210, 50);

        jbtn_Aceptar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jbtn_Aceptar.setText("ACEPTAR");
        jbtn_Aceptar.setBorderPainted(false);
        add(jbtn_Aceptar);
        jbtn_Aceptar.setBounds(60, 700, 210, 50);

        jPanelStock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelStock.setLayout(null);

        jbtn_Agregar.setText("Agregar");
        jPanelStock.add(jbtn_Agregar);
        jbtn_Agregar.setBounds(500, 90, 100, 25);

        jbtn_Modificar.setText("Modificar");
        jPanelStock.add(jbtn_Modificar);
        jbtn_Modificar.setBounds(613, 90, 100, 25);

        jlbl_StockMinimo.setText("Stock Minimo:");
        jPanelStock.add(jlbl_StockMinimo);
        jlbl_StockMinimo.setBounds(60, 20, 90, 20);
        jPanelStock.add(jtf_stockMinimo);
        jtf_stockMinimo.setBounds(160, 20, 230, 20);

        jlbl_StockMaximo.setText("Stock Maximo:");
        jPanelStock.add(jlbl_StockMaximo);
        jlbl_StockMaximo.setBounds(60, 50, 90, 20);
        jPanelStock.add(jtf_stockMaximo);
        jtf_stockMaximo.setBounds(160, 50, 230, 20);
        jPanelStock.add(jtf_stockActual);
        jtf_stockActual.setBounds(160, 80, 230, 20);

        jlbl_StockActual.setText("Stock Actual:");
        jPanelStock.add(jlbl_StockActual);
        jlbl_StockActual.setBounds(60, 80, 90, 20);

        add(jPanelStock);
        jPanelStock.setBounds(60, 570, 730, 130);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelArticulo;
    private javax.swing.JPanel jPanelListaDeArticulo;
    private javax.swing.JPanel jPanelListaDePrecio;
    private javax.swing.JPanel jPanelStock;
    private javax.swing.JScrollPane jScrollPaneListaDeArticulos;
    private javax.swing.JButton jbtn_Aceptar;
    private javax.swing.JButton jbtn_Agregar;
    private javax.swing.JButton jbtn_Cancelar;
    private javax.swing.JButton jbtn_Modificar;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JComboBox<String> jcb_Categoria;
    private javax.swing.JComboBox<String> jcb_Deposito;
    private javax.swing.JComboBox<String> jcb_Proveedor;
    private javax.swing.JLabel jlbl_Categoria;
    private javax.swing.JLabel jlbl_ID;
    private javax.swing.JLabel jlbl_Proveedor;
    private javax.swing.JLabel jlbl_StockActual;
    private javax.swing.JLabel jlbl_StockMaximo;
    private javax.swing.JLabel jlbl_StockMinimo;
    private javax.swing.JLabel jlbl_TituloListaDePrecio;
    private javax.swing.JLabel jlbl_TituloPanel;
    private javax.swing.JLabel jlbl_descripcion;
    private javax.swing.JTextField jtf_Descripcion;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_stockActual;
    private javax.swing.JTextField jtf_stockMaximo;
    private javax.swing.JTextField jtf_stockMinimo;
    private javax.swing.JTable tablaArticulos;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void setControlador(Controller c) {
        
        //Agrega Botones al Escuchador ActionListener para manejar los eventos realizados
        
        jbtn_Volver.addActionListener(c); 
        jbtn_Aceptar.addActionListener(c); 
        jbtn_Cancelar.addActionListener(c); 
        jbtn_Agregar.addActionListener(c); 
        jbtn_Modificar.addActionListener(c); 
        
        //Agrega JcomboBox del Panel Direccion al escuchador ItemListener para verificar items seleccionados        
        jcb_Deposito.addItemListener(c);
        
       
        
        //Agrego la tabla al escuchador Mouse Listener para verificar elementos seleccionados
        tablaArticulos.addMouseListener(c);
        
        
        //Agrega JtextField al escuchador
        jtf_Descripcion.addKeyListener(c);
        jtf_stockActual.addKeyListener(c);
        jtf_stockMinimo.addKeyListener(c); 
        jtf_stockMaximo.addKeyListener(c);
    }

    
    
    /*
    BOTONES del PANEL
    */
     

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

    public javax.swing.JTable getTablaArticulos() {
        return tablaArticulos;
    }

    @Override
    public void habilitarCombobox(boolean h, JComboBox campo) {
        campo.setEnabled(h);
    }

    @Override
    public void limpiarCombobox(JComboBox campo) {
        campo.removeAllItems();
    }

    public javax.swing.JComboBox<String> getJcb_Categoria() {
        return jcb_Categoria;
    }

    public void setJcb_Categoria(javax.swing.JComboBox<String> jcb_Categoria) {
        this.jcb_Categoria = jcb_Categoria;
    }

    public javax.swing.JComboBox<String> getJcb_ListaDeDeposito() {
        return jcb_Deposito;
    }

    public void setJcb_ListaDeDeposito(javax.swing.JComboBox<String> jcb_ListaDeDeposito) {
        this.jcb_Deposito = jcb_ListaDeDeposito;
    }

    public javax.swing.JComboBox<String> getJcb_Proveedor() {
        return jcb_Proveedor;
    }

    public void setJcb_Proveedor(javax.swing.JComboBox<String> jcb_Proveedor) {
        this.jcb_Proveedor = jcb_Proveedor;
    }

    public javax.swing.JTextField getJtf_Descripcion() {
        return jtf_Descripcion;
    }

    public void setJtf_Descripcion(javax.swing.JTextField jtf_Descripcion) {
        this.jtf_Descripcion = jtf_Descripcion;
    }

    public javax.swing.JTextField getJtf_ID() {
        return jtf_ID;
    }

    public void setJtf_ID(javax.swing.JTextField jtf_ID) {
        this.jtf_ID = jtf_ID;
    }

    public javax.swing.JTextField getJtf_stockActual() {
        return jtf_stockActual;
    }

    public javax.swing.JTextField getJtf_stockMaximo() {
        return jtf_stockMaximo;
    }

    public javax.swing.JTextField getJtf_stockMinimo() {
        return jtf_stockMinimo;
    }

    public javax.swing.JButton getJbtn_Aceptar() {
        return jbtn_Aceptar;
    }

    public javax.swing.JButton getJbtn_Agregar() {
        return jbtn_Agregar;
    }

    public javax.swing.JButton getJbtn_Cancelar() {
        return jbtn_Cancelar;
    }

    public javax.swing.JButton getJbtn_Modificar() {
        return jbtn_Modificar;
    }

   
    
    
}
