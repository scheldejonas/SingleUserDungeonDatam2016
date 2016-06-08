/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.interfaces;

/**
 *
 * @author misk
 */
public interface IItem {
    
    public String getName();

    public String getDescription();

    public int getGoldValue();

    public int getDamageIncreaseValue();

    public int getShieldIncreaseValue();
    
}
