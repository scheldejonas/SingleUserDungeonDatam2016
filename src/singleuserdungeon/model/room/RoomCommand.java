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
    private Player player = null;
    
    private BaseRoom getRoom(int id)
    {
        if(dungeon != null)
        {
            dungeon =  DungeonController.Instance().getDungeonOne();
        }
        
        return dungeon.getRooms().get(id);
    }
    
    public String AttackMonster()
    {
        BaseRoom br = GetCurrentRoom();
        
        if(br.getMonster() != null)
        {
            Player player = GetPlayer();
            BaseMonster baseMonster = br.getMonster();
            int attack = (int)baseMonster.GetDefense() - player.getWeapon().getDamageValue();
            baseMonster.SetHealth((int)baseMonster.GetHealth() - attack); 
            
            return baseMonster.GetName() + " took " + attack + " damage.";
        }
        
        return "There is nothing to attack.";
    }
    
    public String PickupItem()
    {
        BaseRoom baseRoom = GetCurrentRoom();
        
        if(baseRoom.getItem() != null)
        {
            return "You picked up " + baseRoom.getItem().getName() + " " + baseRoom.getItem().getDescription();
        }
        
        return "There is nothing to pickup";
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
    
    private Player GetPlayer()
    {
        if(player == null)
        {
            player = DungeonController.Instance().getPlayer();
        }
        
        return player;
    }
    
    private BaseRoom GetCurrentRoom()
    {
        return GetPlayer().getCurrentRoom();
    }
    
    private void GoToRoom(int id)
    {
        BaseRoom room = DungeonController.Instance().getDungeonOne().getRooms().get(id-1);
        GetPlayer().SetRoom(room);
    }
    
    
    public void GoNorth()
    {
        if (isThereARoom(GetCurrentRoom().getNorthRoom()))
        {
            GoToRoom(GetCurrentRoom().getNorthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the north door, and entered " + GetPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText(GetPlayer().getCurrentRoom().GetRoomDescription()); 
        }
    }
    
    public void GoSouth()
    {
        if(isThereARoom(GetCurrentRoom().getSouthRoom()))
        {
            GoToRoom(GetCurrentRoom().getSouthRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the south door, and entered " + GetPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText(GetPlayer().getCurrentRoom().GetRoomDescription());
        }
    }
    
    public void GoEast()
    {
        if(isThereARoom(GetCurrentRoom().getEastRoom()))
        {
            GoToRoom(GetCurrentRoom().getEastRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the east door, and entered " + GetPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText(GetPlayer().getCurrentRoom().GetRoomDescription());
        }
    }
    
    public void GoWest()
    {
        if(isThereARoom(GetCurrentRoom().getWestRoom()))
        {
            GoToRoom(GetCurrentRoom().getWestRoom());
            GuiViewDungeonOne.Instance().outputStoryText("You took the west door, and entered " + GetPlayer().getCurrentRoom().GetRoomName() );
            GuiViewDungeonOne.Instance().outputStoryText(GetPlayer().getCurrentRoom().GetRoomDescription());
        }
    }
    
}
