/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
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
        
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String stringDate = cal.get(Calendar.DAY_OF_MONTH) + "_";
        stringDate += cal.get(Calendar.MONTH) + "_";
        stringDate += cal.get(Calendar.YEAR) + "_time_";
        stringDate += cal.get(Calendar.HOUR_OF_DAY) + "-";
        stringDate += cal.get(Calendar.MINUTE);
        

        try {
            pr = new PrintWriter ("SUD_of_" + stringDate + ".txt");
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
