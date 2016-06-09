/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.item;

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
public class XmlItemParser implements IXmlParser {
    
    private static XmlItemParser instance = null;
    
    private ArrayList<BaseItem> Items =null;
    
    public static XmlItemParser instance() {
        if(instance == null) {
            instance = new XmlItemParser();
        }
        
        return instance;
    }
    
    
    
    @Override
    public Document LoadXml() {
        
        try {
        //Setting up file - Load and parse the file.
        File inputFile = new File(System.getProperty("user.dir")+"/src/singleuserdungeon"+"/XmlFiles" + "/Items.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputFile);
        
        return doc;
        
        }
        catch(Exception e) {
            System.out.println("LoadXml error: "+e.getMessage());
            
            return null;
        }
    }
    
    public BaseItem getItem(int id) {
        
        if(Items == null) {
         
            Document doc =  LoadXml();
            Items = new ArrayList<>();
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Item");
            
            for(int i = 0; i < nList.getLength();i++) 
            {
               
                Node nNode = nList.item(i);
                Element eeElement = (Element) nNode;
                 
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                    String description = eElement.getElementsByTagName("description").item(0).getTextContent();
                    
                    int goldValue = Integer.parseInt(eElement.getElementsByTagName("goldValue").item(0).getTextContent());
                    int damageIncreaseValue = Integer.parseInt(eElement.getElementsByTagName("damageIncreaseValue").item(0).getTextContent());
                    int shieldIncreaseValue = Integer.parseInt(eElement.getElementsByTagName("shieldIncreaseValue").item(0).getTextContent());

                    BaseItem item = new BaseItem(name,description,goldValue,damageIncreaseValue,shieldIncreaseValue);
                    
                    Items.add(item);
                }
            }    
            
            return Items.get(id);
            
        }
        else
        {
            return Items.get(id);
            
        }
    }

    public ArrayList<BaseItem> getAllItems() 
    {
        if(Items == null)
        {
            getItem(0);
        }
        return this.Items;
    }
    
}
