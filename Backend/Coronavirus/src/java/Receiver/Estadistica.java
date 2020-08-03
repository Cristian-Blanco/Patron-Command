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
public interface Estadistica {
    public String fotoRepresenta();
    public String infectadoConfirmado();
    public String infectadoRecuperado();
    public String infectadoMuerto();
    public String primerSectorInfectado();
    public String segundoSectorInfectado();
    public String tercerSectorInfectado();
    public String primerHospital();
    public String segundoHospital();
    public String tercerHospital();
}
