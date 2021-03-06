/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.player.Player;

/**
 *
 * @author scheldejonas
 */
public interface IPlayer {
    
    public String getName();
    public String getDescription();
    public int getHitPoints();
    public int getLevel();
    public int getNumberOfHealingPotions();
    public BaseItem getWeapon();
    public void setWeapon(BaseItem weapon);
    public void setName(String name);
    public void setHitPoints(int hitPoints);
    public void setLevel(int level);
    
}
