package com.rafabene.first;

import com.rafabene.first.internal.Util;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new App().first());
    }

    public String first(){
        return "I'm first - " + new Util().utilMethod();
    }
}
