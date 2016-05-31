/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.util.ArrayList;
import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.room.Room;

/**
 *
 * @author scheldejonas
 */
public class Dungeon implements IDungeon {

    private ArrayList<Room> rooms;
    private String dungeonName;
    private String startDungeonDescription;

    public Dungeon(String dungeonName, String startDungeonDescription) {
        this.dungeonName = dungeonName;
        this.startDungeonDescription = startDungeonDescription;
    }

    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String getDungeonName() {
        return this.dungeonName;
    }

    @Override
    public String getStartDungeonDescription() {
        return this.startDungeonDescription;
    }

    @Override
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    
}
