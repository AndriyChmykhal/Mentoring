package com.learning;

public class StringCompression {
    public static void main(String[] args) {
        String inputString = "Heeeeeeeeeeeeeeeeeeeeeeeeeeeellllloooo";
        int repeatCount = 1;
        char lastChar = inputString.charAt(0);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == lastChar) {
                repeatCount++;
            } else {
                if (repeatCount > 1 && repeatCount <= 9) {
                    result.append("" + repeatCount + lastChar);
                } else if (repeatCount > 9) {
                    int x = repeatCount / 9;
                    for (int j = 1; j <= x; j++) {
                        result.append("9" + lastChar);
                    }
                    int y = repeatCount - 9 * x;
                    if (y > 0) {
                        result.append("" + y + lastChar);
                    }
                } else {
                    result.append(lastChar);
                }
                repeatCount = 1;
                lastChar = inputString.charAt(i);
            }
        }
        if (repeatCount > 1 && repeatCount <= 9) {
            result.append("" + repeatCount + lastChar);
        } else if (repeatCount > 9) {
            int x = repeatCount / 9;
            for (int j = 1; j <= x; j++) {
                result.append("9" + lastChar);
            }
            int y = repeatCount - 9 * x;
            if (y > 0) {
                result.append("" + y + lastChar);
            }
        } else {
            result.append(lastChar);
        }

        System.out.println(result.toString());
    }
}
