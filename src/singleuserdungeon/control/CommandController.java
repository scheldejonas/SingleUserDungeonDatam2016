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
    
    public static CommandController instance()
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
            case "west":
                output = "Going west "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "north":
                output = "Going north "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "east":
                output = "Going east "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "south":
                output = "Going south "; // + Call fucntion - return what happend . ex into a wall/
                break;
                
            case "pickup":
                output = "You picked up "; // + Call pickup fucntion - return item name
                break;

            case "use":
                output = "Attacking "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "attack":
                output = "Attacking "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            default:
                output = "You cant do that now";
        }
        
        return output;
    }
    
}
