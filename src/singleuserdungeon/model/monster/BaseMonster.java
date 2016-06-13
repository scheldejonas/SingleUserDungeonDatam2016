/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.monster;

import java.io.Serializable;
import singleuserdungeon.control.CommandController;
import singleuserdungeon.control.DungeonController;
import singleuserdungeon.control.GameController;
import singleuserdungeon.interfaces.IMonster;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class BaseMonster implements IMonster,Serializable {

    private String name;
    private String description;
    private float health;
    private float attack;
    private float defense;
    private float xpMod;
    
    public BaseMonster(String monsterName,String monsterDescription, float monsterHealth, float monsterAttack, float monsterDefense,float monsterXpMod)
    {
        name = monsterName;
        description = monsterDescription;
        health = monsterHealth;
        attack = monsterAttack;
        defense = monsterDefense;
        xpMod = monsterXpMod;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getHealth() {
        return this.health;
    }

    @Override
    public float GetAttack() {
        return this.attack;
    }

    @Override
    public float GetDefense() {
        return this.defense;
    }

    @Override
    public String toString() {
        return "BaseMonster_" + "name=" + name + "_description=" + description + "_health=" + health + "_attack=" + attack + "_defense=" + defense + "_xpMod=" + xpMod + "\n";
    }    

    @Override
    public void Attack() 
    {
        int atk = (int) attack - DungeonController.Instance().getPlayer().getDefenseValue();
        Player p = DungeonController.Instance().getPlayer();
        p.setHitPoints(p.getHitPoints()-atk);
        GuiViewDungeonOne.Instance().outputStoryText(this.name +" attack you with "+atk);
    }

    public void takeAttack(Player player) {
        
        int attack = (int) (player.getWeapon().getDamageValue() + player.getWeapon().getDamageIncreaseValue() - this.GetDefense());
        this.setHealth((int)this.getHealth() - attack);
        
        if (this.getHealth() <= 0) {
            GuiViewDungeonOne.Instance().outputStoryText(this.getName() + " took " + attack + " damage and died, from your blade.");
            DungeonController.Instance().getDungeonOne().removeMonsterFromDungeon( DungeonController.Instance().getPlayer().getCurrentRoom().getMonster() );
            if (DungeonController.Instance().getPlayer().getCurrentRoom().isItemHere()) {
                CommandController.Instance().getRoomCommand().pickupItem();
            }
        }
        else {
            
            GuiViewDungeonOne.Instance().outputStoryText(this.getName() + " took " + attack + " damage, from your blade and has " + this.getHealth() + " life left." );
        }
            
        
        
        
    }
}
