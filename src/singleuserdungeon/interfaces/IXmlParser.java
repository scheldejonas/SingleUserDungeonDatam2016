/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;

import singleuserdungeon.model.Item;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.model.room.Location;

/**
 *
 * @author misk
 */
public interface IXmlParser 
{
    public BaseMonster GetMonster(int id);
    
    public Location GetLocation(int id);
    
    public Item GetItem(int id);
    
}
