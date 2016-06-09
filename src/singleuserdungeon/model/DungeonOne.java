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
import singleuserdungeon.model.room.XmlRoomParser;

/**
 *
 * @author scheldejonas
 */
public class DungeonOne implements IDungeon {

    private ArrayList<BaseRoom> rooms;
    private String dungeonName;
    private String dungeonDescription;

    public DungeonOne() {
        this.dungeonName = "Hall of disaster";
        this.dungeonDescription = "This is ";
        this.rooms = XmlRoomParser.instance().getAllRooms();
        
        for (BaseRoom room : rooms) {
            
        }
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
        return this.dungeonDescription;
    }

    @Override
    public void setRooms(ArrayList<BaseRoom> rooms) {
        this.rooms = rooms;
    }
    
}
