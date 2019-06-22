/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoslimpieza;

import java.util.Scanner;

/**
 *
 * @author USUARIO1
 */
public class ProductosLimpieza {

    private Scanner sc = new Scanner(System.in);

    private Empleado[] empleados = new Empleado[10];

    private Almacen almacen = new Almacen();

    public ProductosLimpieza() {
        this.almacen = almacen;
        this.empleados = empleados;
    }

    public static void main(String[] args) {
        ProductosLimpieza menu = new ProductosLimpieza();
        menu.desplegarMenu();
    }

    public void desplegarMenu() {
        mostrarOpciones();
        String lineaConsola = sc.nextLine();
        int opcionSeleccionada = Integer.parseInt(lineaConsola);
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu();
    }

    public void mostrarOpciones() {
        String strMenu = "\nMenu.";
        strMenu += "\n1. Registrar empleado.";
        strMenu += "\n2. Registrar producto en el almacen.";
        strMenu += "\n3. Cambiar producto de estante.";
        strMenu += "\n4. Agregar producto al inventario.";
        strMenu += "\n5. Registrar venta.";
        strMenu += "\n6. Mostrar mejor empleado.";
        strMenu += "\n7. Mostrar ingresos totales.";
        strMenu += "\n8. Mostrar inventario.";
        strMenu += "\n9. Mostrar empleados.";
        strMenu += "\n10. Salir.\n";
        strMenu += "Seleccione una opción: ";
        System.out.print(strMenu);
    }

    public void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Ingreso la opcion: Registra empleado");
                System.out.print("Nombre empleado: ");
                registrarEmpleado();
                break;
            case 2:
                registrarProducto();
                break;
            case 3:
                cambiarProductoDeEstante();
                break;
            case 4:
                agregarProductoAlInventario();
                break;
            case 5:
                registrarVenta();
                break;
            case 6:
                obtenerMejorEmpleado();
                break;
            case 7:
                mostrarIngresosTotales();
                break;
            case 8:
                mostrarInventario();

                break;
            case 9:
                System.out.println("");
                System.out.println("Ingreso la opcion: Mostrar empleados");
                mostrarEmpleados();
                break;
            case 10:
                System.exit(0);
                break;
        }
    }

    public void registrarEmpleado() {
        String nombre = sc.nextLine();
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = new Empleado(nombre);
                break;
            }
        }
        mostrarEmpleados();

    }

    public void registrarProducto() {
        System.out.println("");
        mostrarAlmacen();
        System.out.println("");
        System.out.print("Nombre, precio y estante del nuevo producto(separe los datos con un &): ");
        String dato = sc.nextLine();
        String datos = dato;
        String datosingresados = datos;
        String[] partes = datosingresados.split("&");
        almacen.asignarProducto(partes[0], Double.parseDouble(partes[1]), Integer.parseInt(partes[2]) - 1);
        System.out.println("");
        mostrarAlmacen();
    }

    public void cambiarProductoDeEstante() {

    }

    public void agregarProductoAlInventario() {

    }

    public void registrarVenta() {

    }

    public void obtenerMejorEmpleado() {

    }

    public void mostrarIngresosTotales() {

    }

    public void mostrarEmpleados() {
        System.out.println("Empleados registrados:");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.println((i + 1) + ". " + empleados[i]);
                continue;
            }
            if (empleados[i] == null) {
                System.out.println("aun no se han registrado empleados en el sistema.");
                break;
            }
        }
    }

    public void mostrarInventario() {

    }

    public void mostrarAlmacen() {
        System.out.println("ALMACEN: Estado de los estantes");
//        for (int i = 0; i < almacen.darEstantes().length; i++) {
//            if (almacen.darEstantes()!=null) {
//                System.out.println((i+1)+estante.toString());
//            }
//            
//        }
        for (int i = 0; i < almacen.darEstantes().length; i++) {
            if (almacen.darEstantes()[i].isEstanteOcupado()==false) {
                System.out.println((i + 1) + ". Estante disponible");
                
            } else {
                System.out.println(almacen.darEstantes().toString());
            }
        }
    }

    public boolean sinEmpleados() {
        return false;
    }

}
