/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Pc
 */
public class Plataforma {
    private boolean esWebTelefonicoMovil;
    public Plataforma(boolean esWebTelefonicoMovil){
        this.esWebTelefonicoMovil = esWebTelefonicoMovil;
    }
    public void setEsWebTelefonicoMovil(boolean esWebTelefonicoMovil) {
        this.esWebTelefonicoMovil = esWebTelefonicoMovil;
    }
    public void iniciarOperaciones(){
        FachadaNueva fn = new FachadaNueva();
        fn.ejecutarOperaciones();
        if (!esWebTelefonicoMovil){
            fn.ejecutarOperacionesLegacy();
        }
    }
}
