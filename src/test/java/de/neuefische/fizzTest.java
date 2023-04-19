package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzTest {


    @Test
    void shouldReturn_4_ifValueIs4(){
        //GIVEN
        int i = 4;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("4", actual);
    }

    @Test
    void shouldReturn_fizz_ifValueIs3(){
        //GIVEN
        int i = 3;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("fizz", actual);
    }

    @Test
    void shouldReturn_buzz_ifValueIs5(){
        //GIVEN
        int i = 5;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("buzz", actual);
    }

    @Test
    void shouldReturn_fizzbuzz_ifValueIs15(){
        //GIVEN
        int i = 15;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("fizzbuzz", actual);
    }

    @Test
    void shouldReturn_fizzbuzz_ifValueIs0(){
        //GIVEN
        int i = 0;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("fizzbuzz", actual);
    }

    @Test
    void shouldReturn_Minus1_ifValueIsNegative(){
        //GIVEN
        int i = -1;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("-1", actual);
    }

    @Test
    void shouldReturn_fizzbuzz_ifValueIsMinus15(){
        //GIVEN
        int i = -15;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("fizzbuzz", actual);
    }

    @Test
    void shouldReturn_fizz_ifValueIsMinus3(){
        //GIVEN
        int i = -3;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("fizz", actual);
    }

    @Test
    void shouldReturn_buzz_ifValueIsMinus5(){
        //GIVEN
        int i = -5;
        //WHEN
        String actual = Main.fizzbuzz(i);
        //THEN
        assertEquals("buzz", actual);
    }

}
