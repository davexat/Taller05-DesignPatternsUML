/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Pc
 */
public class NotificacionWhatsApp extends NotificacionDecorator{
    public NotificacionWhatsApp(Notificacion wrappee){
        super(wrappee);
    }
    @Override public void sendMessage() {
        super.wrappee.sendMessage();
        System.out.println("Notificando via WhatsApp...");
    }
}
