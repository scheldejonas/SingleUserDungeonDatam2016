/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.model.DungeonOne;
import singleuserdungeon.model.item.BaseItem;
import singleuserdungeon.model.item.XmlItemParser;
import singleuserdungeon.model.monster.XmlMonsterParser;
import singleuserdungeon.model.monster.BaseMonster;

/**
 *
 * @author misk
 */
public class SingeUserDungeon
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseMonster monster = XmlMonsterParser.instance().GetMonster(0);
        
        BaseItem item = XmlItemParser.instance().getItem(0);
        
        System.out.println(monster.toString());
        System.out.println(item.toString());
        
        GameController.instance(); //Opening the game, the runner ends after this, therefore it is possible to start 2 games, with this Starter, by making a new instance variable in GameController
        
    }
    
}
