/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

/**
 *
 * @author scheldejonas
 */
public class MenuOptionHelp implements IMenuOption {

    @Override
    public String getName() {
        return "You have sent message through a little mouse with a note to the wise doctor, who sat in the corner in the dead end room, where it all began.";
    }

    @Override
    public String getDescription() {
        return "everything stops, nothings moves, only a small light reveals in the ";
    }
    
}
