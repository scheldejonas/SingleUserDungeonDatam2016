/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IGameController;
import singleuserdungeon.model.*;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.*;

/**
 *
 * @author misk
 */
public class GameController implements IGameController {
    
    private static GameController instance = null;
    
    public static GameController instance() {
        if(instance == null) {
            instance = new GameController();
            
            GuiViewDungeonOne.instance(); //Newing the game window, so the game restarts, if the somebody news the game from the starter.
        }
        
        return instance;
    }
    
    private FileHandler fileHandler = new FileHandler();
    
    public void newGame() {
        DungeonController.instance();
        
    }

    @Override
    public void quitGame() {
        GuiViewDungeonOne.instance().disposeWindow(); //Saving story to file and closing down the window.
    }

    @Override
    public void endGame() {
        GuiViewDungeonOne.instance().outputStoryText("The end.");
        fileHandler.saveTextToFile(GuiViewDungeonOne.instance().getLiveStory());
    }

    @Override
    public void resetGame() {
        GuiViewDungeonOne.instance().ResetStoryText();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nextLevel(Player currentPlayer) {
        GuiViewDungeonOne.instance().ResetStoryText();
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
    
}
