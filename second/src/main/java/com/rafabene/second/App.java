package com.rafabene.second;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "I'm second" );
        System.out.println(new com.rafabene.first.App().first());
        System.out.print("Using \"first\" internal API: ");
        System.out.println(new com.rafabene.first.internal.Util().utilMethod());    
        try (Scanner  s = new Scanner(System.in)){
            s.nextLine();
        }
    }
}
