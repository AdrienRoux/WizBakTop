package com.esgi;

public class App 
{
    public static void main( String[] args ) throws Exception {
        WizBakTop w = WizBackTopArgumentsContructor.from(args);
        System.out.println(w.execute());
    }
}
