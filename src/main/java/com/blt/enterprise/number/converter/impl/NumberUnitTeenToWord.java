/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.number.converter.impl;

import com.blt.enterprise.number.converter.convert.NumberToWord;
import com.blt.enterprise.number.converter.exception.WrongValueException;
import static com.blt.enterprise.number.converter.util.StringUtil.NUMBER_UNIT_TEENS_NAMES;

/**
 *
 * @author ekasongo
 */
public class NumberUnitTeenToWord implements NumberToWord{
  
  public String convert(int no){
      if(no < 0 || no >= 20){
          throw new WrongValueException("wrong value inserted. (use value between 0 - 19)");
      }
      return NUMBER_UNIT_TEENS_NAMES[no];
  }
}
