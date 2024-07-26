/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Pc
 */
public class Notificador {
    private boolean signal;
    private boolean telegram;
    private boolean whatsapp;
    private boolean wire;
    public Notificador(boolean signal, boolean telegram, boolean whatsapp, boolean wire) {
        this.signal = signal;
        this.telegram = telegram;
        this.whatsapp = whatsapp;
        this.wire = wire;
    }
    public void setSignal(boolean signal) {
        this.signal = signal;
    }
    public void setTelegram(boolean telegram) {
        this.telegram = telegram;
    }
    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
    public void setWire(boolean wire) {
        this.wire = wire;
    }
    public void Notificar(){
        Notificacion notificacion = new NotificacionSmsMail();
        if (signal) notificacion = new NotificacionSignal(notificacion);
        if (telegram) notificacion = new NotificacionTelegram(notificacion);
        if (whatsapp) notificacion = new NotificacionWhatsApp(notificacion);
        if (wire) notificacion = new NotificacionWire(notificacion);
        notificacion.sendMessage();
    }
}
