package com.tns.exceptionalhandling;

public class Stringindexoutofbound {
 public static void main(String[] args) {
     String str="atria college";
     
     try {
             char ch=str.charAt(20);
     }
     catch(StringIndexOutOfBoundsException r) {
             System.out.println(r);
     }
     System.out.println("exception caught");

}
}
