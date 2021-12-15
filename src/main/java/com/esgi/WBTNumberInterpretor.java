package com.esgi;

public class WBTNumberInterpretor {
    static public String generate(int number) {
        String inputStringified = String.valueOf(number);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputStringified.length(); i++) {
            switch (inputStringified.charAt(i)) {
                case '3':
                    sb.append("Wiz");
                    break;
                case '5':
                    sb.append("Bak");
                    break;
                case '7':
                    sb.append("Top");
                    break;
                case '0':
                    sb.append("*");
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }

    static boolean isNumberDivisibleBy3(int input) {
        return input % 3 == 0;
    }

    static boolean isNumberDivisibleBy5(int input) {
        return input % 5 == 0;
    }

    static boolean isNumberDivisibleBy7(int input) {
        return input % 7 == 0;
    }

    static boolean isNumberDivisible(int input) {
        return isNumberDivisibleBy3(input) ||
                isNumberDivisibleBy5(input) ||
                isNumberDivisibleBy7(input);
    }
}
