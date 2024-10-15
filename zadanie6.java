package ru.mirea.lab1;

public class zadanie6 {
    public static void main(String[] args) {
        int n = 10;
        double harmonicSum = 0.0;
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= n; i++) {
            harmonicSum = 1.0 / i;
            System.out.printf("%f ", harmonicSum);
        }
    }
}