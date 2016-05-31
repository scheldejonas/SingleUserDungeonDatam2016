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
    private int health;
    private int level;
    private boolean hasHealingPotion;
    private int weaponDamage;

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHasHealingPotion() {
        return hasHealingPotion;
    }

    public void setHasHealingPotion(boolean hasHealingPotion) {
        this.hasHealingPotion = hasHealingPotion;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
    
    
    
}
