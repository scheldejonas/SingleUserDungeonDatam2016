/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.util.ArrayList;
import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.room.Location;
import singleuserdungeon.model.room.BaseRoom;

/**
 *
 * @author scheldejonas
 */
public class DungeonOne implements IDungeon {

    private ArrayList<BaseRoom> rooms;
    private String dungeonName;
    private String startDungeonDescription;

    public DungeonOne(String dungeonName, String startDungeonDescription) {
        this.dungeonName = dungeonName;
        this.startDungeonDescription = startDungeonDescription;
    }

    public DungeonOne() {

        rooms.add(new BaseRoom(new Location(1), 1, "The sealed dead end.", ""
                + "This is where it all started, You are at a dead end of hallway. In here you can see a very dim light hanging in front of you far away. A man is suddenly asking from the corner of the dead end behind you: \"What is your name, my young friend\"?"));
        rooms.add(new BaseRoom(new Location(2), 2, "The corner for tomorrow", ""
                + "This is"));
    }

    @Override
    public ArrayList<BaseRoom> getRooms() {
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
    public void setRooms(ArrayList<BaseRoom> rooms) {
        this.rooms = rooms;
    }
    
}
