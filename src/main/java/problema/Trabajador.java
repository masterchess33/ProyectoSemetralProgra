package problema;

import java.time.LocalDateTime;

public class Trabajador extends Cuenta  {

    
    private int atrasos;
    private int salidaAnticipada;

    public Trabajador(String Nombre, String Contrasenia) {
        this.nombreCuenta = Nombre;
        this.contrasenia = Contrasenia;
        this.atrasos=0;
        this.salidaAnticipada=0;
    }
    
    public Trabajador(String Nombre, String Contrasenia, int Atrasos, int SalidasA){
        this.nombreCuenta=Nombre;
        this.contrasenia=Contrasenia;
        this.atrasos=Atrasos;
        this.salidaAnticipada=SalidasA;
    }

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

    public int verAtrazos() {
        return atrasos;
    }
    
    public int verSalidasA() {
        return salidaAnticipada;
    }

    private void atrazo() {
        atrasos = atrasos + 1;
    }
    private void salidaA() {
        salidaAnticipada = salidaAnticipada + 1;
    }
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }
    
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public void setAtrasos(int atrasos) {
        this.atrasos = atrasos;
    }

    public void setSalidaAnticipada(int salidaAnticipada) {
        this.salidaAnticipada = salidaAnticipada;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
