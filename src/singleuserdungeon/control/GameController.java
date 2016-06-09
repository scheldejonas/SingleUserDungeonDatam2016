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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nextLineCommand(String text) {
        return CommandController.instance().Command(text);
    }

    @Override
    public boolean WriteTextToFile(String text) {
        return fileHandler.saveTextToFile(text);
    }

    @Override
    public void outputHelpToStory() {
        
        String helpString = new MenuOptionHelp().getName();
        
        GuiViewDungeonOne.Instance().outputStoryText(helpString);
    }

    public void saveGame() {
        StorageController.Instance().saveDungeonController();
    }
    
}