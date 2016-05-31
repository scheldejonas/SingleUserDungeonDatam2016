/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;

import singleuserdungeon.model.room.Room;

/**
 *
 * @author scheldejonas
 */
public interface IDungeon {
    
    public int getRoomCount();
    public Room getPlayerCurrentRoom();
    
}
