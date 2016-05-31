/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;

import java.util.ArrayList;
import singleuserdungeon.model.room.Room;

/**
 *
 * @author scheldejonas
 */
public interface IDungeon {
    
    /**
     * This is for keeping the rooms in one container and using the controller get all sorts of information out of this list with rooms
     * @return ArrayList of rooms
     */
    public ArrayList<Room> getRooms();
    
    /**
     * This is for updating the rooms
     */
    public void setRooms(ArrayList<Room> rooms);
    
    /**
     * This is the main name of the game, and should be returned when the game is entered
     * @return name of the dungeon
     */
    public String getDungeonName();
    
    /**
     * This is the main start description of the game, and should be returned when the game is entered. 
     * @return the text description of the dungeon
     */
    public String getStartDungeonDescription();
}
