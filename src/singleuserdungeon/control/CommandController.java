/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.model.room.RoomCommand;

/**
 *
 * @author misk
 */
public class CommandController {
    
    private static CommandController instance;
    
    private RoomCommand rc = null;
    
    public static CommandController instance() {
        if(instance == null)
        {
            instance = new CommandController();
            
            instance.rc = new RoomCommand();
        }
        
        return instance;
    }

    public String Command(String commandString) {
        String output = null;
        
        commandString = commandString.toLowerCase();
        
        switch(commandString) {
            case "west":
                output = "Going west "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoWest();
                break;
                
            case "north":
                output = "Going north "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoNorth();
                break;
                
            case "east":
                output = "Going east "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoEast();
                break;
                
            case "south":
                output = "Going south "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoSouth();
                break;
                
            case "pickup":
                output = "You picked up "; // + Call pickup fucntion - return item name
                break; 
                
            case "attack":
                output = "Attacking "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "new":
                output = "new game "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "save":
                output = "save game "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "load":
                output = "load game "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "quit":
                output = "quit game "; // + Call fucntion - return what happend . ex attacking enemy
                GameController.instance().quitGame();
                break;
                
            case "help":
                output = "You yelded for help";
                GameController.instance().outputHelpToStory();
                break;
                
            case "use":
                output = "use "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            default:
                output = "You cant do that now";
        }
        
        return output;
    }
    
}
