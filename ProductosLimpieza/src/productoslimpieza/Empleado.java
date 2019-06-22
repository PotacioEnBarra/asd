/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoslimpieza;

/**
 *
 * @author USUARIO1
 */
public class Empleado {
    private String nombreEmpleado;
    private int []cantProductosVendidos=new int[5];
    
    public Empleado(String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    
    public void actualizarVentas(int id, int idProducto){
        
    }
    public int darCantProductosPorId(int idProducto){
    return 0;    
    }
    public int darCantProductos(){
        return 0;
    }
    public int darCantVentasTotales(){
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre: " + nombreEmpleado + ", Cantidad productos: " + cantProductosVendidos + '}';
    }

    
   
}
