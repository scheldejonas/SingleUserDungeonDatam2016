/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import java.util.ArrayList;
import singleuserdungeon.interfaces.IRoom;
import singleuserdungeon.model.Item;
import singleuserdungeon.model.monster.Monster;
import singleuserdungeon.model.player.Location;

/**
 *
 * @author scheldejonas
 */
public class Room implements IRoom {

    private Location location;
    private int roomIndexNumber;
    private String roomName;
    private String roomDescription;
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;
    private boolean isEndTreasureChest;
    private boolean isVisited;
    private ArrayList<Item> items;
    private boolean isMonsterHere;
    private Monster monster;

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public int getRoomIndexNumber() {
        return this.roomIndexNumber;
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
    public Room getNorthRoom() {
        return this.northRoom;
    }

    @Override
    public Room getEastRoom() {
        return this.eastRoom;
    }

    @Override
    public Room getSouthRoom() {
        return this.southRoom;
    }

    @Override
    public Room getWestRoom() {
        return this.westRoom;
    }

    @Override
    public boolean isEndTreasureChest() {
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
    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public boolean isMonsterHere() {
        return this.isMonsterHere;
    }

    @Override
    public Monster getMonster() {
        return this.monster;
    }
    
}
