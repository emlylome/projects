/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blt.enterprise.number.converter.impl;

import com.blt.enterprise.number.converter.convert.NumberToWord;
import com.blt.enterprise.number.converter.exception.WrongValueException;
import static com.blt.enterprise.number.converter.util.StringUtil.tensNames;
import static com.blt.enterprise.number.converter.util.StringUtil.TEN;

/**
 *
 * @author ekasongo
 */
public class NumberTensToWord implements NumberToWord {
    
    private final NumberToWord unitToWord = new NumberUnitTeenToWord();
    private StringBuilder builder;

    public String convert(int no) {
        if(no < 0 || no >= 100){
          throw new WrongValueException("wrong value inserted. (use value from 0 - 99)");
      }
        builder = new StringBuilder();
        int diff = no % 10;
        if(diff == 0){
            builder.append(tensNames[no / TEN]);
        }else{
            builder.append(convert(no - diff));
            builder.append(unitToWord.convert(diff));
        }
        return builder.toString();
    }
}
