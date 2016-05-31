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
    public void NewGame();
    
    public void EndGame();
    
    public void ResetGame();
    
    public void NextLevel(Player currentPlayer);
    
}
