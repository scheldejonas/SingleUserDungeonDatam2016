/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.view;

import singleuserdungeon.control.DungeonController;
import singleuserdungeon.control.PlayerController;
import singleuserdungeon.model.monster.XmlParser;

/**
 *
 * @author scheldejonas
 */
public class ConsoleGui {
    
    private static ConsoleGui instance = null;
    
    public static ConsoleGui Instance() {
        if(instance == null) {
            instance = new ConsoleGui();
        }
        
        return instance;
    }
    
    private boolean isResetGame;
    private boolean isDungeonReady;
    private boolean isPlayerReady;
    private boolean isGameReset;
    private DungeonController dungeon;
    private PlayerController player;
    private String statString;
    
    public ConsoleGui run() {
        
        do {
            
            dungeon = new DungeonController();
            isDungeonReady = this.startDungeon(dungeon);
            
            player = new PlayerController();
            isPlayerReady = this.startPlayer(player);
            
            isGameReset = this.runGame();
            
        } while (isResetGame);
        
        return this.setStats();
    }

    private void setStats() {
        this.statString = dungeon.toString();
        this.statString += player.toString();
    }

    private boolean startDungeon(DungeonController dungeon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean startPlayer(PlayerController player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean runGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

}
