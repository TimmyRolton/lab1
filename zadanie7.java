package ru.mirea.lab1;

public class zadanie7 {
    public static void main(String[] args) {
        int n = 3;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + n + " = " + factorial);
    }
}