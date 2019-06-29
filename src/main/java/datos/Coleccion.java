/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Objetos.Administrador;
import Objetos.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author envergador
 */
public class Coleccion {
    private static ArrayList<Administrador> adm = new ArrayList();
    private static ArrayList<Trabajador> trab = new ArrayList();
    
    public void agregarEmpleado(Trabajador n){
        trab.add(n);
    }
    public void agregarAdministrador(Administrador n){
        adm.add(n);
    }
    public void eliminarEmpleado(int n){
        trab.remove(n);
    }
    public void eliminaradministrador(int n){
        adm.remove(n);
    }
}
