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
    
    
    public static DungeonController Instance()
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
        this.currentPlayer = newPlayer();
    }
    
    public Player newPlayer()
    {
        Player p = new Player();
        
        p.AddItem(4);
        p.AddWeapon(1);
        p.SetRoom(this.getDungeonOne().getRooms().get(0));
        
        return p;
    }
    
    public void resetDungeonAndPlayer()
    {
        this.dungeonOne = new DungeonOne();
        this.currentPlayer = newPlayer();
    }
    
    public DungeonOne getDungeonOne()
    {
        return this.dungeonOne;
    }
    
    public Player getPlayer()
    {
        if(this.currentPlayer == null)
        {
            this.currentPlayer = newPlayer();
        }
        
        System.out.println(this.currentPlayer);
        
        return this.currentPlayer;
    }
    
}
