package de.neuefische;

public class Main {


    public static String fizzbuzz(int num) {
        if (num % 15 == 0) {
            return "fizzbuzz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else if (num % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(num);
    }
}