/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import singleuserdungeon.interfaces.IFileHandler;

/**
 *
 * @author scheldejonas
 */
public class FileHandler implements IFileHandler {

    private PrintWriter pr;
    
    @Override
    public boolean saveTextToFile(String string) {
        try {
            pr = new PrintWriter ("SUD_of_" + new Date() + ".txt");
            pr.print(string);       
            pr.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
}
