package Contexto_problema;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Trabajador extends Cuenta implements Serializable {

    
    private int atrazos;
    private int salidaAnticipada;

    public Trabajador(String nombre, String contraseña) {
        this.nombreCuenta = nombre;
        this.contraseña = contraseña;
        atrazos=0;
        salidaAnticipada=0;
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
        return atrazos;
    }
    
    public int verSalidasA() {
        return salidaAnticipada;
    }

    private void atrazo() {
        atrazos = atrazos + 1;
    }
    private void salidaA() {
        salidaAnticipada = salidaAnticipada + 1;
    }
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

}
