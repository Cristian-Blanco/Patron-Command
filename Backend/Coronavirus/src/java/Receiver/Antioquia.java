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
public class Antioquia implements Estadistica{
    @Override
    public String fotoRepresenta() {
        return "https://elturismoencolombia.com/wp-content/uploads/2018/08/jardin_antioquia_parque_libertador_colombia_travel.jpg";
    }

    @Override
    public String infectadoConfirmado() {
        return "35.746 Personas Registradas con Covid";
    }

    @Override
    public String infectadoRecuperado() {
        return "10.976 Personas Recuperadas Actualmente";
    }

    @Override
    public String infectadoMuerto() {
        return "537 Personas Muertas";
    }

    @Override
    public String primerSectorInfectado() {
        return "Medellin: 14.753 Casos Confirmados";
    }

    @Override
    public String segundoSectorInfectado() {
        return "Bello: 1.811 Casos Confirmados";
    }

    @Override
    public String tercerSectorInfectado() {
        return "Itagui: 1.524 Casos Confirmados";
    }

    @Override
    public String primerHospital() {
        return "2.315 Personas hospitalizadas";
    }

    @Override
    public String segundoHospital() {
        return "33.330 Personas en Casa";
    }

    @Override
    public String tercerHospital() {
        return "101 Personas en UCI (Unidad de Cuidados Intensivos)";
    }
}
