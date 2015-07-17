/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.number.converter.impl;

import com.blt.enterprise.number.converter.convert.NumberToWord;
import com.blt.enterprise.number.converter.exception.WrongValueException;
import static com.blt.enterprise.number.converter.util.StringUtil.AND_WORD;
import static com.blt.enterprise.number.converter.util.StringUtil.HUNDRED;
import static com.blt.enterprise.number.converter.util.StringUtil.MILLION;
import static com.blt.enterprise.number.converter.util.StringUtil.MILLION_WORD;
import static com.blt.enterprise.number.converter.util.StringUtil.THOUSAND;

/**
 *
 * @author ekasongo
 */
public class NumberMillionToWord implements NumberToWord{

    private StringBuilder builder;
    private final NumberToWord numberThousandToWord = new NumberThousandToWord();
    private final NumberToWord numberHundredToWord = new NumberHundredsToWord();
    private final NumberToWord numberTeenstoWord = new NumberTensToWord();
    private final NumberToWord numberUnitToWord = new NumberUnitTeenToWord();
    
    public String convert(int no) {
        if(no < 0 || no >= 1000000000){
          throw new WrongValueException("wrong value inserted. (use value from 0 - 999999999)");
      }
        builder = new StringBuilder();
        int diff = no % MILLION;
        if(diff == 0){
            int value = no / MILLION;
            if(value < 20){
                builder.append(numberUnitToWord.convert(value)).append(MILLION_WORD);
            }else if(value >= 20 && value < HUNDRED){
                builder.append(numberTeenstoWord.convert(value)).append(MILLION_WORD);
            }else if(value > HUNDRED){
                builder.append(numberHundredToWord.convert(value)).append(MILLION_WORD);
            }
        } else {
            builder.append(convert(no - diff));
            if(diff < 20){
                builder.append(AND_WORD).append(numberUnitToWord.convert(diff));
            } else if(diff >= 20 && diff < HUNDRED){   
                builder.append(AND_WORD).append(numberTeenstoWord.convert(diff));
            } else if(diff > HUNDRED && diff < THOUSAND){
                builder.append(numberHundredToWord.convert(diff));
            } else if(diff >= THOUSAND){
                builder.append(numberThousandToWord.convert(diff));
            }
        }
        return builder.toString();
    }
    
}
