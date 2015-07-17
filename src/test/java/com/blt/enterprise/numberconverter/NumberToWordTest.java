/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.numberconverter;

import com.blt.enterprise.number.converter.impl.NumberUnitTeenToWord;
import com.blt.enterprise.number.converter.convert.NumberToWord;
import junit.framework.TestCase;

/**
 *
 * @author ekasongo
 */
public class NumberToWordTest extends TestCase {
    
    public NumberToWordTest(String testName) {
        super(testName);
    }

    /**
     * Test of convertUnit method, of class NumberToWord.
     */
    public void testConvertUnitAndTeen() {
        System.out.println("convertUnit");
        NumberToWord instance = new NumberUnitTeenToWord();
        String result = instance.convert(0);
        assertEquals("zero", result);
        result = instance.convert(1);
        assertEquals(" one", result);
        result = instance.convert(9);
        assertEquals(" nine", result);
        result = instance.convert(14);
        assertEquals(" fourteen", result);
        result = instance.convert(19);
        assertEquals(" nineteen", result);
    }
    
}
