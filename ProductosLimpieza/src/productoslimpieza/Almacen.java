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
public class Almacen {

    private int idAlmacen;
    private Estante[] estantes = new Estante[5];
    private boolean almacenOcupado = false;

    public Almacen() {
        estantes[0] = new Estante(0);
        estantes[1] = new Estante(1);
        estantes[2] = new Estante(2);
        estantes[3] = new Estante(3);
        estantes[4] = new Estante(4);

    }

    public void asignarProducto(String nombreProducto, double precioProducto, int idEstante) {
        Producto var = new Producto(nombreProducto, precioProducto);
        switch (idEstante) {
            case 1:
               // if (estantes[0].isEstanteOcupado() == false) {
                    estantes[0].agregarProducto(var);
                    System.out.println(var.toString());
               // }
                break;
            case 2:
                //if (estantes[1].isEstanteOcupado() == false) {
                    estantes[1].agregarProducto(var);
                    System.out.println(var.toString());

               // }
                break;
            case 3:
                //if (estantes[2].isEstanteOcupado() == false) {
                    estantes[2].agregarProducto(var);
                    System.out.println(var.toString());

               // }
                break;
            case 4:
                //if (estantes[3].isEstanteOcupado() == false) {
                    estantes[3].agregarProducto(var);
                    System.out.println(var.toString());

               // }
                break;
            case 5:
                //if (estantes[4].isEstanteOcupado() == false) {
                    estantes[4].agregarProducto(var);
                    System.out.println(var.toString());

               // }
                break;
        }

    }

    public boolean cambiarProductoAlInventario(int idProducto, int cantidad) {
        return false;
    }

    public void agregarProductoAlInventario(int idProducto, int cantidad) {

    }

    public boolean registrarVenta(int idProducto, int cantidad) {
        return false;
    }

    public void mostrarInventario() {

    }

    public Estante[] darEstantes() {
        return estantes;
    }

    public boolean estaOcupado() {
        return false;
    }

    @Override
    public String toString() {
        return "Almacen{" + "idAlmacen=" + idAlmacen + ", estantes=" + estantes + ", almacenOcupado=" + almacenOcupado + '}';
    }

}
