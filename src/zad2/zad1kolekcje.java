package zad2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class zad1kolekcje {
    public static void main (String[]args){

                Scanner input = new Scanner(System.in);
                ArrayList<Integer> userNumbers = new ArrayList<>();
                System.out.println("Podaj 6 randomowych liczb z zakresu od 0 do 49, liczby nie mogą się powtarzać");

                for(int i = 0; i < 6; i++){
                    int randomUserNumber = input.nextInt();
                    if(randomUserNumber > 49){
                        System.out.println("Liczba poza zakresem!Podaj inną.");
                        i--;
                    }else {
                        if (!userNumbers.contains(randomUserNumber)) {
                            userNumbers.add(randomUserNumber);
                        } else {
                            System.out.println("Podano taką samą liczbę!Podaj inną.");
                            i--;
                        }
                    }
                }
                System.out.println(userNumbers);
                int days =0;
                Random random = new Random();
                ArrayList<Integer> computerNumbers = new ArrayList<>();
                int trial;

                    for (int i = 0;i < 6; i++ ) {
                        trial = random.nextInt(49);
                        if (computerNumbers.contains(trial)) {
                            i--;
                            days ++;
                        }else if(userNumbers.contains(trial)){
                        computerNumbers.add(trial);
                         days++;
                        } else {
                            i--;
                            days ++;
                        }
                    }
                System.out.println("Total time for " + (days/365) + " years " +(days%365)+ " days");
                    System.out.println(computerNumbers + "and " + userNumbers);

            }
        }
