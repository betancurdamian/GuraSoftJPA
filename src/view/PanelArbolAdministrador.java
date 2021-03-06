/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.CatalogoController;
import controller.CategoriaDeCatalogoController;
import controller.ClienteController;
import model.JPAController.Conexion;
import controller.DefinicionListaPrecioController;
import controller.DepositoController;
import controller.EmpleadoController;
import controller.EmpresaController;
import controller.ListaDePreciosController;
import controller.ProveedorController;
import controller.StockArticuloController;
import controller.UnidadController;
import controller.VentaController;
import model.JPAController.EmpleadoJpaController;
import java.awt.BorderLayout;
import javax.swing.tree.TreePath;
import model.JPAController.ArticuloJpaController;
import model.JPAController.CategoriaArticuloJpaController;
import model.JPAController.ClienteJpaController;
import model.JPAController.DepositoJpaController;
import model.JPAController.EmpresaJpaController;
import model.JPAController.ListaDePrecioJpaController;
import model.JPAController.PrecioArticuloJpaController;
import model.JPAController.ProveedorJpaController;
import model.JPAController.StockArticuloJpaController;
import model.JPAController.UnidadJpaController;
import model.JPAController.VentaJpaController;
import static view.JframePrincipal.jPanelContenido;

/**
 *
 * @author Ariel
 */
public class PanelArbolAdministrador extends javax.swing.JPanel{

