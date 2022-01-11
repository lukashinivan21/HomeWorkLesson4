package com.company;

public class Main {

    public static void main(String[] args) {
        //solution1

        int[] simpleNumbers = new int[3];
        simpleNumbers[0] = 1;
        simpleNumbers[1] = 2;
        simpleNumbers[2] = 3;

        float[] numbers = {1.57f, 7.654f, 9.986f};

        char[] chars = {'D', 'F', 'E', 'K', 'O', 'T', 'N'};

        //solution2

        for (int i = 0; i < simpleNumbers.length; i++) {
            if (i == simpleNumbers.length - 1) {
                System.out.println(simpleNumbers[i] + ".");
            } else {
                System.out.print(simpleNumbers[i] + ", ");
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i] + ".");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.println(chars[i] + ".");
            } else {
                System.out.print(chars[i] + ", ");
            }
        }

        //solution3

        for (int i = simpleNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(simpleNumbers[i] + ".");
            } else {
                System.out.print(simpleNumbers[i] + ", ");
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i] + ".");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(chars[i] + ".");
            } else {
                System.out.print(chars[i] + ", ");
            }
        }

        //solution4

        for (int i = 0; i < simpleNumbers.length; i++) {
            if (simpleNumbers[i] % 2 != 0) {
                simpleNumbers[i] += 1;
            }
            if (i == simpleNumbers.length - 1) {
                System.out.println(simpleNumbers[i] + ".");
            } else {
                System.out.print(simpleNumbers[i] + ", ");
            }
        }

    }
}
