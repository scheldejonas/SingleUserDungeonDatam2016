/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.player;

import java.io.Serializable;
import java.util.ArrayList;
import singleuserdungeon.control.DungeonController;
import singleuserdungeon.control.GameController;
import singleuserdungeon.interfaces.IPlayer;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.item.XmlItemParser;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.model.room.BaseRoom;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author misk
 */
public class Player implements IPlayer,Serializable {
    
    private String name;
    private int hitPoints;
    private int level;
    private transient BaseItem weapon;
    private transient BaseItem shield;
    private String description;
    private transient BaseRoom currentRoom;
    private transient ArrayList<BaseItem> Backpack;
    
    public Player() 
    {
        this.Backpack = new ArrayList();
    }
    
    public Player(String NewName,int NewHitpoints, int NewLevel, BaseItem NewWeapon, String NewDescription) 
    {
        this.name = NewName;
        this.hitPoints = NewHitpoints;
        this.level = NewLevel;
        this.weapon = NewWeapon;
        this.description = NewDescription;
        this.Backpack = new ArrayList();
    }
    
    public int getDefenseValue()
    {
        if(this.shield != null)
        {
            return this.shield.getShieldValue();
        }
        else
        {
            return 0;
        }
    }
    
    public void  addItem(int id)
    {
        BaseItem item = XmlItemParser.instance().getItem(id);
        this.Backpack.add(item);
    }
    
    public void addItem(BaseItem newBaseItem) {
        this.Backpack.add(newBaseItem);
    }
    
    public void addWeapon(int id)
    {
       this.weapon =  XmlItemParser.instance().getItem(id);
    }
    
    public void AddShield(int id)
    {
         this.shield =  XmlItemParser.instance().getItem(id);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getNumberOfHealingPotions() 
    {
        int amount =0;
        
        for(int i =0; i < Backpack.size();i++)
        {
            if(Backpack.get(i).getName().equals("Healing Potion"))
            {
                amount++;
            }
        }
        
        return amount;
    }
    
    public String useItem(String str)
    {
        str = str.substring(3);
        
        if(Backpack != null)
        {
            for(int i = 0; i <Backpack.size();i++)
            {
                String iName = Backpack.get(i).getName();
                iName.toLowerCase();
                
                if(str.equals(iName))
                {
                    Use(Backpack.get(i).getName());
                    return "You used "+Backpack.get(i).getName();
                }
                
            }
        
            System.out.println("org "+str);
        
            return"You cant use that";
        }
        
        return str+" does not exist";
    }
    
    private void Use(String str)
    {
        switch(str)
        {
            case "Weapon poison potion":
            {
                this.weapon.SetDamageIncreaseValue(5);
            }
            case "Healing Potion":
            {
                setHitPoints(getHitPoints()+10);
                RemoveItem("Healing Potion");
                
            }
            
        }
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public BaseItem getWeapon() {
        return this.weapon;
    }

    @Override
    public void setWeapon(BaseItem weapon) {
        this.weapon = weapon;
    }
    
    public BaseRoom getCurrentRoom()
    {
        return currentRoom;
    }
    
    private void RemoveItem(String str)
    {
        for(int i = 0; i < Backpack.size();i++)
        {
            if(Backpack.get(i).getName().equals(str))
            {
                Backpack.remove(i);
            }
        }
    }
    
    public void setRoom(BaseRoom nextRoom)
    {
        currentRoom = nextRoom;
    }

    public ArrayList<BaseItem> getBackpack() {
        return this.Backpack;
    }

    public void removeBackpack() {
        this.Backpack = null;
    }

    public BaseItem getShield() {
        return this.shield;
    }   


    public void takeAttack(BaseMonster monster) {
        
        int monsterAttackValue = (int) (monster.GetAttack() + this.getDefenseValue());
        int playerHealth = this.hitPoints;
                
        if ( (playerHealth - monsterAttackValue) <= 0) {
            GuiViewDungeonOne.Instance().outputStoryText("The monster killed you with the hit of " + monsterAttackValue + " damage in it's strike.");
            GameController.Instance().endGame();
        }
        else {
            this.hitPoints -= monsterAttackValue;
            GuiViewDungeonOne.Instance().outputStoryText("The monster hit you with " + monsterAttackValue + " damage in it's strike." + " You have " + this.hitPoints + " left.");
            GuiViewDungeonOne.Instance().outputStoryText("Maybe there is a beautifull item placed behind the monster after you have killed it.");
        }
        
    }
   
}
