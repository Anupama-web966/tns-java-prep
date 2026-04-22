package com.tns.exceptionalhandling;

public class Nullpointerexception {
    public static void main(String[] args) {
		String str=null;//given as null so u wont get the output tht is an exception here
		try {
            System.out.println(str.length());
    }
    catch(Exception f) {
            System.out.println(f.getMessage());
    }
    }
}
