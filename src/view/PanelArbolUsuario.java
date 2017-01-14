/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.Conexion;
import controller.EmpleadoController;
import model.JPAController.EmpleadoJpaController;
import java.awt.BorderLayout;
import javax.swing.tree.TreePath;
import static view.JframePrincipal.jPanelContenido;

/**
 *
 * @author Ariel
 */
public class PanelArbolUsuario extends javax.swing.JPanel{

    /**
     * Creates new form PanelArbolAdministrador
     */
    String captura=null;       
    public PanelArbolUsuario() {
        //Se crea Conexion para manejar JPA
        new  Conexion();
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

        jScrollPaneArbol = new javax.swing.JScrollPane();
        panelContenedorArbol = new javax.swing.JPanel();
        arbolModulos = new javax.swing.JTree();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(350, 1200));
        setMinimumSize(new java.awt.Dimension(350, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 800));
        setLayout(null);

        jScrollPaneArbol.setAlignmentX(0.0F);
        jScrollPaneArbol.setAlignmentY(0.0F);

        panelContenedorArbol.setAlignmentX(0.0F);
        panelContenedorArbol.setAlignmentY(0.0F);
        panelContenedorArbol.setAutoscrolls(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("GuraSoft");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tablas Relativas a Articulos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lista de Precios");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Depositos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sectores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Movimientos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Movimientos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Trensferencias");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Deposito");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ventas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Vendedores");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Descuentos y Rangos Varios");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fecha de Facturación");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Definición para el ingreso de comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Anulación de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas a Cobrar");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cobranzas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Saldos Iniciales");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas a Pagar");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pagos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Consulta y Baja de Comprobantes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        arbolModulos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbolModulos.setAlignmentX(0.0F);
        arbolModulos.setAlignmentY(0.0F);
        arbolModulos.setMaximumSize(new java.awt.Dimension(300, 800));
        arbolModulos.setMinimumSize(new java.awt.Dimension(300, 800));
        arbolModulos.setName(""); // NOI18N
        arbolModulos.setPreferredSize(new java.awt.Dimension(300, 800));
        arbolModulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolModulosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorArbolLayout = new javax.swing.GroupLayout(panelContenedorArbol);
        panelContenedorArbol.setLayout(panelContenedorArbolLayout);
        panelContenedorArbolLayout.setHorizontalGroup(
            panelContenedorArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorArbolLayout.createSequentialGroup()
                .addComponent(arbolModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        panelContenedorArbolLayout.setVerticalGroup(
            panelContenedorArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorArbolLayout.createSequentialGroup()
                .addComponent(arbolModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jScrollPaneArbol.setViewportView(panelContenedorArbol);

        add(jScrollPaneArbol);
        jScrollPaneArbol.setBounds(0, 0, 350, 800);
    }// </editor-fold>//GEN-END:initComponents



    private void arbolModulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolModulosMouseClicked
       
       
       TreePath tp = arbolModulos.getPathForLocation(evt.getX(), evt.getY());
       if (tp != null){
            captura = arbolModulos.getSelectionPath().toString();
            /*Intentanmos validar si la cadena equivale a vacio.
              Si ejecutamos nos daremos cuenta que esto
             genera una excepciòn ya que la cadena es nula*/

            if(captura.equals("[GuraSoft, Ventas, Clientes]")){  
            
            //Se crea el Panel Persona    
            PanelRegistroEmpleado unPanelPersona = new PanelRegistroEmpleado();
            
            unPanelPersona.setSize(950, 800);
            unPanelPersona.setLocation(0,0);
            unPanelPersona.setVisible(true);
            
            //Se Crea controlador JPA
            EmpleadoJpaController modelo = new EmpleadoJpaController(Conexion.getEmf());
            
            //Se crea el controlador de Persona
            EmpleadoController controlador = new EmpleadoController(unPanelPersona, modelo);
            
            //setea el panel para que sea escuchado por el controlador
            unPanelPersona.setControlador(controlador);
            

            jPanelContenido.removeAll();
            jPanelContenido.add(unPanelPersona, BorderLayout.NORTH);
            jPanelContenido.repaint();

            modificarArbol(false);
            }
       }else{
       
       
       
       }
    }//GEN-LAST:event_arbolModulosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolModulos;
    private javax.swing.JScrollPane jScrollPaneArbol;
    private javax.swing.JPanel panelContenedorArbol;
    // End of variables declaration//GEN-END:variables

    public void modificarArbol(boolean valor) {
        if (valor) {
            arbolModulos.setEnabled(true);
        }else {
            arbolModulos.setEnabled(false);
        }
         
    }

   

   

   
}