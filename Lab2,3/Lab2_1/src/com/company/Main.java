package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /**
     * В этом методе вводится метод ввода данных из файла или с консоли
     * @param args не используется
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("введите 1 для режима работы ввода параметров задач" +
                " с клавиатуры или 2 для ввода параметров с файла");
        Scanner scanner = new Scanner(System.in);
        int workingMode = scanner.nextInt();
        if (workingMode == 1 || workingMode == 2) {
            Tasks tasks = new Tasks();
            tasks.task1(workingMode);
            tasks.task2(workingMode);
            tasks.task3(workingMode);
            tasks.task4(workingMode);
            tasks.task5(workingMode);
            tasks.task6(workingMode);
            tasks.task7(workingMode);
            tasks.task8(workingMode);

        }
        else {
            System.out.println("Нет такого режима работы программы");
        }
    }
}