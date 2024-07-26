/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Pc
 */
public class FachadaNueva {
    private SubsistemaWeb sw;
    private SubsistemaMovil sm;
    private SubsistemaTelefonico st;
    private FachadaLegacy fl;
    public FachadaNueva(){
        sw = new SubsistemaWeb();
        sm = new SubsistemaMovil();
        st = new SubsistemaTelefonico();
        fl = new FachadaLegacy();
    }
    public void ejecutarOperacionesLegacy(){
        fl.ejecutarOperaciones();
    }
    public void ejecutarOperaciones(){
        sw.iniciarTransaccionesWeb();
        sm.iniciarTransaccionesMoviles();
        st.iniciarTransaccionesTelefonicas();
    }
}
