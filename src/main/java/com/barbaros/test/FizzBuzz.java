package com.barbaros.test;

/**
 * Created by Bar-Mel on 1.09.2016.
 */
public class FizzBuzz {

    public String divisible(int number) {
        if (number % 15 == 0) return "fizzbuzz";
        if (number % 3 == 0) return "fizz";
        if (number % 5 == 0) return "buzz";

        else  return "input must be 3 or 5";
    }
}
