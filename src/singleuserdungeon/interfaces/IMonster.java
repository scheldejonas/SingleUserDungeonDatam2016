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
public interface IMonster 
{
    public String GetName();
    
    public String getDescription();
    
    public float GetHealth();
    
    public float GetAttack();
    
    public float GetDefense();   
    
    
}
