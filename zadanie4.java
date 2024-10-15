package ru.mirea.lab1;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите число: ");
            numbers[i] = sc.nextInt();
        }
        int summa = 0, min = numbers[0], max = numbers[0];
        int i = 0;
        do {
            summa += numbers[i];
            if (numbers [i] < min) min = numbers[i];
            if (numbers [i] > max) max = numbers[i];
            i++;
        } while (i < n);
        System.out.println("Сумма равна: " + summa + "\n");
        System.out.println("Минимальное число равно: " + min + "\n");
        System.out.println("Максимальное число равно: " + max + "\n");
    }
}