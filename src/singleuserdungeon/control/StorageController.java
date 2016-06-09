/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import singleuserdungeon.view.GuiViewDungeonOne;

/**
 *
 * @author scheldejonas
 */
public class StorageController {
    
    private static StorageController instance;

    public static StorageController Instance() {
        
        if (instance == null) {
            instance = new StorageController();
        }
        
        return instance;
    }

    public void saveDungeonController() {
        DungeonController.Instance().saveDungeonControllerToSerFile();
    }

}
