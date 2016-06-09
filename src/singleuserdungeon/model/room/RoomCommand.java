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
            Player p = GetPlayer();
            BaseMonster bm = br.getMonster();
            int atk = (int)bm.GetDefense() - p.getWeapon().getDamageValue();
            bm.SetHealth((int)bm.GetHealth() - atk); 
            
            return bm.GetName()+ " took "+atk+" damage.";
        }
        
        return "There is nothing to attack.";
    }
    
    public String PickupItem()
    {
        BaseRoom br = GetCurrentRoom();
        
        if(br.getItem() != null)
        {
            return "You picked up "+br.getItem().getName()+" "+br.getItem().getDescription();
        }
        
        return "There is nothing to pickup";
    }
    
    public boolean isThereARoom(int id)
    {
        System.out.println("Room id" +id);
        
        if(id == 0)
        {
            GuiViewDungeonOne.Instance().outputResponseStatus("There is no room");
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
        BaseRoom room = DungeonController.Instance().getDungeonOne().getRooms().get(id);
        GetPlayer().SetRoom(room);
        
    }
    
    
    public String GoNorth()
    {
        if(isThereARoom(GetCurrentRoom().getNorthRoom()))
        {
            GoToRoom(GetCurrentRoom().getNorthRoom());
            return "Going north ";
            
        }
        
        return null;
     // DungeonController.instance.getDungeonOne().getRooms().get(0)
        
    }
    
    public String GoSouth()
    {
        if(isThereARoom(GetCurrentRoom().getSouthRoom()))
        {
            GoToRoom(GetCurrentRoom().getSouthRoom());
            
            return "Going south ";
        }
        
        return null;
    }
    
    public String GoEast()
    {
        if(isThereARoom(GetCurrentRoom().getEastRoom()))
        {
            GoToRoom(GetCurrentRoom().getEastRoom());
            
            return "Going east ";
        }
        
        return null;
    }
    
    public String GoWest()
    {
        if(isThereARoom(GetCurrentRoom().getWestRoom()))
        {
            GoToRoom(GetCurrentRoom().getWestRoom());
            
            return "Going west";
        }
        
        return null;
    }
    
}
