/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.time.LocalDate;

/**
 * Esta clase define objetos que son ventas, especificando cada venta, 
 * el producto vendido, el número de unidades vendidas del mismo 
 * y la fecha en la que se ha realizado la venta.
 * @author: Alfonso MML
 * @version: 22/09/2016/A
 * @see <a href = "http://www.aprenderaprogramar.com/" > aprenderaprogramar.com
 * – Didáctica en programación </a>
 */
public class Venta {
    private Producto producto;
    private int unidades;
    private LocalDate fecha;
   
    /**
     * Constructor que alberga los datos de una Venta
     * @param producto El parámetro producto, define el producto que 
     * ha sido comercializado.
     * @param unidades El parámetro unidades, define el número de 
     * unidades vendidas de un producto.
     * @param fecha  El parámetro fecha, define la fecha en la que se ha 
     * realizado la venta del producto que ha sido vendido.
     */
    public Venta(Producto producto, int unidades, String fecha) {
        this.producto = producto;
        this.unidades = unidades;
        this.fecha = LocalDate.parse(fecha);//"yyyy-mm-dd"
    }//Cierre del constructor
    
    /**
     * Método que devuelve el importe de una Venta, 
     * que se calcula multiplicando, el precio de venta al público del producto 
     * por el número de unidades vendidas.
     * @return El importe de la Venta seleccionada
     */
    public double getImporteVenta(){
        return producto.precioVentaPublico()*unidades;
    }//Cierre del método
    
    /**
     * Método que devuelve el producto que ha sido vendido al realizarse 
     * una venta. 
     * @return El producto vendido de la Venta seleccionada
     */
    public Producto getProducto() {
        return producto;
    }//Cierre del método

    /**
     * Método que permite cambiar el producto que ha sido vendido al realizarse 
     * una venta, por el producto que le pasamos como parámetro al método.
     * @param producto Este parámetro define el nuevo producto que le vamos 
     * a dar a la Venta seleccionada
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }//Cierre del método

    /**
     * Método que devuelve el número de unidades vendidas de un producto
     * al realizarse una venta. 
     * @return El número de unidades vendidas de un producto 
     * de la Venta seleccionada
     */
    public int getUnidades() {
        return unidades;
    }//Cierre del método

    /**
     * Método que permite cambiar el número de unidades vendidas de un producto 
     * al realizarse una venta, por el número de unidades que le pasamos 
     * como parámetro al método.
     * @param unidades Este parámetro define el nuevo número de unidades 
     * vendidas de un producto que le vamos a dar a la Venta seleccionada
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }//Cierre del método

    /**
     * Método que devuelve la fecha en la que se ha realizado una venta     
     * @return La fecha en la que se ha realizado la Venta seleccionada
     */
    public LocalDate getFecha() {
        return fecha;
    }//Cierre del método

    /**
     * Método que permite cambiar la fecha en la que se ha realizado una venta,
     * por la fecha que le pasamos como parámetro al método. 
     * @param fecha Este parámetro define la nueva la fecha que le vamos 
     * a dar a la Venta seleccionada
     */
    public void setFecha(String fecha) {
        this.fecha = LocalDate.parse(fecha);
    }//Cierre del método

    /**
     * Método que devuelve los datos de una Venta, incluyendo el importe de 
     * la venta realizada. Además en vez de devolver el producto
     * con todos sus datos, solo retorna el nombre.
     * @return Los datos de una Venta, incluyendo el importe de la venta 
     * realizada.
     */
    @Override
    public String toString() {
        return "Producto: " + getProducto().getNombre()+ ", " + unidades + " unidades" 
                + ", fecha: " + fecha + ", importeVenta: " + getImporteVenta();
//        
//        return "Venta{" + "producto=" + producto + ", unidades=" + unidades 
//                + ", fecha=" + fecha + ", importeVenta=" + getImporteVenta() 
//                + '}';
    }//Cierre del método

}
