package com.rafabene.first.internal;
/**
 * Util
 */
public class Util {

    public String utilMethod(){
        return "utilMethod() called from " + this.getClass().getModule().getName();
    }
    
}