/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.model.room.RoomCommand;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class CommandController implements ICommandController {
    
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

    public void Command(String commandString) {
                
        String output;
        String orginalCommandString = commandString;
        commandString = commandString.split(" ")[0];
        commandString = commandString.toLowerCase();
        
        switch(commandString) {
            case "west":
                //output = "Going west "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoWest();
                break;
                
            case "north":
              //  output = "Going north "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoNorth();
                break;
                
            case "east":
                //output = "Going east "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoEast();
                break;
                
            case "south":
                //output = "Going south "; // + Call fucntion - return what happend . ex into a wall/
                rc.GoSouth();
                break;
                
            case "pickup":
                rc.PickupItem();// "You picked up "; // + Call pickup fucntion - return item name
                break; 
                
            case "attack":
                rc.AttackMonster();//"Attacking "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            case "new":
                GameController.Instance().resetGame();
                break;
                
            case "save":
                GameController.Instance().saveGame();
                break;
                
            case "load":
                GuiViewDungeonOne.Instance().outputResponseStatus("Not supported yet.");
                break;
                
            case "quit":
                GameController.Instance().quitGame();
                break;
                
            case "help":
                GameController.Instance().outputHelpToStory();
                break;
                
            case "use":
                DungeonController.Instance().getPlayer().UseItem(orginalCommandString);//"use "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            default:
                GuiViewDungeonOne.Instance().outputResponseStatus("It is not possible to type anything else then commands to the right");
        }
    }
    
}
