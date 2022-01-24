package zad2;

import java.util.Scanner;

public class zad4tablica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int[] numbersRandom = new int[6];
        int minNumber = 1;
        int maxNumber = 49;
        int currentNumber, randomNumber, currentActiveNumber = 0, days = 0;
        boolean isExist = false;

        while (numbers[5] == 0) {
            System.out.print(currentActiveNumber + 1 + " liczba: ");
            currentNumber = input.nextInt();

            if (currentNumber < minNumber || currentNumber > maxNumber) {
                System.out.println("Liczba ma być z obszaru 1..49");
                continue;
            }

            for (int n : numbers) {
                if (n == currentNumber) {
                    isExist = true;
                    break;
                } else
                    isExist = false;
            }

            if (isExist) {
                System.out.println("Taka liczba już istnieje");
            } else {
                numbers[currentActiveNumber] = currentNumber;
                currentActiveNumber += 1;
            }
        }

        currentActiveNumber = 0;
        isExist = false;

        while (numbersRandom[5] == 0) {
            randomNumber = (int) (Math.random() * (50 - minNumber) + minNumber); // 50 - max

            // Sprawdzamy czy randomowa liczba istnieje w tablice numbers(wprowadzone liczbe przez użytkownika)
            for (int n : numbers) {
                if (n == randomNumber) {
                    isExist = true;
                    break;
                } else
                    isExist = false;
            }

            if (isExist) {
                isExist = false;

                // Sprawdzamy czy randomowa liczba już jest dodana do tablicy z wygenerowanymi liczbami
                for (int n : numbersRandom) {
                    if (n == randomNumber) {
                        isExist = true;
                        break;
                    } else
                        isExist = false;
                }

                if (isExist) {
                    days += 1;
                    continue;
                } else {
                    numbersRandom[currentActiveNumber] = randomNumber;
                    currentActiveNumber += 1;
                }
            } else {
                days += 1;
            }
        }

        System.out.println("Wylowowałbyś liczbe za " + days / 365 + " lat ta " + days % 365 + " dni :)");

    }
}

