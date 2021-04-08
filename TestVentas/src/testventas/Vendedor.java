/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testventas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * Esta clase define objetos que son vendedores, los cuales realizan ventas
 * @author: Alfonso MML
 * @version: 22/09/2016/A
 * @see <a href = "http://www.aprenderaprogramar.com/" > aprenderaprogramar.com – Didáctica en programación </a>
 */
public class Vendedor {
    //Campos de la clase
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Venta[] ventas;
    private int nVentas;
    private double comision;
    
    /**
     * Constructor que alberga los datos de un Vendedor, inicializando dentro, 
     * un array de tipo Venta, con una longitud de 10 elementos, permitiendo 
     * por tanto que un Vendedor realice un máximo de 10 ventas.
     * También inicializa un variable de tipo int, llamada nVentas, dándole 
     * como valor 0, que nos servirá para recorrer el array ventas, 
     * en distintos métodos, sabiendo en todo momento, el número de ventas 
     * realizadas que lleva un Vendedor.
     * @param nombre El parámetro nombre, define el nombre del Vendedor
     * @param dni El parámetro dni, define el dni del Vendedor
     * @param comision El parámetro comsion, define la comision del Vendedor
     * @param fechaNacimiento El parámetro fechaNacimiento, define la fecha de 
     * nacimiento del Vendedor
     */

    public Vendedor(String nombre, String dni, double comision, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.comision = comision;
        this.fechaNacimiento = fechaNacimiento;
        ventas = new Venta[10];
        nVentas =0;
    }//Cierre del constructor
    
    /**
     * Método que calcula y devuelve la edad de un Vendedor
     * @return La edad del Vendedor, como un dato de tipo entero
     */
    public int edadDelVendedor(){        
        return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }//Cierre del método
    
    /**
     * Método que comprueba si se puede insertar una Venta. Si se puede, 
     * la inserta y devuelve true, si no se puede devuelve false.      
     * @param venta Este parámetro define, la venta que queremos insertar
     * @return True o false, dependiendo de si se ha podido o no, 
     * insertar una venta
     */
    public boolean insertaVenta(Venta venta){
        if (nVentas < ventas.length){            
            ventas[nVentas++] = venta;           
            return true;
        }
        return false;
    }//Cierre del método
    
    /**
     * Método que suma las ventas que ha realizado un Vendedor
     * @return La suma de las ventas, en un dato de tipo Double
     */
    public double sumaVentas(){
        double suma =0;
        for (int i = 0; i < nVentas; i++) {
            suma += ventas[i].getImporteVenta();
        }            
        return suma;
    }//Cierre del método
    
    /**
     * Método que calcula la paga que le corresponde percibir a un Vendedor,
     * según la fecha indicada.
     * @param aa Este parámetro define el año en que se realiza la paga
     * @param mm Este parámetro define el mes en que se realiza la paga
     * @return La paga que recibe el Vendedor, en la fecha indicada, 
     * en un dato de tipo Double
     */
    public double pagaMensual(int aa, int mm){
        double paga =0;
        for (Venta venta : ventas) {
            if(venta.getFecha().getMonthValue()==mm && venta.getFecha().getYear()==aa){
                paga += venta.getImporteVenta()*comision/100;
            }
        }
        return paga;
    }//Cierre del método
    
    /**
     * Método que devuelve el nombre de un Vendedor
     * @return El nombre de un Vendedor
     */
    public String getNombre() {
        return nombre;
    }//Cierre del método
    
    /**
     * Método que permite cambiar el nombre de un Vendedor, por el nombre que 
     * le pasamos como parámetro al método
     * @param nombre Este parámetro define el nuevo nombre que le vamos a dar
     * a un Vendedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Cierre del método
    
    /**
     * Método que devuelve el dni de un Vendedor
     * @return El dni de un Vendedor
     */
    public String getDni() {
        return dni;
    }//Cierre del método 

    /**
     * Método que permite cambiar el dni de un Vendedor, por el dni que le 
     * pasamos como parámetro al método
     * @param dni Este parámetro define el nuevo dni que le vamos a otorgar 
     * al Vendedor
     */
    public void setDni(String dni){
        this.dni = dni;
    }//Cierre del método

    /**
     * Método que devuelve la fecha de nacimiento de un Vendedor
     * @return La fecha de nacimiento del Vendedor
     */
    public String getFechaNacimiento() {
        return fechaNacimiento.toString();
    }//Cierre del método

    /**
     * Método que devuelve la comisión que percibe por venta un Vendedor
     * @return La comisión que percibe el Vendedor
     */
    public double getComision() {
        return comision;
    }//Cierre del método
    
