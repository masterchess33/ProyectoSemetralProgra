/*  
 * Esta clase contiene los Arraylist de objetos de tipo Trabajador y Administrador donde
 * se guardan las cuentas del o de los administradores y de los Trabajadores.
 * @author: Pablo Lüer- Matias Vega- Sebastian Sanchez
 * @version: 30/6/2019/
 */
package datos;

import problema.Administrador;
import problema.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author envergador
 */
public class Coleccion {
    
    //atributos de la clase coleccion
    private static ArrayList<Administrador> adm = new ArrayList();
    private static ArrayList<Trabajador> trab = new ArrayList();
    
      /**
     *  Método que agrega una cuenta de Tipo Trabajador al ArrayList trab
     * @param n la cuenta de tipo Trabajador a Agregar
     */
    public static void agregarEmpleado(Trabajador n){
        trab.add(n);
    }
    
    /**
     * Método que agrega una cuenta de Tipo Administrador al ArrayList adm
     * @param n  la cuenta de tipo Administrador a Agregar
     */
    public static void agregarAdministrador(Administrador n){
        adm.add(n);
    }
    
    /**
     *  Método que elimina una cuenta del ArrayList de tipo Trabajador
     * @param n El numero que identifica la posicion del ArrayList
     */
    public static void eliminarEmpleado(int n){
        trab.remove(n);
    }
    
    /**
     *  Método que elimina una cuenta del ArrayList de tipo Administrador
     * @param n El numero que identifica la posicion del ArrayList
     */
    public static void eliminaradministrador(int n){
        adm.remove(n);
    }

    /**
     *  Método con el cual se obtiene el ArrayList de administradores de la clase coleccion
     * @return un ArrayList de tipo Administrador de la clase coleccion
     */
    public static ArrayList<Administrador> getAdm() {
        return adm;
    }

    /**
     *  Método con el cual se obtiene el ArrayList de trabajadores de la clase coleccion
     * @return un ArrayList de tipo Trabajador de la clase coleccion
     */
    public static ArrayList<Trabajador> getTrab() {
        return trab;
    }

    /**
     *  Método que establece una coleccion de cuentas de tipo Administrador
     * @param adm  un ArrayList de Administrador
     */
    public static void setAdm(ArrayList<Administrador> adm) {
        Coleccion.adm = adm;
    }
    
    /**
     *  Método que establece una coleccion de trabajadores 
     * @param trab  un ArrayList de trabajadores
     */
    public static void setTrab(ArrayList<Trabajador> trab) {
        Coleccion.trab = trab;
    }
      
    /**
     *  Método que muestra una lista con los nombres de cuentas de los Trabajadores
     * @return una lista con los numero y el nombre de la cuenta de los Trabajadores
     */
    public static String mostrarEmpleados(){
        String resultado="";
        try{
        for(int i = 0; i < trab.size(); i++){
            resultado=resultado+(i+1) + ". " + trab.get(i).getNombreCuenta()+"\n";
        }
        }catch(IndexOutOfBoundsException e){
            resultado="No hay Trabajadores registrados";
        }
        return resultado;
    }
      
    /**
     *  Método que muestra el registro con los datos de los Trabajadores.
     * @param n El parametro define el trabajador que se desea mostra 
     * @return Retorna un String que contiene el nombre de la cuenta del trabajador
     *         y su cantidad de atrasos y salidas anticiopadas.
     */
    public static String verRegistros(int n){
        String resultado="";
        resultado="Nombre cuenta: "+trab.get(n).getNombreCuenta()+"\n"+"Sus atrasos: "+trab.get(n).verAtrazos()+"\n"+"Sus salidas anticipadas: "+trab.get(n).verSalidasA();
        return resultado;
    }
}
