/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

/**
 *
 * @author scheldejonas
 */
public class StorageController {
    
    private static StorageController instance;

    public StorageController Instance() {
        
        if (instance == null) {
            this.instance = new StorageController();
        }
        
        return this.instance;
    }

    public void saveDungeonController() {
        DungeonController.Instance().saveToSerialFile();
    }
    
    
}
