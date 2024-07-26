/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod;

/**
 *
 * @author Pc
 */
public abstract class TarjetaCredito {
    protected double limiteCrediticio;
    protected double costo;

    public double getLimiteCrediticio() {
        return limiteCrediticio;
    }

    public void setLimiteCrediticio(double limiteCrediticio) {
        this.limiteCrediticio = limiteCrediticio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
