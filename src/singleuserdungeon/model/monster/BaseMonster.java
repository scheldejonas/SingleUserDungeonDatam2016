/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.monster;

import singleuserdungeon.interfaces.IMonster;

/**
 *
 * @author misk
 */
public class BaseMonster implements IMonster
{

    private String name;
    private float health;
    private float attack;
    private float defense;
    private float xpMod;
    
    public BaseMonster(String monsterName,float monsterHealth, float monsterAttack, float monsterDefense,float monsterXpMod)
    {
        name = monsterName;
        health = monsterHealth;
        attack = monsterAttack;
        defense = monsterDefense;
        xpMod = monsterXpMod;        
    }

    @Override
    public String GetName() 
    {
        return name;
    }

    @Override
    public float GetHealth()
    {
        return health;
    }

    @Override
    public float GetAttack() 
    {
        return attack;
    }

    @Override
    public float GetDefense() 
    {
        return defense;
    }
    
}
