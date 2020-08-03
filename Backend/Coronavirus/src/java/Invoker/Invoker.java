/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoker;
import Command.Command;

/**
 *
 * @author Cristian
 */
public class Invoker {
    private Command command;
    
    public Invoker(Command command){
        this.command = command;
    }
    
    public String correr(){
        return command.execute();
    }
    
    public String runPicture(){
        return command.executePicture();
    }
    
}