    /**
     * Método que permite cambiar la comisión que va a percibir un Vendedor,
     * por la comisión que le pasamos como parámetro
     * @param comision Este parámetro define la nueva comisión que va a 
     * percibir el Vendedor
     */
    public void setComision(double comision) {
        this.comision = comision;
    }//Cierre del método
    
    /**
     * Método que permite cambiar la fecha de nacimiento de un Vendedor, 
     * por la fecha de nacimiento que le pasamos como parámetro, siendo este 
     * parámetro un dato de tipo String
     * @param fechaNacimiento Este parámetro de tipo String, define la nueva 
     * fecha de nacimiento que le vamos a otorgar al Vendedor
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }//Cierre del método
    
    /**
     * Método que permite cambiar la fecha de nacimiento de un Vendedor, 
     * por la fecha de nacimiento que le pasamos como parámetro, estando esta 
     * fecha divida en tres parámetros de tipo int, el primer parámetro es 
     * el día, el segundo el mes y el tercero el año
     * @param dd Este parámetro define el día de la fecha que vamos a introducir
     * @param mm Este parámetro define el mes de la fecha que vamos a introducir
     * @param aa Este parámetro define el año de la fecha que vamos a introducir
     */
     public void setFechaNacimiento(int dd, int mm, int aa) {
        this.fechaNacimiento = LocalDate.of(aa,mm,dd);
    }//Cierre del método
     
    /**
     * Método que devuelve las ventas realizadas por un Vendedor
     * @return El listado que recoge las ventas realizadas por el Vendedor, 
     * en un array de tipo Venta
     */
    public Venta[] getVentas() {
        return ventas;
    }//Cierre del método

    /**
     * Método que permite cambiar el listado que recoge las ventas realizadas 
     * por un Vendedor, por otro listado de ventas, el cual pasamos como 
     * parámetro en un array de tipo Venta
     * @param ventas Este parámetro define el listado de ventas que le vamos a 
     * introducir al Vendedor, siendo un array de tipo Venta
     */
    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }//Cierre del método
    
    /*método que devuelva un resumen de ventas mensuales de una año dado
        mes: 01
            taladro 3 unidades fecha de la venta importe
            sierra 2 unidades fecha de la venta importe
        mes: 02
            taladro 2 unidades fecha de la venta importe
            sierra 2 unidades fecha de la venta importe
    .......
    mes: 12
    */
    
    /**
     * Método que devuelve las ventas que ha realizado un vendedor durante cada 
     * mes de un año determinado, año el cual pasamos por parámetro
     * @param aa Este parámetro define el año del cual, vamos a obtener las 
     * ventas realizadas mes a mes
     * @return Las ventas realizadas durante cada mes del año indicado
     */
    public String resumenVentasMensual(int aa){
        String salida = "";
        
        for (int mes = 1; mes <= 12; mes++) {
            for (int i = 0; i < nVentas; i++) {
                if((ventas[i].getFecha().getMonthValue()== mes)&&(ventas[i].getFecha().getYear()==aa)){
                    salida = "\n" + "mes: " + i + "\n" 
                            + ventas[i].toString();
                }        
            }        
        }

        
        return salida;
    }//Cierre del método
    
    /**
     * Método que devuelve un número entero que indetifica a cada Vendedor 
     * de forma unívoca, teniendo en cuenta el dni
     * @return El número entero, como un dato de tipo int, que identifica a 
     * cada objeto de forma unívoca
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }//Cierre del método

    /**
     * Método que compara dos objetos, en este caso de tipo Vendedor, según el .
     * dni y devuelve true si ambos vendedores tienen el mismo dni o 
     * false si tienen distinto dni
     * @param obj Este parámetro define el Vendedor que vamos a comprobar si 
     * es único o ya está repetido
     * @return True si ya existe el Vendedor que hemos pasado como parámetro, 
     * false si no existe todavía.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }//Cierre del método
    
   /**
    * Método que devuelve las ventas que ha realizado un Vendedor
    * @return Las ventas realizadas por un Vendedor, en objeto de tipo String
    */            
   public String ventasToString(){
        String salida="";
        for (int i=0; i<nVentas;i++){
            salida+= ventas[i].toString()+"\n";
        }
        return salida;
    }//Cierre del método

    /**
     * Método que devuleve todos los datos que identifican a un Vendedor, 
     * incluido las ventas que ha realizado
     * @return Todos los datos del Vendedor
     */
    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", \ndni=" + dni 
                + ", \ncomisión=" + comision 
                + ", \nfechaNacimiento=" + fechaNacimiento 
                + ", \nventas=\n" + ventasToString() 
                + ",\nnVentas=" + nVentas + '}';
    }//Cierre del método
 
}
