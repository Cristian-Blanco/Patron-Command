/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receiver;

/**
 *
 * @author Cristian
 */
public class Atlantico implements Estadistica{

    @Override
    public String fotoRepresenta() {
        return "https://upload.wikimedia.org/wikipedia/commons/1/19/Barranquilla_nocturna.jpg";
    }

    @Override
    public String infectadoConfirmado() {
        return "53.131 Personas Registradas con Covid";
    }

    @Override
    public String infectadoRecuperado() {
        return "38.624 Personas Recuperadas Actualmente";
    }

    @Override
    public String infectadoMuerto() {
        return "2.545 Personas Muertas";
    }

    @Override
    public String primerSectorInfectado() {
        return "Barranquilla: 4.206 Casos Confirmados";
    }

    @Override
    public String segundoSectorInfectado() {
        return "Malambo: 2.107 Casos Confirmados";
    }

    @Override
    public String tercerSectorInfectado() {
        return "Puerto Colombia: 1.514 Casos Confirmados";
    }

    @Override
    public String primerHospital() {
        return "3.215 Personas hospitalizadas";
    }

    @Override
    public String segundoHospital() {
        return "49.800 Personas en Casa";
    }

    @Override
    public String tercerHospital() {
        return "116 Personas en UCI (Unidad de Cuidados Intensivos)";
    }
}
