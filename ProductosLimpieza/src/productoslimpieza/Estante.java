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
public class Estante {
    private int idEstante;
    private Producto producto;
    private boolean estanteOcupado=false;
    
    public Estante(int idEstante){
        this.idEstante=idEstante;
       
    }
   public void agregarProducto(Producto producto){
       this.producto=producto;
        this.estanteOcupado=true;
   }
   public void retirarProducto(){
       this.retirarProducto();
   }
   public Producto darProducto(){
       return producto;
   }
    public boolean isEstanteOcupado() {
        return estanteOcupado;
    }
   
   public String toString(){
//       String salida="";
//           if (isEstanteOcupado()) {
//            salida="['idEstante':'"+ idEstante +"', 'productoAsignado': '"+producto.darNombreProducto()+"', 'estado': '"+isEstanteOcupado()+"'}";
//       }else{
//           salida=". Estante disponible";
//       }
       return "['idEstante':'"+ idEstante +"', 'productoAsignado': '"+producto.darNombreProducto()+"', 'estado': '"+isEstanteOcupado()+"'}";
   }
}
