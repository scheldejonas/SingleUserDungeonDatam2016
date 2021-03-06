/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import java.io.Serializable;
import singleuserdungeon.interfaces.ILocation;

/**
 *
 * @author scheldejonas
 */
public class Location implements ILocation,Serializable {

    private int indexNumber;
    private int yCoordinate;
    private int xCoordinate;

    public Location(int indexNumber, int yCoordinate, int xCoordinate) {
        this.indexNumber = indexNumber;
        this.yCoordinate = yCoordinate;
        this.xCoordinate = xCoordinate;
    }

    public Location(int indexNumber) {
        this.indexNumber = indexNumber;
        this.yCoordinate = 0;
        this.xCoordinate = 0;
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

    @Override
    public String toString() {
        return "Location_" + "indexNumber=" + indexNumber;
    }
    
    
}
