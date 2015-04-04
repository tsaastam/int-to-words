package com.tsaastam.demo;

public class IntToWords {

    public static final int MIN = 0;
    public static final int MAX = 999_999_999;

    private static final String[] smalls = new String[] {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
    };

    private static final String[] tens = new String[] {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final int[] limits = new int[] {
        100, 1000, 1_000_000
    };

    private static final String[] limitStrings = new String[] {
        "hundred", "thousand", "million"
    };

    /**
     * @param i an int such that i >= MIN and i <= MAX.
     * @return natural-language pronunciation of i.
     * @throws IllegalArgumentException for i outside the range.
     */
    public static final String intToWords(int i) {
        if(i < MIN || i > MAX) {
            throw new IllegalArgumentException(String.format("Supported range is %s to %s (inclusive) - got %s", MIN, MAX, i));
        }
        if(i <= 20) {
            return smalls[i];
        } else if(i < 100) {
            final String xty = tens[i/10];
            final String rest = i%10 == 0 ? "" : " " + intToWords(i%10);
            return xty + rest;
        } else {
            int limitI = -12;
            for(int k = limits.length-1; k >= 0; k--) {
                if(i >= limits[k]) {
                    limitI = k;
                    break;
                }
            }
            final int limit = limits[limitI];
            final String limitString = limitStrings[limitI];
            final int main = i / limit;
            final int remainder = i % limit;
            final String mainString = intToWords(main) + " " + limitString;
            final String and = limit < 1000 ? " and " : " ";
            final String remainderString = remainder == 0 ? "" : and + intToWords(remainder);
//            System.out.println(""+i+" -> " + mainString + remainderString);
            return mainString + remainderString;
        }
    }

}
