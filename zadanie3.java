package ru.mirea.lab1;

public class zadanie3 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa = 0;
        for (int num : numbers) {
            summa += num;
        }
        System.out.print("Сумма равна: " + summa + "\n");
        double srednee = summa / numbers.length;
        System.out.print("Среднее значение равно: " + srednee);
    }
}