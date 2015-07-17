/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.numberconverter;

import com.blt.enterprise.number.converter.impl.NumberHundredsToWord;
import junit.framework.TestCase;

/**
 *
 * @author ekasongo
 */
public class NumberHundredsToWordTest extends TestCase {
    
    private NumberHundredsToWord instance;
    
    public NumberHundredsToWordTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp(); 
        instance = new NumberHundredsToWord();
    }

    /**
     * Test of convert method, of class NumberHundredsToWord.
     */
    public void testConvertHundred() {
        
        String result = instance.convert(100);
        assertEquals(" one hundred", result);
        result = instance.convert(200);
        assertEquals(" two hundred", result);
    }
    
    public void testConvertHundredUnit() {        
        
        String result = instance.convert(105);
        assertEquals(" one hundred and five", result);
    }
    
    public void testConvertHundredTens() {     
        
        String result = instance.convert(150);
        assertEquals(" one hundred and fifty", result);
    }
    
    public void testConvertHundredTensUnit() {        
        
        String result = instance.convert(183);
        assertEquals(" one hundred and eighty three", result);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown(); 
        instance = null;
    }
}
