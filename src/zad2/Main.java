package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0));
        List<Integer> numbersRandom = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0));
        int min = 1;
        int max = 49;
        int currentNumber, randomNumber, currentActiveNumber = 0, days = 0;
        boolean isExist = false;

        while (numbers.get(5) == 0){
            System.out.print(currentActiveNumber + 1 + " liczba: ");
            currentNumber = scan.nextInt();

            if(currentNumber < min || currentNumber > max){
                System.out.println("Liczba ma być z obszaru 1..49");
                continue;
            }

            for (int n: numbers) {
                if(n == currentNumber){
                    isExist = true;
                    break;
                }
                else
                    isExist = false;
            }

            if(isExist) {
                System.out.println("Taka liczba już istnieje");
            }
            else {
                numbers.set(currentActiveNumber, currentNumber);
                currentActiveNumber += 1;
            }
        }

        currentActiveNumber = 0;
        isExist = false;

        while (numbersRandom.get(5) == 0){
            randomNumber = (int) (Math.random() * (50 - min) + min); // 50 - max

            // Sprawdzamy czy randomowa liczba istnieje w tablice numbers(wprowadzone liczbe przez użytkownika)
            for (int n: numbers) {
                if(n == randomNumber){
                    isExist = true;
                    break;
                }
                else
                    isExist = false;
            }

            if(isExist) {
                isExist = false;

                // Sprawdzamy czy randomowa liczba już jest dodana do tablicy z wygenerowanymi liczbami
                for (int n: numbersRandom) {
                    if(n == randomNumber){
                        isExist = true;
                        break;
                    }
                    else
                        isExist = false;
                }

                if(isExist){
                    days += 1;
                    continue;
                }
                else {
                    numbersRandom.set(currentActiveNumber, randomNumber);
                    currentActiveNumber += 1;
                }
            }
            else {
                days += 1;
            }
        }

        System.out.println("Wylowowałbyś liczbe za " + days / 365 + " lat ta " + days % 365 + " dni :)");

    }
}

