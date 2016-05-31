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
        player.setWeapon(new Weapon("LongSword", "The standard of swords, you want to replace it rather sooner than later.. but for now it gets the job done", 6, 5, 2));
    }
    
}
