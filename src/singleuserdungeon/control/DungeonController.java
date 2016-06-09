/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
        
        instance.dungeonOne.saveDungeonToSerFile(instance.dungeonOne.getRooms());

        try (
            FileOutputStream fosPlayer = new FileOutputStream("player.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
             
            oosPlayer.writeObject(currentPlayer);
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
        
        try (
            FileOutputStream fosPlayer = new FileOutputStream("playerWeapon.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
             
            oosPlayer.writeObject(currentPlayer.getWeapon());
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
        
        try (
            FileOutputStream fosPlayer = new FileOutputStream("playerShield.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
             
            oosPlayer.writeObject(currentPlayer.getShield());
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
        
        try (
            FileOutputStream fosPlayer = new FileOutputStream("playerCurrentRoom.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
             
            oosPlayer.writeObject(currentPlayer.getCurrentRoom());
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
        
        try (
            FileOutputStream fosPlayer = new FileOutputStream("playerBackPack.ser");
            ObjectOutputStream oosPlayer = new ObjectOutputStream(fosPlayer);
        ) {
             
            oosPlayer.writeObject(currentPlayer.getBackpack());
            
        } catch (IOException ioe) {
            String errorMessage = "There was a problem saving Dungeon Controller";
            System.out.println(errorMessage);
            ioe.printStackTrace();
            GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
        }
        
    }
    
}
