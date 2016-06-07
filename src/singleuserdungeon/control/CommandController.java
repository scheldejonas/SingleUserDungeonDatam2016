/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

/**
 *
 * @author misk
 */
public class CommandController 
{
    private static CommandController instance;
    
    public static CommandController Instance()
    {
        if(instance == null)
        {
            instance = new CommandController();
        }
        
        return instance;
    }
    
    public String Command(String commandString)
    {
        String output = null;
        
        commandString = commandString.toLowerCase();
        
        switch(commandString)
        {
            case "/pickup":
                output = "You picked up "; // + Call pickup fucntion - return item name
                break;
            
            case "/gonorth":
                output = "Going north "; // + Call fucntion - return what happend . ex into a wall/
                break; 
            
            case "/gosouth":
                output = "Going south "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "/goeast":
                output = "Going east "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "/gowest":
                output = "Going west "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "/attack":
                output = "Attacking "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            default:
                output = "You cant do that now";
        }
        
        return output;
    }
    
}
