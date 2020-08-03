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
public class ValleDelCauca implements Estadistica{
    @Override
    public String fotoRepresenta() {
        return "https://i2.wp.com/www.calibacana.com/wp-content/uploads/valle_del_cauca-990x557.jpg?fit=990%2C557&ssl=1";
    }

    @Override
    public String infectadoConfirmado() {
        return "25.628 Personas Registradas con Covid";
    }

    @Override
    public String infectadoRecuperado() {
        return "14.411 Personas Recuperadas Actualmente";
    }

    @Override
    public String infectadoMuerto() {
        return "980 Personas Muertas";
    }

    @Override
    public String primerSectorInfectado() {
        return "Cali: 7.485 Casos Confirmados";
    }

    @Override
    public String segundoSectorInfectado() {
        return "Buga: 1.343 Casos Confirmados";
    }

    @Override
    public String tercerSectorInfectado() {
        return "Bugalagrande: 1.120 Casos Confirmados";
    }

    @Override
    public String primerHospital() {
        return "2.315 Personas hospitalizadas";
    }

    @Override
    public String segundoHospital() {
        return "23.170 Personas en Casa";
    }

    @Override
    public String tercerHospital() {
        return "143 Personas en UCI (Unidad de Cuidados Intensivos)";
    } 
}
