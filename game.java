package testgame;

import java.util.Random;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
    System.out.println(" Угадайте число от 1 до 100");
    int count = 0;
    int y;
    int result = 0;
    Random rand = new Random();
    int x = rand.nextInt(101);
        do {
            Scanner input = new Scanner(System.in);
            y = input.nextInt();
            count += 1;
            if(x > y) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            }
            else if (x < y) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            }
            else if (x == y) {
                System.out.println("Загаданное число: " + x);
                System.out.println("Колличество попыток: " + count);
                break;
            }
        }while (true);

        if(count > result) {
            result = count;
            System.out.println("Лучшее кол-во попыток: " + result);
        } else {
            System.out.println("Лучшее кол-во попыток: " + result);
        }
    }
}
