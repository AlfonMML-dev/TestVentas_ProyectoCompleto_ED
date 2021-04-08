/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

/**
 * Esta clase define objetos que son productos, los cuales se comercializan
 * @author: Alfonso MML
 * @version: 22/09/2016/A
 * @see <a href = "http://www.aprenderaprogramar.com/" > aprenderaprogramar.com – Didáctica en programación </a>
 */
public class Producto {
    private String nombre;
    private double precioCosto;
    private double ganancia;
    private double tipoIva;

    /**
     * Constructor que alberga los datos de un Producto 
     * @param nombre El parámetro nombre, define el nombre del Producto
     * @param precioCosto El parámetro precioCosto, define el precio de coste 
     * del Producto
     * @param ganancia El parámetro ganancia, define el margen de beneficio que 
     * se percibe del Producto
     * @param tipoIVA El parámetro tipoIVA, define el IVA que tiene el Producto
     */
    public Producto(String nombre, double precioCosto, double ganancia, double tipoIVA) {
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.ganancia = ganancia;
        this.tipoIva = tipoIVA;
    }//Cierre del constructor
    
    /**
     * Método que calcula el precio al que se tiene que vender un Producto, 
     * teniendo en cuenta el precio de coste, el margen de beneficio que 
     * se quiere obtener y el tipo de IVA que tiene el producto.
     * @return El precio de venta que va a tener de cara al público
     */
    public double precioVentaPublico(){
        return (precioCosto+(precioCosto*ganancia/100))*(1+tipoIva/100);
    }//Cierre del método
    
    /**
     * Método que devuelve el nombre de un Producto
     * @return El nombre del Producto
     */
    public String getNombre() {
        return nombre;
    }//Cierre del método

    /**
     * Método que permite cambiar el nombre de un Producto, por el nombre que 
     * le pasamos como parámetro al método
     * @param nombre Este parámetro define el nuevo nombre que le vamos a dar
     * al Producto seleccionado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Cierre del método
    
    /**
     * Método que devuelve el precio de coste de un Producto
     * @return El precio de coste del Producto
     */
    public double getPrecioCosto() {
        return precioCosto;
    }//Cierre del método

    /**
     * Método que permite cambiar el precio de coste de un Producto, por el 
     * precio de coste que le pasamos como parámetro al método
     * @param precioCosto Este parámetro define el nuevo precio de coste que 
     * le vamos a dar al Producto seleccionado
     */
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }//Cierre del método
    
    /**
     * Método que devuelve el margen de beneficio de un Producto
     * @return El margen de beneficio del Producto
     */
    public double getGanancia() {
        return ganancia;
    }//Cierre del método

    /**
     * Método que permite cambiar el margen de beneficio de un Producto, por el 
     * margen de beneficio que le pasamos como parámetro al método
     * @param ganancia Este parámetro define el nuevo margen de beneficio que 
     * le vamos a dar al Producto seleccionado
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }//Cierre del método

    /**
     * Método que devuelve el tipo de IVA que tiene un Producto
     * @return El tipo de IVA del Producto
     */
    public double getTipoIva() {
        return tipoIva;
    }//Cierre del método

    /**
     * Método que permite cambiar el tipo de IVA de un Producto, por el 
     * tipo de IVA que le pasamos como parámetro al método
     * @param tipoIva Este parámetro define el nuevo tipo de IVA que 
     * le vamos a dar al Producto seleccionado
     */
    public void setTipoIva(double tipoIva) {
        this.tipoIva = tipoIva;
    }//Cierre del método
    
    /**
     * Método que devuleve todos los datos que identifican a un Producto
     * @return Todos los datos del Producto
     */               
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioCosto=" + precioCosto 
                + ", ganancia=" + ganancia + ", tipoIva=" + tipoIva + '}';
    }//Cierre del método

}
