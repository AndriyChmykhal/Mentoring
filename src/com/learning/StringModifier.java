package com.learning;
/**
 * Created by Andriy_Chmykhal on 4/20/2017.
 */
public class StringModifier {
    public static void main (String[] args){

        Encoder encoder = new Encoder();

        encoder.setInput("Helllooooo");
        String result =  encoder.compress();

        String decomp = encoder.decompress();

        System.out.println(result);
        System.out.println(decomp);
    }
}
