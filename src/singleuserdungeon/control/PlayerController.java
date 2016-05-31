/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IPlayer;
import singleuserdungeon.model.player.Player;
import singleuserdungeon.model.player.Weapon;

/**
 *
 * @author scheldejonas
 */
public class PlayerController {
    
    Player player = new Player();
    
    public void StartUpInitComponents() {
        player.setHitPoints(30);
        player.setNumberOfHealingPotions(1);
        player.setWeapon(new Weapon("WoodSword", "Your wooden sword will give you the power to hit an enemy on all surface, but you will need more strength to cut through your enemy's with this", 1, 5, 2));
    }
    
}
