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
    
    public void attackMonster()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        Player player = DungeonController.Instance().getPlayer();
        
        if(baseRoom.isMonsterHere())
        {
            BaseMonster baseMonster = baseRoom.getMonster();
            int attack = (int) (player.getWeapon().getDamageValue() + player.getWeapon().getDamageIncreaseValue() - baseMonster.GetDefense());
            baseMonster.SetHealth((int)baseMonster.GetHealth() - attack); 
            
            GuiViewDungeonOne.Instance().outputStoryText( baseMonster.GetName() + " took " + attack + " damage, from your blade and has " + baseMonster.GetHealth() + " life left." );
        }
        else {
            GuiViewDungeonOne.Instance().outputResponseStatus("There is nothing to attack.");
        }        
    }
    
    public void pickupItem()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if (baseRoom.isItemHere())
        {
            DungeonController.Instance().getPlayer().addItem( baseRoom.getItem() );
            GuiViewDungeonOne.Instance().outputStoryText("You picked up " + baseRoom.getItem().getName());
            GuiViewDungeonOne.Instance().outputStoryText( baseRoom.getItem().getDescription() );
        }
        else {
            GuiViewDungeonOne.Instance().outputResponseStatus("There is nothing to pickup");
        }
    }
    
    public boolean isThereARoom(int id)
    {
        System.out.println("Room id" +id);
        
        if(id == 0)
        {
            GuiViewDungeonOne.Instance().outputResponseStatus("There is no room, read the last posted story text again to figure out ways to go.");
            return false;
        }
        
        return true;
    }
    
    private void goToRoom(int id)
    {
        BaseRoom room = DungeonController.Instance().getDungeonOne().getRooms().get(id-1);
        DungeonController.Instance().getPlayer().setRoom(room);
    }
    
    
    public void goNorth()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if (isThereARoom(baseRoom.getNorthRoom()))
        {
            goToRoom(baseRoom.getNorthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the north door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (baseRoom.isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + baseRoom.getMonster().GetName());
                GuiViewDungeonOne.Instance().outputStoryText(baseRoom.getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(baseRoom.getMonster());
            }
        }
    }
    
    public void goSouth()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if(isThereARoom(baseRoom.getSouthRoom()))
        {
            goToRoom(baseRoom.getSouthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the south door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (baseRoom.isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + baseRoom.getMonster().GetName());
                GuiViewDungeonOne.Instance().outputStoryText(baseRoom.getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(baseRoom.getMonster());
            }
        }
    }
    
    public void goEast()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if(isThereARoom(baseRoom.getEastRoom()))
        {
            goToRoom(baseRoom.getEastRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the east door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (baseRoom.isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + baseRoom.getMonster().GetName());
                GuiViewDungeonOne.Instance().outputStoryText(baseRoom.getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(baseRoom.getMonster());
            }
        }
    }
    
    public void goWest()
    {
        BaseRoom baseRoom = DungeonController.Instance().getPlayer().getCurrentRoom();
        
        if(isThereARoom(baseRoom.getWestRoom()))
        {
            goToRoom(baseRoom.getWestRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the west door, and entered " + DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText( DungeonController.Instance().getPlayer().getCurrentRoom().GetRoomDescription());
            
            if (baseRoom.isMonsterHere()) {
                GuiViewDungeonOne.Instance().outputStoryText("You have been attacked by " + baseRoom.getMonster().GetName());
                GuiViewDungeonOne.Instance().outputStoryText(baseRoom.getMonster().getDescription());
                DungeonController.Instance().getPlayer().takeAttack(baseRoom.getMonster());
            }
        }
    }
    
}