    /**
     * Creates new form PanelArbolAdministrador
     */
    String captura=null;       
    public PanelArbolAdministrador() {
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
        setMaximumSize(new java.awt.Dimension(350, 750));
        setMinimumSize(new java.awt.Dimension(350, 750));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 750));
        setLayout(null);

        jScrollPaneArbol.setAlignmentX(0.0F);
        jScrollPaneArbol.setAlignmentY(0.0F);
        jScrollPaneArbol.setPreferredSize(new java.awt.Dimension(350, 750));

        panelContenedorArbol.setAlignmentX(0.0F);
        panelContenedorArbol.setAlignmentY(0.0F);
        panelContenedorArbol.setAutoscrolls(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("GuraSoft");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administración General");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Unidad");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Empleados");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Unidad Comercial");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Catalogo");
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Categoria");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Articulos");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Lista de Precios");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Definición");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("Lista de Precios");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Depositos");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Articulos en Stock");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Compras");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Proveedores");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ventas");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Ingreso de Comprobantes");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Informes");
        treeNode3.add(treeNode4);
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
        jScrollPaneArbol.setBounds(0, 0, 350, 750);
    }// </editor-fold>//GEN-END:initComponents



    private void arbolModulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolModulosMouseClicked
       
       
       TreePath tp = arbolModulos.getPathForLocation(evt.getX(), evt.getY());
       if (tp != null){
            captura = arbolModulos.getSelectionPath().toString();
            /*Intentanmos validar si la cadena equivale a vacio.
              Si ejecutamos nos daremos cuenta que esto
             genera una excepciòn ya que la cadena es nula*/

            if(captura.equals("[GuraSoft, Administración General, Empresa]")){  
            
                //Se crea el Panel Emplesa    
                PanelEmpresa unPanelEmpresa = new PanelEmpresa();            
                unPanelEmpresa.setSize(950, 750);
                unPanelEmpresa.setLocation(0,0);
                unPanelEmpresa.setVisible(true);

                //Se Crea controlador JPA
                EmpresaJpaController modelo = new EmpresaJpaController(Conexion.getEmf());

                //Se crea el controlador de Empresa
                EmpresaController controlador = new EmpresaController(unPanelEmpresa, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelEmpresa.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelEmpresa, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Administración General, Unidad]")){  
            
                //Se crea el Panel Emplesa    
                PanelRegistroDeUnidad unPanelUnidad = new PanelRegistroDeUnidad();            
                unPanelUnidad.setSize(950, 750);
                unPanelUnidad.setLocation(0,0);
                unPanelUnidad.setVisible(true);

                //Se Crea controlador JPA
                UnidadJpaController modelo = new UnidadJpaController(Conexion.getEmf());

                //Se crea el controlador de Empresa
                UnidadController controlador = new UnidadController(unPanelUnidad, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelUnidad.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelUnidad, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Administración General, Empleados]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroEmpleado unPanelPersona = new PanelRegistroEmpleado();            
                unPanelPersona.setSize(950, 750);
                unPanelPersona.setLocation(0,0);
                unPanelPersona.setVisible(true);

                //Se Crea controlador JPA
                EmpleadoJpaController modelo = new EmpleadoJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                EmpleadoController controlador = new EmpleadoController(unPanelPersona, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelPersona.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelPersona, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Articulos, Catalogo, Categoria]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroCatalogoCategoria unPanelCategoria = new PanelRegistroCatalogoCategoria();            
                unPanelCategoria.setSize(950, 750);
                unPanelCategoria.setLocation(0,0);
                unPanelCategoria.setVisible(true);

                //Se Crea controlador JPA
                CategoriaArticuloJpaController modelo = new CategoriaArticuloJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                CategoriaDeCatalogoController controlador = new CategoriaDeCatalogoController(unPanelCategoria, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelCategoria.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelCategoria, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            } 
            
            //Deposito
            if(captura.equals("[GuraSoft, Unidad Comercial, Stock, Depositos]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroDeDeposito unPanelDeposito = new PanelRegistroDeDeposito();            
                unPanelDeposito.setSize(950, 750);
                unPanelDeposito.setLocation(0,0);
                unPanelDeposito.setVisible(true);

                //Se Crea controlador JPA
                DepositoJpaController modelo = new DepositoJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                DepositoController controlador = new DepositoController(unPanelDeposito, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelDeposito.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelDeposito, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            
            //Articulos en Stock
            if(captura.equals("[GuraSoft, Unidad Comercial, Stock, Articulos en Stock]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroStock unPanelStock = new PanelRegistroStock();            
                unPanelStock.setSize(950, 750);
                unPanelStock.setLocation(0,0);
                unPanelStock.setVisible(true);

                //Se Crea controlador JPA
                StockArticuloJpaController modelo = new StockArticuloJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                StockArticuloController controlador = new StockArticuloController(unPanelStock, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelStock.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelStock, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Articulos, Catalogo, Articulos]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroCatalogoArticulo unPanelCatalogoArticulo = new PanelRegistroCatalogoArticulo();            
                unPanelCatalogoArticulo.setSize(950, 750);
                unPanelCatalogoArticulo.setLocation(0,0);
                unPanelCatalogoArticulo.setVisible(true);

                //Se Crea controlador JPA
                ArticuloJpaController modelo = new ArticuloJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                CatalogoController controlador = new CatalogoController(unPanelCatalogoArticulo, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelCatalogoArticulo.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelCatalogoArticulo, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Articulos, Lista de Precios, Definición]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroDefinicioListaPrecio unPanelRegistroDefinicionListaPrecio = new PanelRegistroDefinicioListaPrecio();            
                unPanelRegistroDefinicionListaPrecio.setSize(950, 750);
                unPanelRegistroDefinicionListaPrecio.setLocation(0,0);
                unPanelRegistroDefinicionListaPrecio.setVisible(true);

                //Se Crea controlador JPA
                ListaDePrecioJpaController modelo = new ListaDePrecioJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                DefinicionListaPrecioController controlador = new DefinicionListaPrecioController(unPanelRegistroDefinicionListaPrecio, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelRegistroDefinicionListaPrecio.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelRegistroDefinicionListaPrecio, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Articulos, Lista de Precios, Lista de Precios]")){  
            
                //Se crea el Panel Empleado    
                PanelRegistroListaDePrecioArticulo unPanelRegistroListaDePrecioArticulo = new PanelRegistroListaDePrecioArticulo();            
                unPanelRegistroListaDePrecioArticulo.setSize(950, 750);
                unPanelRegistroListaDePrecioArticulo.setLocation(0,0);
                unPanelRegistroListaDePrecioArticulo.setVisible(true);

                //Se Crea controlador JPA
                PrecioArticuloJpaController modelo = new PrecioArticuloJpaController(Conexion.getEmf());

                //Se crea el controlador de Empleado
                ListaDePreciosController controlador = new ListaDePreciosController(unPanelRegistroListaDePrecioArticulo, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelRegistroListaDePrecioArticulo.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelRegistroListaDePrecioArticulo, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }

            
            if(captura.equals("[GuraSoft, Unidad Comercial, Compras, Proveedores]")){  
            
                //Se crea el Panel Proveedor    
                PanelRegistroProveedor unPanelProveedor = new PanelRegistroProveedor();            
                unPanelProveedor.setSize(950, 750);
                unPanelProveedor.setLocation(0,0);
                unPanelProveedor.setVisible(true);

                //Se Crea controlador JPA
                ProveedorJpaController modelo = new ProveedorJpaController(Conexion.getEmf());

                //Se crea el controlador de Proveedor
                ProveedorController controlador = new ProveedorController(unPanelProveedor, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelProveedor.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelProveedor, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Ventas, Clientes]")){  
            
                //Se crea el Panel Cliente    
                PanelRegistroCliente unPanelCliente = new PanelRegistroCliente();            
                unPanelCliente.setSize(950, 750);
                unPanelCliente.setLocation(0,0);
                unPanelCliente.setVisible(true);

                //Se Crea controlador JPA
                ClienteJpaController modelo = new ClienteJpaController(Conexion.getEmf());

                //Se crea el controlador de Cliente
                ClienteController controlador = new ClienteController(unPanelCliente, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelCliente.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelCliente, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            if(captura.equals("[GuraSoft, Unidad Comercial, Ventas, Ingreso de Comprobantes]")){  
            
                //Se crea el Panel Cliente    
                PanelRegistroVenta unPanelVenta = new PanelRegistroVenta();            
                unPanelVenta.setSize(950, 750);
                unPanelVenta.setLocation(0,0);
                unPanelVenta.setVisible(true);

                //Se Crea controlador JPA
                VentaJpaController modelo = new VentaJpaController(Conexion.getEmf());

                //Se crea el controlador de Cliente
                VentaController controlador = new VentaController(unPanelVenta, modelo);

                //setea el panel para que sea escuchado por el controlador
                unPanelVenta.setControlador(controlador);


                jPanelContenido.removeAll();
                jPanelContenido.add(unPanelVenta, BorderLayout.NORTH);
                jPanelContenido.repaint();

                habilitarArbol(false);
            }
            
            
       }else{
       
       
       
       }
    }//GEN-LAST:event_arbolModulosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolModulos;
    private javax.swing.JScrollPane jScrollPaneArbol;
    private javax.swing.JPanel panelContenedorArbol;
    // End of variables declaration//GEN-END:variables

    public void habilitarArbol(boolean valor) {
        if (valor) {
            arbolModulos.setEnabled(true);
        }else {
            arbolModulos.setEnabled(false);
        }
         
    }

   

   

   
}
