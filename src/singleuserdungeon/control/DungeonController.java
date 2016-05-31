/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import singleuserdungeon.interfaces.IDungeon;
import singleuserdungeon.model.DungeonOne;

/**
 *
 * @author scheldejonas
 */
public class DungeonController {
    
    private IDungeon dungeonOne;

    public DungeonController() {
        this.dungeonOne = new DungeonOne("Den of Death","This is the place of the tainted monsters, irresistable items and splash effected weapons. All of it is barried in the deepth of the rooms.");
    }
    
    
}
