/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import singleuserdungeon.control.DungeonController;
import singleuserdungeon.control.PlayerController;
import singleuserdungeon.control.StorageController;
import singleuserdungeon.model.monster.XmlParser;

/**
 *
 * @author scheldejonas
 */
public class ConsoleGui {
    
    private static ConsoleGui instance = null;
    
    public static ConsoleGui Instance()
    {
        if(instance == null)
        {
            
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
    private StorageController savedGame;
    private String statString;
    private boolean isLoadGame;
    private boolean isSaveGame;
    private Scanner scanner;
    private String playerAnswer;
    
    public String run() {
        
        scanner = new Scanner(System.in);
        System.out.println("Would you like to load the previous game?");
        playerAnswer = scanner.next();
        if (playerAnswer.equals("yes")) {
            isLoadGame = true;
            playerAnswer = "";
        }
        else {
            isLoadGame = false;
        }
        
        isSaveGame = false;
        
        do {
            
            if (isLoadGame) {
                this.loadGame();
            }
            else {
                dungeon = new DungeonController();
                isDungeonReady = this.startDungeon();

                player = new PlayerController();
                isPlayerReady = this.startPlayer();
            }
            
            isGameReset = this.runGame();
            
            if (isSaveGame) {
                this.saveGame();
            }
            
        } while (isGameReset || isLoadGame);
        
        return this.setStats();
    }

    private String setStats() {
        this.statString = dungeon.toString();
        this.statString += player.toString();
        return statString;
    }

    private boolean startDungeon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean startPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean runGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadGame() {
        dungeon = savedGame.getDungeon();
        player = savedGame.getPlayer();
    }

    private void saveGame() {
        savedGame.setDungeon(this.dungeon);
        savedGame.setPlayer(this.player);
    }

}
