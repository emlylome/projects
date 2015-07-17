/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.number.converter.impl;

import com.blt.enterprise.number.converter.convert.NumberToWord;
import com.blt.enterprise.number.converter.exception.WrongValueException;
import static com.blt.enterprise.number.converter.util.StringUtil.AND_WORD;
import static com.blt.enterprise.number.converter.util.StringUtil.HUNDRED_WORD;
import static com.blt.enterprise.number.converter.util.StringUtil.HUNDRED;

/**
 *
 * @author ekasongo
 */
public class NumberHundredsToWord implements NumberToWord{
    
    private final NumberToWord numberToWord = new NumberTensToWord();
    private final NumberToWord numberTeensToWord = new NumberUnitTeenToWord();
    
    private StringBuilder builder;

    public String convert(int no) {
        if(no < 0 || no >= 1000){
          throw new WrongValueException("wrong value inserted. (use value from 0 - 999)");
      }
        builder = new StringBuilder();
        int diff = no % HUNDRED;
        if(diff == 0){            
            builder.append(numberToWord.convert(no / HUNDRED)).append(HUNDRED_WORD);
        }else{
            builder.append(convert(no - diff));
            if(diff > 20){
                builder.append(AND_WORD).append(numberToWord.convert(diff));
            } else{
                builder.append(AND_WORD).append(numberTeensToWord.convert(diff));
            }
        }
        return builder.toString();
    }
    
}
