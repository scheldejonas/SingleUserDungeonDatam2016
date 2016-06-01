/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IGameController;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.*;

/**
 *
 * @author misk
 */
public class GameController implements IGameController
{
    private static GameController instance = null;
    
    public static GameController Instance()
    {
        if(instance == null)
        {
            instance = new GameController();
            
            //Starting the view
            GuiView.Instance().setVisible(true);
            
        }
        
        return instance;
    }
    

    @Override
    public void NewGame()
    {
        GuiView.Instance().ResetView();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void EndGame()
    {
        GuiView.Instance().OutputText("The end.");
        
    }

    @Override
    public void ResetGame() {
        GuiView.Instance().ResetView();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void NextLevel(Player currentPlayer) 
    {
        GuiView.Instance().ResetView();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
