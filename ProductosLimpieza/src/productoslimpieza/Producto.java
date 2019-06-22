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
public class Producto {

    private String nombreProducto;
    private int cantidad;
    private double precioVenta;
    private boolean productoAgotado = false;

    public Producto(String nombre, double precioVenta) {
        this.nombreProducto=nombre;
        this.precioVenta = precioVenta;
    }

    public void agregarProductos(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean registrarVenta(int cantidadProducto) {
        return false;
    }

    public double darPrecioVenta() {
        return darPrecioVenta();
    }

    public String darNombreProducto() {
        return nombreProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", productoAgotado=" + productoAgotado + '}';
    }

    
}
