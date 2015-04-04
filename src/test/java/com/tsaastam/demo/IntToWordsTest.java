package com.tsaastam.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntToWordsTest {

    @Test
    public void testZeroToHundred() {
        assertEquals("zero", IntToWords.intToWords(0));
        assertEquals("one", IntToWords.intToWords(1));
        assertEquals("two", IntToWords.intToWords(2));
        assertEquals("three", IntToWords.intToWords(3));
        assertEquals("four", IntToWords.intToWords(4));
        assertEquals("five", IntToWords.intToWords(5));
        assertEquals("six", IntToWords.intToWords(6));
        assertEquals("seven", IntToWords.intToWords(7));
        assertEquals("eight", IntToWords.intToWords(8));
        assertEquals("nine", IntToWords.intToWords(9));
        assertEquals("ten", IntToWords.intToWords(10));
        assertEquals("eleven", IntToWords.intToWords(11));
        assertEquals("twelve", IntToWords.intToWords(12));
        assertEquals("thirteen", IntToWords.intToWords(13));
        assertEquals("fourteen", IntToWords.intToWords(14));
        assertEquals("fifteen", IntToWords.intToWords(15));
        assertEquals("sixteen", IntToWords.intToWords(16));
        assertEquals("seventeen", IntToWords.intToWords(17));
        assertEquals("eighteen", IntToWords.intToWords(18));
        assertEquals("nineteen", IntToWords.intToWords(19));
        assertEquals("twenty", IntToWords.intToWords(20));

        assertEquals("twenty one", IntToWords.intToWords(21));
        assertEquals("twenty five", IntToWords.intToWords(25));
        assertEquals("thirty", IntToWords.intToWords(30));
        assertEquals("thirty three", IntToWords.intToWords(33));
        assertEquals("forty two", IntToWords.intToWords(42));
        assertEquals("fifty eight", IntToWords.intToWords(58));
        assertEquals("sixty four", IntToWords.intToWords(64));
        assertEquals("seventy", IntToWords.intToWords(70));
        assertEquals("seventy seven", IntToWords.intToWords(77));
        assertEquals("eighty one", IntToWords.intToWords(81));
        assertEquals("ninety nine", IntToWords.intToWords(99));
    }

    @Test
    public void testHundredToThousand() {
        assertEquals("one hundred", IntToWords.intToWords(100));
        assertEquals("one hundred and four", IntToWords.intToWords(104));
        assertEquals("one hundred and five", IntToWords.intToWords(105));
        assertEquals("one hundred and thirty five", IntToWords.intToWords(135));
        assertEquals("six hundred and fifty eight", IntToWords.intToWords(658));
        assertEquals("eight hundred", IntToWords.intToWords(800));
        assertEquals("eight hundred and eight", IntToWords.intToWords(808));
        assertEquals("eight hundred and eighty", IntToWords.intToWords(880));
        assertEquals("eight hundred and eighty eight", IntToWords.intToWords(888));
    }

    @Test
    public void testThousandToMillion() {
        assertEquals("one thousand", IntToWords.intToWords(1000));
        assertEquals("nine thousand", IntToWords.intToWords(9000));
        assertEquals("nine thousand two", IntToWords.intToWords(9002));
        assertEquals("nine thousand forty", IntToWords.intToWords(9040));
        assertEquals("nine thousand forty one", IntToWords.intToWords(9041));
        assertEquals("nine thousand six hundred", IntToWords.intToWords(9600));
        assertEquals("nine thousand six hundred and three", IntToWords.intToWords(9603));
        assertEquals("nine thousand six hundred and ninety", IntToWords.intToWords(9690));
        assertEquals("nine thousand six hundred and ninety six", IntToWords.intToWords(9696));
        assertEquals("thirty thousand fifty eight", IntToWords.intToWords(30058));
        assertEquals("seven hundred thousand one", IntToWords.intToWords(700001));
        assertEquals("eight hundred and fifty seven thousand one hundred and twelve", IntToWords.intToWords(857112));
        assertEquals("nine hundred and ninety seven thousand nine", IntToWords.intToWords(997009));
    }

    @Test
    public void testMillionToBillion() {
        assertEquals("one million", IntToWords.intToWords(1000000));
        assertEquals("four million", IntToWords.intToWords(4000000));
        assertEquals("eleven million", IntToWords.intToWords(11000000));
        assertEquals("twenty two million six hundred and fifty eight thousand eight hundred and thirteen", IntToWords.intToWords(22658813));
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", IntToWords.intToWords(56945781));
        assertEquals("seven hundred and seventy seven million five hundred and ninety eight thousand eight hundred and fourteen", IntToWords.intToWords(777598814));
    }

    @Test
    public void testLimits() {
        assertEquals("zero", IntToWords.intToWords(IntToWords.MIN));
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", IntToWords.intToWords(IntToWords.MAX));
    }

    @Test(expected=IllegalArgumentException.class) 
    public void testIllegalValueTooSmall() {
        IntToWords.intToWords(IntToWords.MIN - 1);
    }

    @Test(expected=IllegalArgumentException.class) 
    public void testIllegalValueTooLarge() {
        IntToWords.intToWords(IntToWords.MAX + 1);
    }

}
