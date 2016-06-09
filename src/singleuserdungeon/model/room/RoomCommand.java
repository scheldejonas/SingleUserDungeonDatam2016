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
    
    
    public void GoNorth()
    {
        if(isThereARoom(GetCurrentRoom().getNorthRoom()))
        {
            GoToRoom(GetCurrentRoom().getNorthRoom());
        }
     // DungeonController.instance.getDungeonOne().getRooms().get(0)
        
    }
    
    public void GoSouth()
    {
        if(isThereARoom(GetCurrentRoom().getSouthRoom()))
        {
            GoToRoom(GetCurrentRoom().getSouthRoom());
        }
    }
    
    public void GoEast()
    {
        if(isThereARoom(GetCurrentRoom().getEastRoom()))
        {
            GoToRoom(GetCurrentRoom().getEastRoom());
        }
    }
    
    public void GoWest()
    {
        if(isThereARoom(GetCurrentRoom().getWestRoom()))
        {
            GoToRoom(GetCurrentRoom().getWestRoom());
        }
    }
    
}
