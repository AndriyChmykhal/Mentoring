package com.learning;
/**
 * Created by Andriy_Chmykhal on 4/20/2017.
 */
public class StringModifier {
    public static void main (String[] args){

        String comp = Encoder.compress("Hellllllllllo");
        String decomp = Encoder.decompress("H9e4e5lo");

        System.out.println(comp);
        System.out.println(decomp);
    }
}
