/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.util.ArrayList;

/**
 * Esta clase define objetos que son tiendas, entendida tienda en este caso,
 * como un conjunto de vendedores.
 * @author: Alfonso MML
 * @version: 22/09/2016/A
 * @see <a href = "http://www.aprenderaprogramar.com/" > aprenderaprogramar.com
 * – Didáctica en programación </a>
 */
public class Tienda {

    private ArrayList<Vendedor> vendedores;

    /**
     * Constrcutor que alberga un conjunto de vendedores, almacenado en un
     * ArrayList de tipo Vendedor
     */
    public Tienda() {
        vendedores = new ArrayList<>();
    }//Cierre del constructor

    /**
     * Método que permite añadir nuevos vendedores a una Tienda
     * @param ven Este parámetro define el vendedor que se va añadir a la Tienda
     * seleccionada
     */
    public void insertaVendedor(Vendedor ven) {
        if (!vendedores.contains(ven)) {
            vendedores.add(ven);
        }
    }//Cierre del método

    /**
     * Método que devuelve la suma de los importes de las ventas 
     * de todos los vendedores.
     * @return La suma de los importes de las ventas 
     * de todos los vendedores.
     */    
    public double totalVentasDeTodosLosVendedores() {
        double salida = 0;
//        for (int i = 0; i < vendedores.size(); i++) {
//            salida += vendedores.get(i).sumaVentas();
//            System.out.println("Nombre: " + vendedores.get(i).getNombre() 
//                    + ", ventas:" + vendedores.get(i).sumaVentas());
//        }        
        for (Vendedor vendedor : vendedores) {
            salida += vendedor.sumaVentas();
        }
        return salida;
    }//Cierre del método
    
    /**
     * Método que devuelve una cadena con las ventas de todos los vendedores,
     * incluyendo los datos de cada Vendedor. 
     * Primero muestra los datos del Vendedor y después las ventas que 
     * realizado tal Vendedor.
     * @return Todos los vendedores con las ventas que ha realizado cada uno.
     */
    @Override
    public String toString() {
        String salida = "";
        for (Vendedor vendedor : vendedores) {
            salida += vendedor.toString() + "\n";
        }
        return salida;
    }//Cierre del método

}
