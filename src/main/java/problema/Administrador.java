/*  
 * Esta clase contiene los atributos y métodos de Administrador 
 * @author: Pablo Lüer- Matias Vega- Sebastian Sanchez
 * @version: 30/6/2019/
 */
package problema;

public class Administrador extends Cuenta {
    
    /**
     * Método constructor de la clase Administrador
     * @param NombreCuenta nombre de la cuenta administrador
     * @param Contraseña contraseña de la cuenta administrador
     */
    public Administrador(String NombreCuenta,String Contraseña){
            this.nombreCuenta=NombreCuenta;
            this.contrasenia=Contraseña;
    }
    
    /**
     * Método que retorna el número de atrasos del trabajador
     * @param n objeto de tipo Trabajador
     * @return numero de atrasos
     */
    public int verAtrazos(Trabajador n){
        return n.verAtrazos();
    }
    
    /**
     * Método que retorna el numero de salidas adelantadas del trabajador
     * @param n objeto de tipo Trabajador
     * @return numero de salidas adelantadas
     */
    public int verSalidasA(Trabajador n){
        return n.verSalidasA();
    }
    
    /**
     * Método que establece el horario de entrada para los trabajadores
     * @param h la hora de entrada
     * @param m los minutos de entrada
     */
    public static void establecerHoraEntrada(int h,int m){
        setHoraEntrada(h);
        setMinutosEntrada(m);
    }
    
     /**
     * Método que establece el horario de salida para los trabajadores
     * @param h la hora de salida   
     * @param m los minutos de salida
     */
    public static void establecerHoraSalida(int h,int m){
        setHoraESalida(h);
        setMinutosSalida(m);
    }
    
     /**
     * Método que muestas las horas de entrada y salida, definas por el administrador
     * @return 
     */
    public static String verHorasEntradaSalida(){
        String resultado="";
        resultado="La hora de entrada es: "+Cuenta.horaEntrada+":"+Cuenta.minutosEntrada+"\n";
        resultado=resultado+"La hora de salida es: "+Cuenta.horaSalida+":"+Cuenta.minutosSalida;
        return resultado;
    }
   
    /**
     * Método que establece la hora de entrada
     * @param n hora de entrada
     */  
    public static void setHoraEntrada(int n){
        Cuenta.horaEntrada=n;
    }   
    
    /**
     * Método que establece los minutos de entrada
     * @param n minutos de entrada
     */
    public static void setMinutosEntrada(int n){
        Cuenta.minutosEntrada=n;
    }    
    
    /**
     * Método que obtiene la hora de entrada
     * @return hora de entrada
     */
    public static  int getHoraEntrada(){
        return Cuenta.horaEntrada;
    } 
    
    /**
     * Método que obtiene los minutos de entrada
     * @return minutos de entrada
     */
    public static int getMinutosEntrada(){
        return Cuenta.minutosEntrada;
    }
    
    /**
     * Método que establece la hora de salida 
     * @param n hora de salida 
     */
    public static void setHoraESalida(int n){
        Cuenta.horaSalida=n;
    }
    
    /**
     * Método que establece los minutos de salida 
     * @param n minutos de salida
     */
    public static void setMinutosSalida(int n){
        Cuenta.minutosSalida=n;
    }   
    
    /**
     * Método que obtiene la hora de salida
     * @return hora de salida
     */
    public static int getHoraSalida(){
        return Cuenta.horaSalida;
    } 
    
    /**
     * Método que obtiene los minutos de salida
     * @return minutos de salida
     */
    public static int getMinutosSalida(){
        return Cuenta.minutosSalida;
    }
     
    /**
     * Método que establece el nombre de trabajador
     * @param nombre nombre de la cuenta
     */
    public void setNombreCuenta(String nombre){
        this.nombreCuenta=nombre;
    }
    
    /**
     * Método que establece la contraseña de trabajador
     * @param contra contraseña  
     */
    public void setContraseña(String contra){
        this.contrasenia=contra;
    }
    
    /**
     * Método que obtiene el nombre de la cuenta trabajador
     * @return nombre de la cuenta
     */
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }
   
    /**
     * Método que obtiene la contraseña de la cuenta trabajador
     * @return contraseña de la cuenta
     */
    public String getContrasenia() {
        return this.contrasenia;
    }
    
}
