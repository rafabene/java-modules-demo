package com.rafabene.second;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        new App().second();
    }

    public void second() {
        System.out.println("I'm second");
        System.out.println(new com.rafabene.first.App().first());
        System.out.println("Using \"first\" internal API:" +  new com.rafabene.first.internal.Util().utilMethod());
    }

}
