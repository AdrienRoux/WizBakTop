package com.esgi;

public class WizBackTopArgumentsContructor {
    static public WizBakTop from(String[] args) throws Exception {
        switch (args.length) {
            case 0:
                throw new Exception("Specify a value.");
            case 1:
                return WizBakTop.from(args[0]);
            default:
                throw new Exception("Too many arguments.");
        }
    }
}
