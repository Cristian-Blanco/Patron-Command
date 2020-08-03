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
public class MostrarSectores implements Command{
    private Estadistica estadistica;
    
    public MostrarSectores(Estadistica estadistica){
        this.estadistica = estadistica;
    }

    @Override
    public void execute() {
        estadistica.fotoRepresenta();
        estadistica.primerSectorInfectado();
        estadistica.segundoSectorInfectado();
        estadistica.tercerSectorInfectado();
    }
    
    
}
