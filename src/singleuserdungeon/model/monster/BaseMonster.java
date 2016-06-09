/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.monster;

import singleuserdungeon.control.DungeonController;
import singleuserdungeon.interfaces.IMonster;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class BaseMonster implements IMonster {

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
        
        GuiViewDungeonOne.instance().outputStoryText(name+ " "+ description);
    }

    public void SetHealth(int health)
    {
        this.health = health;
    }
    
    @Override
    public String GetName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float GetHealth() {
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
        int atk = (int) attack - DungeonController.instance.getPlayer().GetDefenseValue();
        Player p = DungeonController.instance.getPlayer();
        p.setHitPoints(p.getHitPoints()-atk);
        GuiViewDungeonOne.instance().outputStoryText(this.name +" attack you with "+atk);
    }
}
