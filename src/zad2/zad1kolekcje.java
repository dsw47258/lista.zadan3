package zad2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zad1kolekcje {
    public static void main(String[] args) {

        int minNumber = 6;
        int maxNumber = 49;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();
        System.out.println("Podaj 6 randomowych liczb z zakresu od 1 do 49, liczby nie mogą się powtarzać");

        for (int i = 0; i < minNumber; i++) {
            int randomUserNumber = input.nextInt();
            if (randomUserNumber > maxNumber || randomUserNumber <= 0) {
                System.out.println("Liczba poza zakresem!Podaj inną.");
                i--;
            } else if (!userNumbers.contains(randomUserNumber)) {
                userNumbers.add(randomUserNumber);
            } else {
                System.out.println("Podano taką samą liczbę!Podaj inną.");
                i--;
            }
        }

        System.out.println(userNumbers);
        int days = 0;
        Random random = new Random();
        ArrayList<Integer> computerNumbers = new ArrayList<>();
        int trial;

        for (int i = 0; i < minNumber; i++) {
            trial = random.nextInt(maxNumber) + 1;
            if (computerNumbers.contains(trial) || !userNumbers.contains(trial)) {
                i--;
            } else  {
                computerNumbers.add(trial);
            }

            days++;
        }
        System.out.println("Total time for " + (days / 365) + " years " + (days % 365) + " days");
        System.out.println(computerNumbers + "and " + userNumbers);

    }
}
