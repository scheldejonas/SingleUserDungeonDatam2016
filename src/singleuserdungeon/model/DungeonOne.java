/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.util.ArrayList;
import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.room.Location;
import singleuserdungeon.model.room.Room;

/**
 *
 * @author scheldejonas
 */
public class DungeonOne implements IDungeon {

    private ArrayList<Room> rooms;
    private String dungeonName;
    private String startDungeonDescription;

    public DungeonOne(String dungeonName, String startDungeonDescription) {
        this.dungeonName = dungeonName;
        this.startDungeonDescription = startDungeonDescription;
    }

    public DungeonOne() {
//        rooms.add(new Room(new Location(1, 1, 1), 1, "The sealed up hallway end.", ""
//                + "This is where it all started, You are at a dead end of hallway. In here you can see a very dim light hanging over three doors. ", null, null, null, null, true, items, monster, weapon));
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
