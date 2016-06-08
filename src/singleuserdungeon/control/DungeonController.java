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
    
    public static DungeonController instance;

    public static DungeonController instance() {
        
        if (instance == null) {
            instance = new DungeonController();
        }
        
        return instance;
    }
    
    private final DungeonOne dungeonOne;

    public DungeonController() {
        this.dungeonOne = new DungeonOne();
    }
    
}
