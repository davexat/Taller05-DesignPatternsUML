/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

import factoryMethod.TarjetaCredito;
import factoryMethod.TarjetaHandler;

/**
 *
 * @author Pc
 */
public class Cliente {
    public double sueldo;
    public TarjetaCredito tarjeta;
    public Cliente(double sueldo){
        this.sueldo = sueldo;
    }
    public void asignarTarjeta(){
        TarjetaHandler th = new TarjetaHandler();
        th.verificarRequisitos(this);
    }
}
