/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blt.enterprise.number.converter.exception;

/**
 *
 * @author ekasongo
 */
public class WrongValueException extends RuntimeException{

    public WrongValueException(String message) {
        super(message);
    }    
}
