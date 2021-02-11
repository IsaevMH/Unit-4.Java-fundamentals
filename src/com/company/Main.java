package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Task1
    public static void displayWelcomUser(){
        Scanner in = new Scanner(System.in);
        String name =  null;
        System.out.print("Введите имя пользователя: ");
        name = in.nextLine();
        System.out.printf("Привет, %s!\n", name);
    }

    //Task2
    public static String inputArguments() {
        Scanner in = new Scanner(System.in);
        String arguments;
        System.out.print("Введите любое количество аргументов: ");
        arguments = in.nextLine();
        return arguments;
    }
    public static void reverseAndShowArgs(String inputString){
        StringBuilder stringBuilder = new StringBuilder(inputString);
        System.out.println(stringBuilder.reverse().toString());
    }

    //Task3
    public static int[] generateRandomArguments(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во аргументов: ");
        int countArgument = in.nextInt();

        int[] arrayRandomArguments = new int[countArgument];
        for(int i = 0; i < countArgument; i++) {
            arrayRandomArguments[i] = random.nextInt(10);
        }
        return arrayRandomArguments;
    }
    public static void displayRandomArguments(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        for (int element : arr) {
            System.out.println(element);
        }
    }

    //Task4
    public static int[] inputDigits(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во аргументов: ");
        int countArgument = in.nextInt();
        int[] array = new int[countArgument];
        for(int i = 0; i < array.length;i++) {
            System.out.print("\nВведите целое число: ");
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void dispayResultMathOperations(int[] arr) {
        int sumRes = 0;
        int mulRes = 1;
        for (int i = 0; i < arr.length; i++)
            sumRes += arr[i];
        for (int i = 0; i < arr.length; i++)
            mulRes *= arr[i];
        System.out.printf("Результат сложения: %d\n", sumRes);
        System.out.printf("Результат умножения: %d\n", mulRes);
    }

    //Task5
    enum Month{
        None,
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }
    public static int inputNumberOfMonth(){
        Scanner in = new Scanner(System.in);
        int countArgument = 0;
        do{
            System.out.print("Введите номер месяца (от 1 до 12): ");
            countArgument = in.nextInt();
        }while(countArgument < 0 && countArgument > 12);
        return countArgument;
    }

    public static void main(String[] args) {
        //Task1
        displayWelcomUser();

        //Task2
        String inputString = inputArguments();
        reverseAndShowArgs(inputString);

        //Task3
        int[] randomArr = generateRandomArguments();
        displayRandomArguments(randomArr);

        //Task4
        int[] array = inputDigits();
        dispayResultMathOperations(array);

        //Task5
        int numberOfMonth = inputNumberOfMonth();
        Month[] monthes = Month.values();
        Month month = monthes[numberOfMonth];
        System.out.println(month);

    }
}
