/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import singleuserdungeon.control.DungeonController;
import singleuserdungeon.model.DungeonOne;
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
    
    
    
    
    public void GoNorth()
    {
        
    }
    
    public void GoSouth()
    {
    }
    
    public void GoEast()
    {}
    
    public void GoWest()
    {}
    
}
