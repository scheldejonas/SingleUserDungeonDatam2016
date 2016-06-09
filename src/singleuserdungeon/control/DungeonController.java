/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import singleuserdungeon.model.DungeonOne;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author scheldejonas
 */
public class DungeonController {
    
    private static DungeonController instance;
    private DungeonOne dungeonOne;
    private Player currentPlayer;
    
    
    public static DungeonController Instance() {
        
        if (instance == null) {
            instance = new DungeonController();
        }
        
        return instance;
    }
    
    public DungeonController() {
        dungeonOne = new DungeonOne();
        currentPlayer = newPlayer();
    }
    
    public Player newPlayer() {
        Player p = new Player();
        
        p.AddItem(4);
        p.AddWeapon(1);
        p.SetRoom(this.getDungeonOne().getRooms().get(0));
        
        return p;
    }
    
    public void resetDungeonAndPlayer() {
        dungeonOne = new DungeonOne();
        currentPlayer = newPlayer();
    }
    
    public DungeonOne getDungeonOne() {
        return this.dungeonOne;
    }
    
    public Player getPlayer() {
        if (currentPlayer == null) {
            currentPlayer = newPlayer();
        }
        
        return currentPlayer;
    }

    public void saveDungeonControllerToSerFile() {
        
        try (
            //FileOutputStream fosDungeon = new FileOutputStream("dungeonone.ser");
            //ObjectOutputStream oosDungeon = new ObjectOutputStream(fosDungeon);
            FileOutputStream fosPlayer = new FileOutputStream("player.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
            
            //oosDungeon.writeObject(instance.getDungeonOne().getRooms());
            oosPlayer.writeObject(instance.getPlayer());
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
                
        
    }
    
}
