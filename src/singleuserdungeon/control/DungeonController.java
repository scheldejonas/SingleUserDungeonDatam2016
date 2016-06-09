/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.DungeonOne;
import singleuserdungeon.model.player.Player;

/**
 *
 * @author scheldejonas
 */
public class DungeonController {
    
    public static DungeonController instance;
    
    private DungeonOne dungeonOne;

    private Player currentPlayer;
    
    public static DungeonController instance()
    {
        
        if (instance == null) 
        {
            instance = new DungeonController();
        }
        
        return instance;
    }
    
    public DungeonController()
    {
        this.dungeonOne = new DungeonOne();
        this.currentPlayer = new Player();
    }
    
    public Player newPlayer()
    {
        Player p = new Player();
        
        
        
        return p;
    }
    
    public void Reset()
    {
        this.dungeonOne = new DungeonOne();
    }
    
    public DungeonOne getDungeonOne()
    {
        return this.dungeonOne;
    }
    
    public Player getPlayer()
    {
        return currentPlayer;
    }
    
}
