/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author Pc
 */
public class TarjetaHandler {
    public void verificarRequisitos(Cliente cliente){
        final boolean esTarjetaVIP = cliente.sueldo >= 5000;
        final boolean esTarjetaPremium = cliente.sueldo < 5000 && cliente.sueldo >= 2500;
        final boolean esTarjetaBasica = cliente.sueldo < 2500;
        TarjetaCreator creador = null;
        if (esTarjetaVIP)       creador = new TarjetaVIPCreator();
        if (esTarjetaPremium)   creador = new TarjetaPremiumCreator();
        if (esTarjetaBasica)    creador = new TarjetaBasicaCreator();
        cliente.tarjeta = creador.crearTarjeta();
    }
}
