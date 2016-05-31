/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;


import java.util.ArrayList;
import singleuserdungeon.model.Item;
import singleuserdungeon.model.player.Weapon;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.model.room.Location;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.model.room.Room;

/**
 *
 * @author misk
 */
public interface IRoom
{
    public Location getLocation();
    public int getRoomIndexNumber();
    public String GetRoomName();
    public String GetRoomDescription();
    public Room getNorthRoom();
    public Room getEastRoom();
    public Room getSouthRoom();
    public Room getWestRoom();
    public boolean isEndTreasureChest();
    public boolean isVisited();
    public void setVisited(boolean visit);
    public ArrayList<Item> getItems();
    public Weapon getWeapon();
    public boolean isMonsterHere();
    public BaseMonster getMonster();
    
}
