/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.item.XmlItemParser;
import singleuserdungeon.model.room.BaseRoom;
import singleuserdungeon.model.room.XmlRoomParser;
import singleuserdungeon.view.GuiViewDungeonOne;

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
        this.dungeonDescription = "There has been a disaster in the world, you where one of the few who survived a huge group escape from the evil world controllers, who derived a lot of people from their homes and denied them food in 30 days, to make them work for building their castles. Your escaped down the sour channel with good luck and is laying here in on floor, trying to find you energy back";
        this.rooms = XmlRoomParser.Instance().getAllRooms();
        ArrayList<BaseItem> items = XmlItemParser.instance().getAllItems();
        int healingPotionCounter = 0;
        
        for (int i = 0; i < items.size(); i++) {
            
            if (items.get(i).getName().equals("Short sword")) {
                items.remove(items.get(i));
            }
            else if (items.get(i).getName().equals("Healing Potion")) { //Removes the first healing potion for 
                
                if (healingPotionCounter == 0) {
                    items.remove(items.get(i));
                }                
                healingPotionCounter++;
                
            }
            
        }

        Random rnd = new Random();
        int itemChooser = 0;
        boolean isEqualRoomCountsLeft = false;
        int roomCounter = rooms.size();
        
        for (BaseRoom room : rooms) {
            
            if ( (isEqualRoomCountsLeft || rnd.nextBoolean()) && items.size() > 0) {
                itemChooser = rnd.nextInt(items.size());
                room.setItem(items.get(itemChooser));
                items.remove(itemChooser);
            }
            
            if (roomCounter == items.size() && !isEqualRoomCountsLeft) {
                isEqualRoomCountsLeft = true;
            }
            
            roomCounter--;
        }
        
        GuiViewDungeonOne.Instance().outputStoryText(dungeonName);
        GuiViewDungeonOne.Instance().outputStoryText(dungeonDescription);
        
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

    public void saveDungeonToSerFile(ArrayList<BaseRoom> rooms) {
        
        int indexNumber = 0;
        
        for (BaseRoom room : rooms) {

            try (
                FileOutputStream fos = new FileOutputStream("dungeonOneRoom"+indexNumber+".ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileOutputStream fosLocation = new FileOutputStream("dungeonOneRoom"+indexNumber+"Location.ser");
                ObjectOutputStream oosLocation = new ObjectOutputStream(fosLocation);
                FileOutputStream fosItem = new FileOutputStream("dungeonOneRoom"+indexNumber+"Item.ser");
                ObjectOutputStream oosItem = new ObjectOutputStream(fosItem);
                FileOutputStream fosMonster = new FileOutputStream("dungeonOneRoom"+indexNumber+"Monster.ser");
                ObjectOutputStream oosMonster = new ObjectOutputStream(fosMonster);    
            ) {

                oos.writeObject(room);
                oosLocation.writeObject(room.getLocation());
                oosItem.writeObject(room.getItem());
                oosMonster.writeObject(room.getMonster());

            } catch (IOException ioe) {
                String errorMessage = "There was a problem saving Dungeon Controller";
                System.out.println(errorMessage);
                ioe.printStackTrace();
                GuiViewDungeonOne.Instance().outputResponseStatus(errorMessage);
            }
            
            indexNumber++;
        }
    }
    
}
