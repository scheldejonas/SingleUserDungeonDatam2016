/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.player;

import singleuserdungeon.interfaces.IWeapon;

/**
 *
 * @author scheldejonas
 */
public class Weapon implements IWeapon {

    private String name;
    private String description;
    private int damageValue;
    private int length;
    private int weight;

    public Weapon(String name, String description, int damageValue, int length, int weight) {
        this.name = name;
        this.description = description;
        this.damageValue = damageValue;
        this.length = length;
        this.weight = weight;
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
    public int getDamageValue() {
        return this.damageValue;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
    
}
