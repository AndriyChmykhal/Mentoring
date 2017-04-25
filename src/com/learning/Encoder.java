package com.learning;

/**
 * Created by Andriy_Chmykhal on 4/20/2017.
 */
public class Encoder {

    public String input;
    public String compessedString;

    public void setInput(String input) {
        this.input = input;
    }

    public String compress() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int runLenght = 1;
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                runLenght++;
                i++;
            }
            if (runLenght > 1 && runLenght <= 9) {
                output.append(runLenght);
                output.append(input.charAt(i));
            } else if (runLenght > 9) {
                int x = runLenght / 9;
                for (int j = 1; j <= x; j++) {
                    output.append("9" + input.charAt(i));
                }
                int y = runLenght - 9 * x;
                if (y > 0) {
                    output.append("" + y + input.charAt(i));
                }
            } else output.append(input.charAt(i));

        }
        this.compessedString = output.toString();
        return output.toString();
    }

    public String decompress() {
        StringBuilder decompString = new StringBuilder();
        if (compessedString.length() <= 1 && Character.isDigit(compessedString.charAt(0)) == false) {
            decompString.append(compessedString);
        } else if (Character.isDigit(compessedString.charAt(compessedString.length() - 1)) == true) {
            decompString.append("");
        } else {
            for (int i = 0; i < compessedString.length(); i++) {
                if (Character.isDigit(compessedString.charAt(i)) == false) {
                    decompString.append(compessedString.charAt(i));
                } else {
                    int n = Character.getNumericValue(compessedString.charAt(i));
                    for (int j = 1; j < n; j++) {
                        decompString.append(compessedString.charAt(i + 1));
                    }
                }
            }
        }
        return decompString.toString();
    }
}