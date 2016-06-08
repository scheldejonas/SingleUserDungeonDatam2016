/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;

import singleuserdungeon.model.player.Player;

/**
 *
 * @author misk
 */
public interface IGameController
{
    public void quitGame();
    
    public void endGame();
    
    public void resetGame();
    
    public void nextLevel(Player currentPlayer);
    
    public boolean WriteTextToFile(String text);
    
    public String nextLineCommand(String text);
    
    public void outputHelpToStory();
}
