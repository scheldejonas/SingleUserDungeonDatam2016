/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IGameController;
import singleuserdungeon.model.*;
import singleuserdungeon.control.*;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.*;

/**
 *
 * @author misk
 */
public class GameController implements IGameController {
    
    private static GameController instance;
    public static GameController Instance() {
        if(instance == null) {
            instance = new GameController();
        }
        
        return instance;
    }
    public GameController() {
        
        GuiViewDungeonOne.Instance(); //Newing the game window, so the game restarts, if the somebody news the game from the starter.
    }
    
    
    private FileHandler fileHandler = new FileHandler(); 
    
    public void newGame() {
        
        DungeonController.Instance();
    }

    @Override
    public void quitGame() {
        
        GuiViewDungeonOne.Instance().disposeWindow(); //Saving story to file and closing down the window.
    }

    @Override
    public void endGame() {
        
        GuiViewDungeonOne.Instance().outputStoryText("The end.");
        fileHandler.saveTextToFile(GuiViewDungeonOne.Instance().getLiveStory());
    }

    @Override
    public void resetGame() {
        
        GuiViewDungeonOne.Instance().ResetStoryText();
        DungeonController.Instance().resetDungeonAndPlayer();
    }

    @Override
    public void nextLevel(Player currentPlayer) {
        
        GuiViewDungeonOne.Instance().outputResponseStatus("This function, about leveling up, is not supported yet.");
    }

    @Override
    public void nextLineCommand(String text) {
        
        CommandController.instance().Command(text); //The story and response answer to the Gui, will be performed from the CommandController
    }

    @Override
    public void WriteTextToFile(String text) {
        
        boolean wasPossible = fileHandler.saveTextToFile(text);
        
        if (wasPossible) {
            GuiViewDungeonOne.Instance().outputResponseStatus("Your story has been saved to the computer. Look in your project folder.");
        }
        else {
            GuiViewDungeonOne.Instance().outputResponseStatus("It was not possible to save your textfile, please come back later.");
        }
    }
    
    @Override
    public void outputHelpToStory() {
        
        GuiViewDungeonOne.Instance().outputStoryText("You have sent message through a little mouse with a note to the wise doctor, who sat in the corner in the dead end room, where it all began.");
        
        GuiViewDungeonOne.Instance().outputStoryText("Everything stops.\n"
                + "The wise doctor tells you to look to your right and let your self take a minute to read and understand your initial thought upon each command. After this he tells you to use them wisely in this god forsaken place where anything can happen, but. There is a but! If you find the End Treasure Chest all your dreams and needs will be fulfilled.\n"
                + "He starts walking away, letting you notice the sign on his back: \" get bussy, the time begins right now\"");
    }

    @Override
    public void saveGame() {
        GuiViewDungeonOne.Instance().outputStoryText("We can inform you, the lords of this dungeon laid there eyes past your map and frooze it in there memory. A small note was placed in your pocket of time and state of where you can reset to.");
        
        StorageController.Instance().saveDungeonController();
    }
    
}