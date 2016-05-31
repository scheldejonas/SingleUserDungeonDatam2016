/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.player;

import singleuserdungeon.interfaces.IPlayer;

/**
 *
 * @author misk
 */
public class Player implements IPlayer {
    
    private String name;
    private int hitPoints;
    private int level;
    private int numberOfHealingPotions;
    private Weapon weapon;
    private String description;

    public Player() 
    {
    }
    
    public Player(String NewName,int NewHitpoints, int NewLevel, int NewNumberOfHealingPotions, Weapon NewWeapon, String NewDescription) 
    {
        name = NewName;
        hitPoints = NewHitpoints;
        level = NewLevel;
        numberOfHealingPotions = NewNumberOfHealingPotions;
        weapon = NewWeapon;
        description = NewDescription;
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
    public int getNumberOfHealingPotions() {
        return numberOfHealingPotions;
    }

    @Override
    public void setNumberOfHealingPotions(int numberOfHealingPotions) {
        this.numberOfHealingPotions = numberOfHealingPotions;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
   
}
