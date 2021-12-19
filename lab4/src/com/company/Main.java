package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int arsize = input.nextInt();
        Integer arr[] = new Integer[arsize];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arsize; i++) {
            arr[i] = input.nextInt();

        }
        System.out.println("Оригинальный массив: " + Arrays.toString(arr));

        System.out.print("Введите число X, элементы равные ему будут удалены из массива: ");
        int delelement = input.nextInt();

        input.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delelement) {
                arr = removeElementUsingCollection(arr, i);
                break;
            }
        }

        System.out.println("Новый массив после удаления элемента: " + delelement);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static Integer[] removeElementUsingCollection(Integer[] arr, int index) {
        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Integer[0]);
    }
}