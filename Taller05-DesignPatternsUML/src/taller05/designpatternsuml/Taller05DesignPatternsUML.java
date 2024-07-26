/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller05.designpatternsuml;

import factoryMethod.Cliente;
import decorator.*;
import facade.Plataforma;

/**
 *
 * @author Pc
 */
public class Taller05DesignPatternsUML {
    public static void main(String[] args) {
        pruebaFactoryMethod();
        pruebaDecorator();
        pruebaFacade();
    }
    public static void pruebaFactoryMethod(){
        Cliente c1 = new Cliente(1000);
        Cliente c2 = new Cliente(3000);
        Cliente c3 = new Cliente(6000);
        c1.asignarTarjeta();
        c2.asignarTarjeta();
        c3.asignarTarjeta();
        System.out.println("Tarjeta del cliente 1: "+ c1.tarjeta.getClass());
        System.out.println("Tarjeta del cliente 2: "+ c2.tarjeta.getClass());
        System.out.println("Tarjeta del cliente 3: "+ c3.tarjeta.getClass());
    }
    public static void pruebaDecorator(){
        Notificador n1 = new Notificador(true, false, true, false);
        System.out.println("\nNotificaciones de Signal y WhatsApp activados");
        n1.Notificar();
        n1.setSignal(false);
        System.out.println("\nNotificaciones de WhatsApp activadas\n");
        n1.Notificar();
        n1.setSignal(true);
        n1.setTelegram(true);
        n1.setWhatsapp(true);
        n1.setWire(true);
        System.out.println("\nTodas las notificaiones activadas");
        n1.Notificar();
    }
    public static void pruebaFacade(){
        Plataforma p = new Plataforma(true);
        System.out.println("\nOperaciones en Plataforma nueva: ");
        p.iniciarOperaciones();
        System.out.println("\nOperaciones en Plataforma legacy: ");
        p.setEsWebTelefonicoMovil(false);
        p.iniciarOperaciones();
    }
}
