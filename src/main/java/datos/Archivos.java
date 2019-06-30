/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Contexto_problema.Administrador;
import Contexto_problema.Trabajador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author envergador
 */
public class Archivos {
    
    public static void guardarE(ArrayList<Trabajador> n){
        try{
        ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("Empleados.ser") );
            escribiendoFichero.writeObject(n);
            escribiendoFichero.close();
        }catch(Exception e){
            System.out.println("Error en guardado de archivo");
        }
    }
    
    public static ArrayList<Trabajador> leerE(){
    ArrayList<Trabajador> resultado=new ArrayList();
    try{
    ObjectInputStream leyendoFichero = new ObjectInputStream( 
            new FileInputStream("Empleados.ser") );
            resultado = ( ArrayList <Trabajador> )leyendoFichero.readObject();
            leyendoFichero.close();
    }catch(Exception e){
        System.out.println("Error en lectura de archivo");
    }
    return resultado;
    }
    
    public static void guardarA(ArrayList<Administrador> n){
        try{
        ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("Administradores.ser") );
            escribiendoFichero.writeObject(n);
            escribiendoFichero.close();
        }catch(Exception e){
            System.out.println("Error en guardado de archivo");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Administrador> leerA(){
    ArrayList<Administrador> resultado=new ArrayList();
    try{
    ObjectInputStream leyendoFichero = new ObjectInputStream( 
            new FileInputStream("Administradores.ser") );
            resultado = ( ArrayList <Administrador> )leyendoFichero.readObject();
            leyendoFichero.close();
    }catch(Exception e){
        System.out.println("Error en lectura de archivo");
    }
    return resultado;
    }
    
}
