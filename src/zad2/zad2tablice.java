package zad2;

import java.util.Random;
import java.util.Scanner;

public class zad2tablice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz zakres min");
        int minNumber = input.nextInt();
        System.out.println("Wpisz zakres max");
        int maxNumber = input.nextInt();
        int diff = maxNumber - minNumber;

        Random random = new Random();
        int randomNumber = random.nextInt(diff + 1);
        randomNumber += minNumber;

        int trysCount = 0;
        int trial;
        do {
            trysCount++;
            System.out.println("Zgadnij liczbę");
            trial = input.nextInt();

            if (trial < randomNumber) {
                System.out.println("Za mało");
            } else if (trial > randomNumber) {
                System.out.println("Za dużo");
            } else {
                System.out.println("Zgadłeś!");
            }
        } while (trial != randomNumber);
        System.out.println("Ilość prób: " + trysCount);
    }
}
