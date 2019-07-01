/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private static ArrayList<Administrador> adm = new ArrayList();
    private static ArrayList<Trabajador> trab = new ArrayList();
    
    public static void agregarEmpleado(Trabajador n){
        trab.add(n);
    }
    public static void agregarAdministrador(Administrador n){
        adm.add(n);
    }
    public static void eliminarEmpleado(int n){
        trab.remove(n);
    }
    public static void eliminaradministrador(int n){
        adm.remove(n);
    }

    public static ArrayList<Administrador> getAdm() {
        return adm;
    }

    public static ArrayList<Trabajador> getTrab() {
        return trab;
    }

    public static void setAdm(ArrayList<Administrador> adm) {
        Coleccion.adm = adm;
    }

    public static void setTrab(ArrayList<Trabajador> trab) {
        Coleccion.trab = trab;
    }
    
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
    
    public static String verRegistros(int n){
        String resultado="";
        resultado="Nombre cuenta: "+trab.get(n).getNombreCuenta()+"\n"+"Sus atrasos: "+trab.get(n).verAtrazos()+"\n"+"Sus salidas anticipadas: "+trab.get(n).verSalidasA();
        return resultado;
    }
}
