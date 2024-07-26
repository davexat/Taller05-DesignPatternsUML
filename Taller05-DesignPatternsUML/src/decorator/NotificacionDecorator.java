/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Pc
 */
public abstract class NotificacionDecorator implements Notificacion{
    protected Notificacion wrappee;
    public NotificacionDecorator(Notificacion wrappee){
        this.wrappee = wrappee;
    }
}
