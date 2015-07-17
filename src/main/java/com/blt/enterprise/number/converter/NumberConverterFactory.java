/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.number.converter;

import com.blt.enterprise.number.converter.convert.NumberToWord;
import com.blt.enterprise.number.converter.impl.NumberHundredsToWord;
import com.blt.enterprise.number.converter.impl.NumberMillionToWord;
import com.blt.enterprise.number.converter.impl.NumberTensToWord;
import com.blt.enterprise.number.converter.impl.NumberThousandToWord;
import com.blt.enterprise.number.converter.impl.NumberUnitTeenToWord;

/**
 *
 * @author ekasongo
 */
public class NumberConverterFactory {
    
    public static final int UNIT = 1;
    public static final int TEEN = 2;
    public static final int TEN = 3;
    public static final int HUNDRED = 4;
    public static final int THOUSAND = 5;
    public static final int MILLION = 6;
    
    private static NumberConverterFactory instance;
    
    private NumberConverterFactory(){
        
    }
    
    public static synchronized NumberConverterFactory getInstance(){
        if(instance == null){
            instance = new NumberConverterFactory();
        }
        return instance;
    }
    
    public NumberToWord getNumberConverter(int type){
        NumberToWord numberToWord;
        switch(type){
            case(UNIT):
                numberToWord = new NumberUnitTeenToWord();
                break;
            case(TEEN):
                numberToWord = new NumberUnitTeenToWord();
                break;
            case(TEN):
                numberToWord = new NumberTensToWord();
                break;
            case(HUNDRED):
                numberToWord = new NumberHundredsToWord();
                break;
            case(THOUSAND):
                numberToWord = new NumberThousandToWord();
                break;
            case(MILLION):
                numberToWord = new NumberMillionToWord();
                break;
            default:
                numberToWord = null;
        }
        return numberToWord;
    }
}
