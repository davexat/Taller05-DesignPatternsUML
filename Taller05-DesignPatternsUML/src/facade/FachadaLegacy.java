/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Pc
 */
public class FachadaLegacy {
    private SubsistemaLegacy sl;
    public FachadaLegacy(){
        sl = new SubsistemaLegacy();
    }
    public void ejecutarOperaciones(){
        sl.iniciarTransaccionesLegacy();
    }
}
