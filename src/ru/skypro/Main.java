package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1. Объявление массива для целочисленных значений
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        // Задача 2. Расспечатать массивы через запятую, но без запятой между массивами
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.print(integer[i]);
            } else {
                System.out.print(integer[i] + ", ");
            }
        }
        System.out.println();
        // Задача 3. Распечатка элементов массива в обратном порядке
        for (int i = integer.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integer[i]);
            } else {
                System.out.print(integer[i] + ", ");
            }
        }
        // Задача 4. Делаем в целочисленном массиве нечетные значения четными
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i]++;
            }
            if (i == integer.length - 1) {
                System.out.print(integer[i]);
            } else {
                System.out.print(integer[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        // Задача 1. Объявление массива для значений с плавающей точкой
        float[] floatPoint = {1.57f, 7.654f, 9.986f};
        // Задача 2. Расспечатать массивы через запятую, но без запятой между массивами
        for (int f = 0; f < floatPoint.length; f++) {
            if (f == floatPoint.length - 1) {
                System.out.print(floatPoint[f]);
            } else {
                System.out.print(floatPoint[f] + ", ");
            }
        }
        System.out.println();
        // Задача 3. Распечатка элементов массива в обратном порядке
        for (int f = floatPoint.length - 1; f >= 0; f--) {
            if (f == 0) {
                System.out.print(floatPoint[f]);
            } else {
                System.out.print(floatPoint[f] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        // Задача 1. Объявление массива для типа переменной byte
        byte[] any = {5, 8, 10, 3, 18};
        // Задача 2. Расспечатать массивы через запятую, но без запятой между массивами
        for (int i = 0; i < any.length; i++) {
            if (i == any.length - 1) {
                System.out.print(any[i]);
            } else {
                System.out.print(any[i] + ", ");
            }
        }
        System.out.println();
        // Задача 3. Распечатка элементов массива в обратном порядке
        for (int i = any.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(any[i]);
            } else {
                System.out.print(any[i] + ", ");
            }
        }
        System.out.println();
        // Задача 4. Делаем в целочисленном массиве нечетные значения четными
        for (int i = 0; i < any.length; i++) {
            if (any[i] % 2 != 0) {
                any[i]++;
            }
            if (i == any.length - 1) {
                System.out.print(any[i]);
            } else {
                System.out.print(any[i] + ", ");
            }
        }
    }
}
