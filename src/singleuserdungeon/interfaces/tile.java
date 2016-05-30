/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;


import java.util.ArrayList;
import singleuserdungeon.control.Item;
import singleuserdungeon.control.Location;
import singleuserdungeon.control.Player;

/**
 *
 * @author misk
 */
public interface tile
{
    public void SetVisted();
    
    public ArrayList<Item> GetItems();
    
    public Location GetLocation();
    
    public String GetLocationName(Location l);
    
    public String GetLocationDescription(Location l);
    
    public boolean IsThereAMonster();
    
    public void GetMonster(Player p);
    
    
}
