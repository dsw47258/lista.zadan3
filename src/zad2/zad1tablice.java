package zad2;

import java.util.Random;
import java.util.Scanner;

public class zad1tablice {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz zakres min");
        int minNumber = input.nextInt();
        System.out.println("Wpisz zakres max");
        int maxNumber = input.nextInt();
        int diff = maxNumber - minNumber;

        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += minNumber;

        System.out.println("Wylosowana liczba: " + i);
    }
}
