/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import singleuserdungeon.control.DungeonController;
import singleuserdungeon.model.DungeonOne;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class RoomCommand 
{
    private DungeonOne dungeon = null;
    
    private BaseRoom getRoom(int id)
    {
        if(dungeon != null)
        {
            dungeon =  DungeonController.Instance().getDungeonOne();
        }
        
        return dungeon.getRooms().get(id);
    }
    
    public void attackMonster() {
        
        if(DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
            
            DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().takeAttack(DungeonController.Instance().getPlayer());
            
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
            
                if (DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getHealth() > 0) {
                    DungeonController.Instance().getPlayer().takeAttack( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster());
                }
            }
        }
        else {
            
            GuiViewDungeonOne.Instance().outputResponseStatus("There is nothing to attack.");
        }
    }
    
    public void pickupItem() {
        
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if (baseRoom.isItemHere()) {
            
            DungeonController.Instance().getPlayer().addItem( baseRoom.getItem() );
            GuiViewDungeonOne.Instance().outputStoryText("You picked up " + baseRoom.getItem().getName());
            GuiViewDungeonOne.Instance().outputStoryText( baseRoom.getItem().getDescription() );
        }
        else {
            
            GuiViewDungeonOne.Instance().outputResponseStatus("There is nothing to pickup");
        }
    }
    
    public boolean isThereARoom(int id) {
        
        System.out.println("Room id" +id);
        
        if(id == 0) {
            
            GuiViewDungeonOne.Instance().outputResponseStatus("There is no room, read the last posted story text again to figure out ways to go.");
            return false;
        }
        
        return true;
    }
    
    private void goToRoom(int id) {
        
        BaseRoom room = (BaseRoom) DungeonController.Instance().getDungeonOne().getRooms().get(id-1);
        DungeonController.Instance().getPlayer().setRoom(room);
    }
    
    
    public void goNorth()
    {
        if (isThereARoom(DungeonController.Instance().getPlayer().getCurrentRoom().getNorthRoom()))
        {
            goToRoom(DungeonController.Instance().getPlayer().getCurrentRoom().getNorthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the north door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getName());
                GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster());
            }
        }
    }
    
    public void goSouth()
    {        
        if(isThereARoom(DungeonController.Instance().getPlayer().getCurrentRoom().getSouthRoom()))
        {
            goToRoom(DungeonController.Instance().getPlayer().getCurrentRoom().getSouthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the south door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getName());
                GuiViewDungeonOne.Instance().outputStoryText(DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(DungeonController.Instance().getPlayer().getCurrentRoom().getMonster());
            }
        }
    }
    
    public void goEast()
    {
        if (isThereARoom(DungeonController.Instance().getPlayer().getCurrentRoom().getEastRoom()))
        {
            goToRoom(DungeonController.Instance().getPlayer().getCurrentRoom().getEastRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the east door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getName());
                GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getDescription() );
                DungeonController.Instance().getPlayer().takeAttack( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster());
            }
        }
    }
    
    public void goWest()
    {
        if (isThereARoom(DungeonController.Instance().getPlayer().getCurrentRoom().getWestRoom()))
        {
            goToRoom(DungeonController.Instance().getPlayer().getCurrentRoom().getWestRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the west door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getName());
                GuiViewDungeonOne.Instance().outputStoryText(DungeonController.Instance().getPlayer().getCurrentRoom().getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(DungeonController.Instance().getPlayer().getCurrentRoom().getMonster());
            }
        }
    }
    
}