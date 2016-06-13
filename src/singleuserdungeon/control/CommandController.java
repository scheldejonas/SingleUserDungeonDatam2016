/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.ICommandController;
import singleuserdungeon.model.room.RoomCommand;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class CommandController implements ICommandController {
    
    private static CommandController instance;
    
    private RoomCommand roomCommand;
    
    public static CommandController Instance() {
        if(instance == null)
        {
            instance = new CommandController();
            instance.roomCommand = new RoomCommand();
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
                roomCommand.goWest();
                break;
                
            case "north":
              //  output = "Going north "; // + Call fucntion - return what happend . ex into a wall/
                roomCommand.goNorth();
                break;
                
            case "east":
                //output = "Going east "; // + Call fucntion - return what happend . ex into a wall/
                roomCommand.goEast();
                break;
                
            case "south":
                //output = "Going south "; // + Call fucntion - return what happend . ex into a wall/
                roomCommand.goSouth();
                break;
                
            case "pickup":
                roomCommand.pickupItem();// "You picked up "; // + Call pickup fucntion - return item name
                break; 
                
            case "attack":
                roomCommand.attackMonster();//"Attacking "; // + Call fucntion - return what happend . ex attacking enemy
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
                DungeonController.Instance().getPlayer().useItem(orginalCommandString);//"use "; // + Call fucntion - return what happend . ex attacking enemy
                break;
                
            default:
                GuiViewDungeonOne.Instance().outputResponseStatus("It is not possible to type anything else then commands to the right");
        }
    }

    public RoomCommand getRoomCommand() {
        return roomCommand;
    }
    
}
