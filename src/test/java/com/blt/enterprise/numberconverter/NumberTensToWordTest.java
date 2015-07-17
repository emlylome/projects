/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.numberconverter;

import com.blt.enterprise.number.converter.impl.NumberTensToWord;
import com.blt.enterprise.number.converter.convert.NumberToWord;
import junit.framework.TestCase;

/**
 *
 * @author ekasongo
 */
public class NumberTensToWordTest extends TestCase {
    
    public NumberTensToWordTest(String testName) {
        super(testName);
    }

    /**
     * Test of convert method, of class NumberTensToWord.
     */
    public void testConvertTens() {
        
        NumberToWord instance = new NumberTensToWord();
        String result = instance.convert(20);
        assertEquals(" twenty", result);
        result = instance.convert(40);
        assertEquals(" forty", result);
    }
    
     public void testConvertTensAndUnits() {
        
        NumberToWord instance = new NumberTensToWord();
        String result = instance.convert(21);
        assertEquals(" twenty one", result);
        result = instance.convert(46);
        assertEquals(" forty six", result);
    }
    
}
