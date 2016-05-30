/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;


import java.util.ArrayList;
import singleuserdungeon.model.Item;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.model.player.Location;

/**
 *
 * @author misk
 */
public interface IRoom
{
    public void SetVisted();
    
    public ArrayList<Item> GetItems();
    
    public Location GetLocation();
    
    public String GetLocationName(Location l);
    
    public String GetLocationDescription(Location l);
    
    public boolean IsThereAMonster();
    
    public void GetMonster(Player p);
    
    
}
