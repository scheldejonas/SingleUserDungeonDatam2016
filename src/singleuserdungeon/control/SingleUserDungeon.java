/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.model.XmlParser;
import singleuserdungeon.model.monster.BaseMonster;

/**
 *
 * @author misk
 */
public class SingleUserDungeon
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        // TODO code application logic here
        
        SingleUserDungeon SUD = new SingleUserDungeon();
        
        BaseMonster monster = XmlParser.Instance().GetMonster(0);
        
        System.out.println(monster.GetName());
        
        
    }
    
}
