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
public class Bolivar implements Estadistica{
    @Override
    public String fotoRepresenta() {
        return "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Cartagena_de_Indias_desde_el_cerro_La_Popa.jpg/1200px-Cartagena_de_Indias_desde_el_cerro_La_Popa.jpg";
    }

    @Override
    public String infectadoConfirmado() {
        return "18.861 Personas Registradas con Covid";
    }

    @Override
    public String infectadoRecuperado() {
        return "13.876 Personas Recuperadas Actualmente";
    }

    @Override
    public String infectadoMuerto() {
        return "596 Personas Muertas";
    }

    @Override
    public String primerSectorInfectado() {
        return "Cartagena de Indias: 6.813 Casos Confirmados";
    }

    @Override
    public String segundoSectorInfectado() {
        return "El Carmen de Bolivar: 1.419 Casos Confirmados";
    }

    @Override
    public String tercerSectorInfectado() {
        return "Arjona: 1.054 Casos Confirmados";
    }

    @Override
    public String primerHospital() {
        return "1.541 Personas hospitalizadas";
    }

    @Override
    public String segundoHospital() {
        return "17.222 Personas en Casa";
    }

    @Override
    public String tercerHospital() {
        return "98 Personas en UCI (Unidad de Cuidados Intensivos)";
    } 
}
