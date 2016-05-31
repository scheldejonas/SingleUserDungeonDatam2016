/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.model.DungeonOne;
import singleuserdungeon.model.monster.XmlParser;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.view.ConsoleGui;

/**
 *
 * @author misk
 */
public class SingleUserDungeon
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SingleUserDungeon SUD = new SingleUserDungeon();
        
        BaseMonster monster = XmlParser.Instance().GetMonster(0);
        
        //System.out.println(monster.GetName());
        
        ConsoleGui textGame = ConsoleGui.Instance().run();
        
    }
    
}
