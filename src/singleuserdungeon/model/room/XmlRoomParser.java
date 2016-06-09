/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.room;

import singleuserdungeon.model.monster.*;
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
public class XmlRoomParser implements IXmlParser {
    
    private static XmlRoomParser instance = null;
    
    public static XmlRoomParser instance()
    {
        if(instance == null)
        {
            instance = new XmlRoomParser();
        }
        
        return instance;
    }
    
    private ArrayList<BaseRoom> Rooms = new ArrayList<>();
       
    @Override
    public Document LoadXml() {
        try
        {
        //Setting up file - Load and parse the file.
        File inputFile = new File(System.getProperty("user.dir")+"/src/singleuserdungeon"+"/XmlFiles" + "/Rooms.xml");
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
    
    public BaseRoom getRoom(int id) {
        
        if(Rooms == null || Rooms.size() == 0) {
         
            Document doc =  LoadXml();
            
            doc.normalize();
            NodeList nList = doc.getElementsByTagName("Room");
            
            for(int i = 0; i < nList.getLength();i++)
            {
               
                Node nNode = nList.item(id);
                if (nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                   
                    String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                    String description = eElement.getElementsByTagName("description").item(0).getTextContent();
                    
                    int location = Integer.parseInt(eElement.getElementsByTagName("location").item(0).getTextContent());
                    int northRoomNumber = Integer.parseInt(eElement.getElementsByTagName("northRoomNumber").item(0).getTextContent());
                    int eastRoomNumber = Integer.parseInt(eElement.getElementsByTagName("eastRoomNumber").item(0).getTextContent());
                    int southRoomNumber = Integer.parseInt(eElement.getElementsByTagName("southRoomNumber").item(0).getTextContent());
                    int westRoomNumber = Integer.parseInt(eElement.getElementsByTagName("westRoomNumber").item(0).getTextContent());

                    BaseRoom room = new BaseRoom(location, name, description, northRoomNumber, eastRoomNumber, southRoomNumber, westRoomNumber);
                            
                    Rooms.add(room);
                }
            }
           return Rooms.get(id);
           
        }
        else {
            return Rooms.get(id);
            
        }
    }

    public ArrayList<BaseRoom> getAllRooms() {
        return this.Rooms;
    }
    
}
