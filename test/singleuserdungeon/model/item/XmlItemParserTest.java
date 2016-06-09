/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.model.item;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Document;

/**
 *
 * @author misk
 */
public class XmlItemParserTest {
    
    XmlItemParser xip;
    
    public XmlItemParserTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()
    {
        xip = XmlItemParser.instance();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of instance method, of class XmlItemParser.
     */
   
    /**
     * Test of LoadXml method, of class XmlItemParser.
     */
    
    /**
     * Test of getItem method, of class XmlItemParser.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        XmlItemParser instance = new XmlItemParser();
       // BaseItem expResult = "End Treasure Chest";
        BaseItem result1 = instance.getItem(0);
        BaseItem result2 = instance.getItem(1);
        BaseItem result3 = instance.getItem(2);
        BaseItem result4 = instance.getItem(3);
        assertEquals("End Treasure Chest", result1.getName());
        assertEquals("Short sword", result2.getName());
        assertEquals("Long sword", result3.getName());
        assertEquals("Weapon poison potion", result4.getName());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAllItems method, of class XmlItemParser.
     */
    @Test
    public void testGetAllItems() {
        System.out.println("getAllItems");
        XmlItemParser instance = new XmlItemParser();
        int expResult = 15;
        ArrayList<BaseItem> result = instance.getAllItems();
        assertTrue(result.size() == expResult );
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
