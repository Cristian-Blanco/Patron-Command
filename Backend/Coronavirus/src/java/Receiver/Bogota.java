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
public class Bogota implements Estadistica{

    @Override
    public String fotoRepresenta() {
        return "https://blogapi.uber.com/wp-content/uploads/2018/09/CO_X-lugares-para-visitar-en-Bogota%CC%81-que-no-te-puedes-perder-.jpg";
    }

    @Override
    public String infectadoConfirmado() {
        return "105.000 Personas Registradas con Covid";
    }

    @Override
    public String infectadoRecuperado() {
        return "48.624 Personas Recuperadas Actualmente";
    }

    @Override
    public String infectadoMuerto() {
        return "2.828 Personas Muertas";
    }

    @Override
    public String primerSectorInfectado() {
        return "Kennedy: 18.248 Casos Confirmados";
    }

    @Override
    public String segundoSectorInfectado() {
        return "Suba: 12.428 Casos Confirmados";
    }

    @Override
    public String tercerSectorInfectado() {
        return "Bosa: 5.517 Casos Confirmados";
    }

    @Override
    public String primerHospital() {
        return "6.787 Personas hospitalizadas";
    }

    @Override
    public String segundoHospital() {
        return "97.493 Personas en Casa";
    }

    @Override
    public String tercerHospital() {
        return "720 Personas en UCI (Unidad de Cuidados Intensivos)";
    }
    
}
