/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;
import singleuserdungeon.model.Item;
import singleuserdungeon.model.player.Weapon;
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
    public void setNumberOfHealingPotions(int numberOfHealingPotions);
    public Weapon getWeapon();
    public void setWeapon(Weapon weapon);
    public void setName(String name);
    public void setHitPoints(int hitPoints);
    public void setLevel(int level);
    
}
