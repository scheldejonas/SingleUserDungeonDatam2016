/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.util.ArrayList;
import java.util.Random;
import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.item.XmlItemParser;
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
        this.dungeonDescription = "There has been a disaster in the world, you where one of the few who survived a huge group escape from the evil world controllers, who derived a lot of people from their homes and denied them food in 30 days, to make them work for building their castles. Your escaped down the sour channel with good luck and is laying here in the floor, trying to find you energy back";
        this.rooms = XmlRoomParser.instance().getAllRooms();
        ArrayList<BaseItem> items = XmlItemParser.instance().getAllItems();
        int healingPotionCounter = 0;
        
        
        
        for (BaseItem item : items) {
            
            if (item.getName().equals("Short sword")) {
              //  items.remove(item);
            }
            
            if (item.getName().equals("Healing Potion")) { //Removes the first healing potion for 
                
                if (healingPotionCounter == 0) {
              //      items.remove(item);
                }
                healingPotionCounter++;
            }
            
        }
        
        Random rnd = new Random();
        int itemChooser = 0;
        boolean isEqualRoomCountsLeft = false;
        int roomCounter = rooms.size();
        
        for (BaseRoom room : rooms) {
            
            if (isEqualRoomCountsLeft || rnd.nextBoolean()) {
                itemChooser = rnd.nextInt(items.size());
                room.setItem(items.get(itemChooser));
                items.remove(itemChooser);
            }
            
            if (roomCounter == items.size() && !isEqualRoomCountsLeft) {
                isEqualRoomCountsLeft = true;
            }
            
            roomCounter--;
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
