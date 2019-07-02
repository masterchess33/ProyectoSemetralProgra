/*  
 * Esta clase contiene atributos y metodos de Trabajador heredando atributos de Cuenta
 * @author: Pablo Lüer- Matias Vega- Sebastian Sanchez
 * @version: 30/6/2019/
 */
package problema;

import java.time.LocalDateTime;

public class Trabajador extends Cuenta  {

    //atributos de la clase
    private int atrasos;
    private int salidaAnticipada;

    /**
     * Método constructor para Trabajador
     * @param Nombre El parametro nombre define el nombre de la cuenta
     * @param Contrasenia El parametro define la contraseña de la cuenta
     */
    public Trabajador(String Nombre, String Contrasenia) {
        this.nombreCuenta = Nombre;
        this.contrasenia = Contrasenia;
        this.atrasos=0;
        this.salidaAnticipada=0;
    }
    
    /**
     * Método constructor para Trabajador
     * @param Nombre El parametro define el nombre de la cuenta
     * @param Contrasenia El parametro define la contraseña de la cuenta
     * @param Atrasos El parametro define la cantidad de atrasos de la cuenta
     * @param SalidasA El parametro define la cantidad de salidas anticipadas
     */
    public Trabajador(String Nombre, String Contrasenia, int Atrasos, int SalidasA){
        this.nombreCuenta=Nombre;
        this.contrasenia=Contrasenia;
        this.atrasos=Atrasos;
        this.salidaAnticipada=SalidasA;
    }
    
    /**
     * Método que registra la hora de entrada del Trabajador
     */
    public void registrarEntrada() {
        LocalDateTime ahora = LocalDateTime.now();
        
        if (Cuenta.horaEntrada < ahora.getHour()) {
            atrazo();
        } else if (Cuenta.horaEntrada == ahora.getHour()) {
            if (Cuenta.minutosEntrada < ahora.getMinute()) {
                atrazo();
            } 
        }
    }

    /**
     * Método que registra la hora de salida del Trabajador
     */
    public void registrarSalida() {
        LocalDateTime ahora = LocalDateTime.now();
        
        if (Cuenta.horaSalida > ahora.getHour()) {
            salidaA();
        } else if (Cuenta.horaSalida == ahora.getHour()) {
            if (Cuenta.minutosSalida > ahora.getMinute()) {
                salidaA();
            } 
        }
    }
    
    /**
     * Método que retorna la cantidad de atrasos
     * @return cantidad de atrasos
     */
    public int verAtrazos() {
        return atrasos;
    }
    
    /**
     * Método que retorna la cantidad de salidas anticipadas
     * @return cantidad de salidas anticipadas
     */
    public int verSalidasA() {
        return salidaAnticipada;
    }
    
    /**
     * Método que incrementa la cantidad de atrasos
     */
    private void atrazo() {
        atrasos = atrasos + 1;
    }
    
    /**
     * Método que incrementa la cantidad de salidas anticipadas
     */
    private void salidaA() {
        salidaAnticipada = salidaAnticipada + 1;
    } 
   
    /**
     * Método con el cual se obtiene el nombre de la cuenta
     * @return nombre de la cuenta
     */
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }
    
    /**
     * Método con el cual se establece el nonbre de la cuenta
     * @param nombreCuenta 
     */
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    /**
     * Métdo que establece la candidad de atrasos
     * @param atrasos cantidad de atrasos
     */
    public void setAtrasos(int atrasos) {
        this.atrasos = atrasos;
    }
    
    /**
     * Método que establece la cantidad de salidas anticipadas
     * @param salidaAnticipada cantidad de salidas anticipadas
     */
    public void setSalidaAnticipada(int salidaAnticipada) {
        this.salidaAnticipada = salidaAnticipada;
    }

    /**
     * Método que retorna la contraseña
     * @return contraseña
     */
    public String getContrasenia() {
        return contrasenia;
    }
    
    /**
     *  Método que establece la contraseña 
     * @param contrasenia contraseña de la trbabajador
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
