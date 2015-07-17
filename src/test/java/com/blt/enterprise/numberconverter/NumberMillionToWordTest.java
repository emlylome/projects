/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.numberconverter;

import com.blt.enterprise.number.converter.impl.NumberMillionToWord;
import junit.framework.TestCase;

/**
 *
 * @author ekasongo
 */
public class NumberMillionToWordTest extends TestCase {
    
    private NumberMillionToWord instance;
    
    public NumberMillionToWordTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp(); 
        instance = new NumberMillionToWord();
    }    

    /**
     * Test of convert method, of class NumberMillionToWord.
     */
    public void testConvertMillion() {
        
        String result = instance.convert(1000000);
        assertEquals(" one million", result);
        result = instance.convert(3000000);
        assertEquals(" three million", result);
    }
    
    public void testConvertTeensMillion() {
        
        String result = instance.convert(19000000);
        assertEquals(" nineteen million", result);
        result = instance.convert(15000000);
        assertEquals(" fifteen million", result);
    }
    
    public void testConvertTensMillion() {
        
        String result = instance.convert(20000000);
        assertEquals(" twenty million", result);
        result = instance.convert(50000000);
        assertEquals(" fifty million", result);
    }
    
    public void testConvertHundredMillion() {
        
        String result = instance.convert(200000000);
        assertEquals(" two hundred million", result);
        result = instance.convert(300000000);
        assertEquals(" three hundred million", result);
    }
    
    public void testConvertHundredUnitMillion() {
        
        String result = instance.convert(205000000);
        assertEquals(" two hundred and five million", result);
    }
    
    public void testConvertHundredTeensMillion() {
        
        String result = instance.convert(219000000);
        assertEquals(" two hundred and nineteen million", result);
    }
    
    public void testConvertHundredTensMillion() {
        
        String result = instance.convert(240000000);
        assertEquals(" two hundred and forty million", result);
    }
    
    public void testConvertMillionTeensUnits() {
        
        String result = instance.convert(2000005);
        assertEquals(" two million and five", result);
        result = instance.convert(2000015);
        assertEquals(" two million and fifteen", result);
    }
    
    public void testConvertMillionTensUnits() {
        
        String result = instance.convert(2000020);
        assertEquals(" two million and twenty", result);
        result = instance.convert(2000045);
        assertEquals(" two million and forty five", result);
    }
    
     public void testConvertTensMillionHundredsTensUnits() {
        
        String result = instance.convert(56945781);
        assertEquals(" fifty six million nine hundred and forty five thousand seven hundred and eighty one", result); 
     }
     
      public void testConvertLastNumber() {
        
        String result = instance.convert(999999999);
        assertEquals(" nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", result);
      }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown(); 
        instance = null;
    }
}
