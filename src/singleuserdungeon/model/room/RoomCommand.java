/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import singleuserdungeon.control.DungeonController;
import singleuserdungeon.model.DungeonOne;
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
            dungeon =  DungeonController.instance.getDungeonOne();
        }
        
        return dungeon.getRooms().get(id);
    }
    
    public boolean isThereARoom(int id)
    {
        System.out.println("Room id" +id);
        
        if(id == 0)
        {
            GuiViewDungeonOne.instance().outputResponseStatus("There is no room");
            return false;
        }
        
        return true;
    }
    
    private Player GetPlayer()
    {
        if(player == null)
        {
            player = DungeonController.instance.getPlayer();
        }
        
        return player;
    }
    
    private BaseRoom GetCurrentRoom()
    {
        return GetPlayer().getCurrentRoom();
    }
    
    private void GoToRoom(int id)
    {
        BaseRoom room = DungeonController.instance.getDungeonOne().getRooms().get(id);
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
