/*  
 * Esta clase contiene atributos y metodos de la clase padre cuenta
 * @author: Pablo Lüer- Matias Vega- Sebastian Sanchez
 * @version: 30/6/2019/
 */
package problema;

public class Cuenta {
    
    //atributos de la clase
    protected String nombreCuenta;
    protected String contrasenia;
    protected static int horaEntrada=0;
    protected static int minutosEntrada=0;
    protected static int horaSalida=0;
    protected static int minutosSalida=0;

    public static int getHoraEntrada() {
        return horaEntrada;
    }

    public static int getMinutosEntrada() {
        return minutosEntrada;
    }

    public static int getHoraSalida() {
        return horaSalida;
    }

    public static int getMinutosSalida() {
        return minutosSalida;
    }
    
    
    
    
}
