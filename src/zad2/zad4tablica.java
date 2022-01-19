package zad2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zad4tablica {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] userNumbers = new int [6];
        System.out.println("Podaj 6 randomowych liczb z zakresu od 0 do 49, liczby nie mogą się powtarzać");

        for(int i = 0; i < 6; i++){
            int randomUserNumber = input.nextInt();
            if(randomUserNumber > 50 && randomUserNumber <=0 ){
                System.out.println("Liczba poza zakresem!Podaj inną.");
                i--;
            }else {
                if (!userNumbers.equals(randomUserNumber)) {
                    userNumbers.equals(randomUserNumber);
                } else {
                    System.out.println("Podano taką samą liczbę!Podaj inną.");
                    i--;
                }
            }
        }
int days =0;
        Random random = new Random();
       int [] computerNumbers = new int[6];
        int trial;
            for (int i = 0;i < 6; i++ ) {
                trial = random.nextInt(49)+1;
                if (computerNumbers.equals(trial)) {
                    i--;
                    days ++;

                } else if (userNumbers.equals(trial)){
                    computerNumbers.equals(trial);
                } else {
                    i--;
                    days ++;
                }
            }
        System.out.println("Total time for removing from ArrayList:" + days + "days");

    }
}
