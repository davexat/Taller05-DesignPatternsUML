/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author Pc
 */
public class TarjetaBasicaCreator implements TarjetaCreator{
    @Override public TarjetaCredito crearTarjeta() {
        return new TarjetaCreditoBasica();
    }
    
}
