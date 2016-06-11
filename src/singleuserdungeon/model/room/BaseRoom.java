/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import java.io.Serializable;
import java.util.ArrayList;
import singleuserdungeon.interfaces.IRoom;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.monster.BaseMonster;

/**
 *
 * @author scheldejonas
 */
public class BaseRoom implements IRoom,Serializable {

    private transient Location location;
    private String roomName;
    private String roomDescription;
    private int northRoomNumber;
    private int eastRoomNumber;
    private int southRoomNumber;
    private int westRoomNumber;
    private boolean isEndTreasureChest;
    private boolean isVisited;
    private transient BaseItem item;
    private boolean isMonsterHere;
    private transient BaseMonster monster;
    private boolean isItemHere;

    public BaseRoom(int locationNumber, String roomName, String roomDescription, int northRoom, int eastRoom, int southRoom, int westRoom, boolean isEndTreasureChest, BaseItem item, BaseMonster monster) {
        this.location = new Location(locationNumber);
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.northRoomNumber = northRoom;
        this.eastRoomNumber = eastRoom;
        this.southRoomNumber = southRoom;
        this.westRoomNumber = westRoom;
        this.isEndTreasureChest = isEndTreasureChest;
        this.item = item;
        this.monster = monster;
        this.isVisited = false;
        if (monster != null) {
            this.isMonsterHere = true;
        }
        if (item != null) {
            this.isItemHere = true;
        }
    }

    public BaseRoom(int locationNumber, String roomName, String roomDescription, int northRoomNumber, int eastRoomNumber, int southRoomNumber, int westRoomNumber) {
        this.location = new Location(locationNumber);
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.northRoomNumber = northRoomNumber;
        this.eastRoomNumber = eastRoomNumber;
        this.southRoomNumber = southRoomNumber;
        this.westRoomNumber = westRoomNumber;
        this.isVisited = false;
        this.item = null;
        this.isItemHere = false;
        this.monster = null;
        this.isMonsterHere = false;
    }
    


    @Override
    public String toString() {
        return "BaseRoom_" + "location=" + location + "_roomName=" + roomName + "_roomDescription=" + roomDescription + "_northRoomNumber=" + northRoomNumber + "_eastRoomNumber=" + eastRoomNumber + "_southRoomNumber=" + southRoomNumber + "_westRoomNumber=" + westRoomNumber + "_isEndTreasureChest=" + isEndTreasureChest + "_isVisited=" + isVisited + "_item=" + item + "_isMonsterHere=" + isMonsterHere + "_monster=" + monster;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public String GetRoomName() {
        return this.roomName;
    }

    @Override
    public String GetRoomDescription() {
        return this.roomDescription;
    }
    
    @Override
    public int getNorthRoom() {
        return this.northRoomNumber;
    }

    @Override
    public int getEastRoom() {
        return this.eastRoomNumber;
    }

    @Override
    public int getSouthRoom() {
        return this.southRoomNumber;
    }

    @Override
    public int getWestRoom() {
        return this.westRoomNumber;
    }

    @Override
    public boolean isEndTreasureChest() {
        if (item.getName().equals("End Treasure Chest")) {
            this.isEndTreasureChest = true;
        }
        return this.isEndTreasureChest;
    }

    @Override
    public boolean isVisited() {
        return this.isVisited;
    }

    @Override
    public void setVisited(boolean visit) {
        this.isVisited = visit;
    }

    @Override
    public BaseItem getItem() {
        return this.item;
    }

    @Override
    public boolean isMonsterHere() {
        if (monster != null) {
            this.isMonsterHere = true;
        }
        return this.isMonsterHere;
    }

    @Override
    public BaseMonster getMonster() {
        return this.monster;
    }

    @Override
    public void setItem(BaseItem item) {
        this.item = item;
    }

    @Override
    public void setMonster(BaseMonster monster) {
        this.monster = monster;
    }

    boolean isItemHere() {
        if (item != null) {
            this.isItemHere = true;
        }
        return this.isItemHere();
    }

    
}
