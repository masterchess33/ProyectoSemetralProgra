/*  
 * Esta clase contiene los metodos para leer y guardar los ArrayList de tipo Trabajador y Administrador
 * @author: Pablo Lüer- Matias Vega- Sebastian Sanchez
 * @version: 30/6/2019/
 */
package datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import problema.Administrador;
import problema.Trabajador;


public class Archivos {
    
    /**
     * Método que guarda el los atributos de Trabajador en una coleccion.
     */
    public void guardarE(){
        JSONArray ListaEmpleados = new JSONArray();
        try{
        for(int i=0;i<Coleccion.getTrab().size();i++){
            
        JSONObject empleados = new JSONObject();
        empleados.put("nombreCuenta", Coleccion.getTrab().get(i).getNombreCuenta());
        empleados.put("contrasenia", Coleccion.getTrab().get(i).getContrasenia());
        empleados.put("atrasos", Coleccion.getTrab().get(i).verAtrazos());
        empleados.put("salidasA",Coleccion.getTrab().get(i).verSalidasA());
        
        JSONObject zapa = new JSONObject();
        zapa.put("empleados", empleados);
        ListaEmpleados.add(zapa);
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Es posible que no hayan datos que guardar");
        }
        try (FileWriter file = new FileWriter("Empleados.json")) {
 
            file.write(ListaEmpleados.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            System.out.println("Error a crear archivo");
        }
        
    }
    
    /**
     * Método que lee el archivo Empleados.json
     */
    public void leerE(){
        Coleccion.getTrab().clear();
        leerArchivoE("Empleados.json");
        
        
    }
    
    /**
     * Método que guarda la informacion de cuenta de los administradores
     */
    public void guardarA(){
        JSONArray ListaAdministradores = new JSONArray();
        try{
        for(int i=0;i<Coleccion.getAdm().size();i++){
            
        JSONObject administradore = new JSONObject();
        administradore.put("nombreCuenta", Coleccion.getAdm().get(i).getNombreCuenta());
        administradore.put("contrasenia", Coleccion.getAdm().get(i).getContrasenia());
        
        
        JSONObject zapa = new JSONObject();
        zapa.put("administradores", administradore);
        ListaAdministradores.add(zapa);
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Es posible que no hayan datos que guardar");
        }
        try (FileWriter file = new FileWriter("Administradores.json")) {
 
            file.write(ListaAdministradores.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            System.out.println("Error a crear archivo");
        }
    }
    
    /**
     * Método que lee el archivo Administradores.json
     */
    public void leerA(){
        Coleccion.getAdm().clear();
        leerArchivoA("Administradores.json");
         
        
    }
    /**
     * Método que lee el archivo que contiene los objetos de tipo administrador
     * @param ruta parametro que indica la ruta del archivo 
     */
    private void leerArchivoA(String ruta) {
        JSONParser parser = new JSONParser();
        JSONArray array = new JSONArray();
        try  {
            
            Object a = parser.parse(new FileReader(ruta));
            array = (JSONArray) a;
            array.forEach( emp -> JsonAobjetosAdministrador( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            System.out.println("Error");
        } catch (ParseException e) {
            System.out.println("Error");
        }
        
    }
    
    /**
     * Método que lee el archivo que contiene los objetos de tipo Trabajador
     * @param ruta parametro que indica la ruta del archivo 
     */
    private void leerArchivoE(String ruta) {
        JSONParser parser = new JSONParser();
        JSONArray array = new JSONArray();
        try  {
            
            Object a = parser.parse(new FileReader(ruta));
            array = (JSONArray) a;
            array.forEach( emp -> JsonAobjetosTrabajador( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            System.out.println("Error");
        } catch (ParseException e) {
            System.out.println("Error");
        }
        
    }
    
    
    /**
     * Método que guarda la informacion contenida en el archivo json de tipo trabajador en un arreglo
     * @param e archivo json
     */
    private void JsonAobjetosTrabajador(JSONObject e) {
        
        JSONObject employeeObject = (JSONObject) e.get("empleados");
        String nombre = (String) employeeObject.get("nombreCuenta");
        String contra = (String) employeeObject.get("contrasenia");
        String atrasos = (String) employeeObject.get("atrasos");
        String salidas = (String) employeeObject.get("salidasA");
        int atrasosI=Integer.parseInt(atrasos);
        int salidasI=Integer.parseInt(salidas);
        
        Trabajador s = new Trabajador(nombre,contra,atrasosI,salidasI);
        Coleccion.agregarEmpleado(s);
    }
        
    /**
     * Método que guarda la informacion contenida en el archivo json de tipo administrador en un arreglo
     * @param e archivo json
     */
    private void JsonAobjetosAdministrador(JSONObject e) {
        
        JSONObject employeeObject = (JSONObject) e.get("administradores");
        String nombre = (String) employeeObject.get("nombreCuenta");
        String contra = (String) employeeObject.get("contrasenia");
        
        Administrador s = new Administrador(nombre,contra);
        Coleccion.agregarAdministrador(s);
    }
}
