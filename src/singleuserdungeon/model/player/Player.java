/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.player;

import java.util.ArrayList;
import singleuserdungeon.interfaces.IPlayer;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.item.XmlItemParser;
import singleuserdungeon.model.room.BaseRoom;

/**
 *
 * @author misk
 */
public class Player implements IPlayer {
    
    private String name;
    private int hitPoints;
    private int level;
    private BaseItem weapon;
    private BaseItem shield;
    private String description;
    private BaseRoom currentRoom;
    private ArrayList<BaseItem> Backpack;
    
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
    
    public int GetDefenseValue()
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
    
    public void  AddItem(int id)
    {
        BaseItem item = XmlItemParser.instance().getItem(id);
        this.Backpack.add(item);
    }
    
    public void AddWeapon(int id)
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
    
    public String UseItem(String str)
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
    
    public void SetRoom(BaseRoom nextRoom)
    {
        if (nextRoom.isMonsterHere()) {
            nextRoom.getMonster().Attack();
        }
        currentRoom = nextRoom;
    }
   
}
