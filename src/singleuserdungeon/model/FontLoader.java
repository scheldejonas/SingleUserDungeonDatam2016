/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;


import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author misk
 */
public class FontLoader 
{
    private static FontLoader instance;
    
    private Font DieFont;
    
    public static FontLoader Instance()
    {
        if(instance == null)
        {
            instance = new FontLoader();
        }
        
        return instance;
    }
    
    public Font GetFont()
    {
        if(DieFont == null)
        {
            DieFont = LoadFont();
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(DieFont);
           
        }
        
        return DieFont;
    }
    
    private Font LoadFont()
    {
        Font f = null;
        
        try
        {
            InputStream is = new FileInputStream(System.getProperty("user.dir")+"/src/singleuserdungeon/fonts/DIEDIEDI.ttf");
            f = Font.createFont(Font.TRUETYPE_FONT, is);
            System.out.println("Return font "+f.getName());
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            f = new Font("serif",Font.PLAIN,24);
            System.out.println("Return font "+f.getName());
        }
        
        return f;
    }
    
}
