/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IPlayer;
import singleuserdungeon.model.item.XmlItemParser;
import singleuserdungeon.model.player.Player;

/**
 *
 * @author scheldejonas
 */
public class PlayerController {
    
    Player player = new Player();
    
    public void StartUpInitComponents() {
        player.setHitPoints(30);
        player.AddItem(4);
        player.setWeapon(XmlItemParser.instance().getItem(1));
    }
    
}
