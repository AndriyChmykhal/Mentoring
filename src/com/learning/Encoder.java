package com.learning;

/**
 * Created by Andriy_Chmykhal on 4/20/2017.
 */
public class Encoder {
    public static String compress (String input){
        StringBuilder output = new StringBuilder();
        for (int i=0; i<input.length();i++){
            int runLenght = 1;
            while (i+1<input.length() && input.charAt(i)==input.charAt(i+1)){
                runLenght++;
                i++;
            }
            if (runLenght>1 && runLenght<=9){
                output.append(runLenght);
                output.append(input.charAt(i));
            } else if (runLenght>9){
                int x=runLenght/9;
                for(int j=1;j<=x;j++){
                    output.append("9" + input.charAt(i));
                }
                int y = runLenght - 9*x;
                if (y>0) {
                    output.append("" + y + input.charAt(i));
                }
            } else output.append(input.charAt(i));

        }
        return output.toString();
    }
    public static String decompress (String compString){
        StringBuilder decompString = new StringBuilder();
        if (compString.length()<=1 && Character.isDigit(compString.charAt(0))==false){
            decompString.append(compString);
        } else if (Character.isDigit(compString.charAt(compString.length()-1))==true){
            decompString.append("");
        } else {
            for (int i=0; i<compString.length(); i++){
                if (Character.isDigit(compString.charAt(i))==false){
                    decompString.append(compString.charAt(i));
                } else {
                    int n = Character.getNumericValue(compString.charAt(i));
                    for (int j=1;j<n;j++){
                        decompString.append(compString.charAt(i+1));
                    }
                }
            }
        }
        return decompString.toString();
    }
}