package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int year = 2026;
        int age = 0;

        while (true) {
            System.out.print("введите ваш год рождения: ");
            Scanner in = new Scanner(System.in);
            age = in.nextInt();


            int result = year - age;
            System.out.println("ваш возраст: " + result);

            if (result < 0) {
                System.out.println("вы не можете быть нерожденным");
                continue;
            }

            if(result<18) {
                System.out.println("вы ребенок");
            } else if(result>=18 && result<=65) {
                System.out.println("норм пацан");
            } else {
                System.out.println("пенсия");
            }
            break;
        }
    }
}