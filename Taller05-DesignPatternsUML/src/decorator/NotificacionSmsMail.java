/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Pc
 */
public class NotificacionSmsMail implements Notificacion{
    @Override
    public void sendMessage() {
        System.out.println("Notificando via Sms y Mail...");
    }
    
}
