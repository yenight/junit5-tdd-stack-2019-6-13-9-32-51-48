package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        String result = "";
        if (student % 3 != 0 && student % 5 != 0 && student % 7 != 0) {
            result += student;
        }
        if (student % 3 == 0) {
            result += "fizz";
        }
        if (student % 5 == 0)  {
            result += "buzz";
        }
        if (student % 7 == 0) {
            result += "whizz";
        }
        return result;
    }
}
