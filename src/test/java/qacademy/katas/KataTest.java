package qacademy.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(123) 456-7890", Kata.createPhoneNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testNumberMaxMin() {
        assertEquals("42 -9", Kata.maxMinString("8 3 -5 42  -1 0 0 -9 4 7 4 -4"));


    }

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", Kata.camelCase("test case"));
        assertEquals("CamelCaseMethod", Kata.camelCase("camel case method"));
        assertEquals("CamelCaseWord", Kata.camelCase(" camel case word"));
        assertEquals("SayHello", Kata.camelCase("say hello "));
        assertEquals("AbC", Kata.camelCase("ab  c"));
        assertEquals("Z", Kata.camelCase("z"));
        assertEquals("", Kata.camelCase(""));
        assertEquals("", Kata.camelCase(" "));
    }


    @Test
    public void test() {
        assertEquals(23, Kata.multiplos3y5(10));
    }

    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }
}
