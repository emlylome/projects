/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.numberconverter;

import com.blt.enterprise.number.converter.impl.NumberThousandToWord;
import junit.framework.TestCase;

/**
 *
 * @author ekasongo
 */
public class NumberThousandToWordTest extends TestCase {
    
    private NumberThousandToWord instance;
    
    public NumberThousandToWordTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp(); 
        instance = new NumberThousandToWord();
    }
    /**
     * Test of convert method, of class NumberThousandToWord.
     */
    public void testConvertUnit() {
        
        String result = instance.convert(1000);
        assertEquals(" one thousand", result);
        result = instance.convert(3000);
        assertEquals(" three thousand", result);
    }
    
    public void testConvertTeens() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(15000);
        assertEquals(" fifteen thousand", result);
        result = instance.convert(19000);
        assertEquals(" nineteen thousand", result);
    }
    
    public void testConvertTens() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(20000);
        assertEquals(" twenty thousand", result);
        result = instance.convert(41000);
        assertEquals(" forty one thousand", result);
    }
    
    public void testConvertHundredsThousand() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(200000);
        assertEquals(" two hundred thousand", result);
        result = instance.convert(700000);
        assertEquals(" seven hundred thousand", result);
    }
    
    public void testConvertThousandUnits() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(1005);
        assertEquals(" one thousand and five", result);
        result = instance.convert(4019);
        assertEquals(" four thousand and nineteen", result);
    }
    
    public void testConvertThousandTensUnits() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(1040);
        assertEquals(" one thousand and forty", result);
        result = instance.convert(4069);
        assertEquals(" four thousand and sixty nine", result);
    }
    
    public void testConvertThousandHundredsTensUnits() {
        
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(1105);
        assertEquals(" one thousand one hundred and five", result);
        result = instance.convert(4169);
        assertEquals(" four thousand one hundred and sixty nine", result);
    }
    
    public void testConvertHundresThousandHundredsTensUnits() {
        NumberThousandToWord instance = new NumberThousandToWord();
        String result = instance.convert(200105);
        assertEquals(" two hundred thousand one hundred and five", result);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown(); 
        instance = null;
    }
    
}
