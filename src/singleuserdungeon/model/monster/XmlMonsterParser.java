/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.monster;

import java.io.File;
import java.util.ArrayList;
import singleuserdungeon.interfaces.IXmlParser;
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
public class XmlMonsterParser implements IXmlParser {
    
    private static XmlMonsterParser instance = null;
    
    public static XmlMonsterParser instance()
    {
        if(instance == null)
        {
            instance = new XmlMonsterParser();
        }
        
        return instance;
    }
    
    private ArrayList<BaseMonster> Monsters;
       
    @Override
    public Document LoadXml() {
        try
        {
        //Setting up file - Load and parse the file.
        File inputFile = new File(System.getProperty("user.dir")+"/src/singleuserdungeon"+"/XmlFiles" + "/Monsters.xml");
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
    
    public BaseMonster GetMonster(int id) {
        
        if(Monsters == null || Monsters.size() == 0) {
         
            Document doc =  LoadXml();
            Monsters = new ArrayList<>();
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Monster");
            
            for (int i = 0; i < nList.getLength();i++)
            {
               
                Node nNode = nList.item(i);
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                   
                    String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                    String description = eElement.getElementsByTagName("description").item(0).getTextContent();
                     
                    float health = Float.parseFloat(eElement.getElementsByTagName("health").item(0).getTextContent());
                    float attack = Float.parseFloat(eElement.getElementsByTagName("attack").item(0).getTextContent());
                    float defense = Float.parseFloat(eElement.getElementsByTagName("defense").item(0).getTextContent());
                    float xpmod = Float.parseFloat(eElement.getElementsByTagName("xpmod").item(0).getTextContent());

                    BaseMonster monster = new BaseMonster(name,description,health,attack,defense,xpmod);
                    Monsters.add(monster);
                }
            }
           return Monsters.get(id);
           
        }
        else {
            return Monsters.get(id);
            
        }
    }
    
    public ArrayList<BaseMonster> getAllMonsters() {
        return (ArrayList<BaseMonster>) this.Monsters.clone();
    }
    
}
