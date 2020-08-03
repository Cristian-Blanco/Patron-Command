/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import Receiver.Estadistica;

/**
 *
 * @author Cristian
 */
public class CantidadInfectado implements Command{
    
    private Estadistica estadistica;
    
    public CantidadInfectado(Estadistica estadistica){
        this.estadistica = estadistica;
    }

    @Override
    public String execute(){
        //estadistica.fotoRepresenta();
        String text = estadistica.infectadoConfirmado() + estadistica.infectadoMuerto() + estadistica.infectadoRecuperado();
        return text;
    }

    @Override
    public String executePicture() {
        String text = estadistica.fotoRepresenta();
        return text;
    }
    
    
            
}
