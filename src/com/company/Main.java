package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //task1, task2
        int[] array = generateArray();
        int sum = 0;
        int min = array[0], max = array[0];
        for (int index = 0; index <array.length; index++) {
            sum += array[index];
            if (array[index] < min) {
                min = array[index];
            }
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("Сумма выплат за месяц составила: " + sum + "\n");
        System.out.println("Минимальная сумма трат за день: " + min +
                "\nМаксимальная сумма трат за день: " + max);
        //task3
        System.out.println("Средняя сумма трат за месяц составила: " + (double)(sum/30.0) + "\n");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
