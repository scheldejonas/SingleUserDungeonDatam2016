/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model;

import java.io.File;
import java.util.ArrayList;
import singleuserdungeon.interfaces.IXmlParser;
import singleuserdungeon.model.monster.BaseMonster;
import singleuserdungeon.model.player.Location;

import java.util.Hashtable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author misk
 */
public class XmlParser implements IXmlParser
{
    private static XmlParser instance = null;
    
    private ArrayList<BaseMonster> Monsters = new ArrayList<>();
    private ArrayList<Location> Locations= new ArrayList<>();
    private ArrayList<Item> Items = new ArrayList<>();
    
    
    public static XmlParser Instance()
    {
        if(instance == null)
        {
            instance = new XmlParser();
        }
        
        return instance;
    }
    
    private Document LoadXml(String name)
    {
        try
        {
        //Setting up file - Load and parse the file.
        File inputFile = new File(name+".xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputFile);
        
        return doc;
        
        }
        catch(Exception e)
        {
            System.out.println("LoadXml error: "+e.getMessage());
            
            return null;
        }
    }
    

    @Override
    public BaseMonster GetMonster(int id) 
    {
        if(Monsters == null || Monsters.size() <=0)
        {
           Document doc =  LoadXml("Monster");
           NodeList nList = doc.getElementsByTagName("Monster");
           
           for(int i = 0; i < nList.getLength();i++)
           {
               Node nNode = nList.item(id);
               if (nNode.getNodeType() == Node.ELEMENT_NODE)
               {
                   Element eElement = (Element) nNode;
                   
                   String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                   float health = Float.parseFloat(eElement.getElementsByTagName("health").item(0).getTextContent());
                   float attack = Float.parseFloat(eElement.getElementsByTagName("attack").item(0).getTextContent());
                   float defense = Float.parseFloat(eElement.getElementsByTagName("defense").item(0).getTextContent());
                   float xpmod = Float.parseFloat(eElement.getElementsByTagName("xpmod").item(0).getTextContent());
                   
                   BaseMonster monster = new BaseMonster(name,health,attack,defense,xpmod);
                   
                   Monsters.add(monster);
               }
               
           }
           
           return Monsters.get(id);
           
        }
        else
        {
            return Monsters.get(id);
        }
        
    }

    @Override
    public Location GetLocation(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item GetItem(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
