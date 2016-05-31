/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.player;

import singleuserdungeon.interfaces.ILocation;

/**
 *
 * @author scheldejonas
 */
public class Location implements ILocation {

    private int indexNumber;
    private int yCoordinate;
    private int xCoordinate;

    public Location(int indexNumber, int yCoordinate, int xCoordinate) {
        this.indexNumber = indexNumber;
        this.yCoordinate = yCoordinate;
        this.xCoordinate = xCoordinate;
    }

    @Override
    public int getXCoordinate() {
        return this.xCoordinate;
    }

    @Override
    public int getYCoordinate() {
        return this.yCoordinate;
    }

    @Override
    public int getLocationIndexNumber() {
        return this.indexNumber;
    }
    
}
