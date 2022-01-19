package zad2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class zad3kolekcje {
    public static void main (String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("NEXT.txt");
        Scanner scan = new Scanner(fr);
        ArrayList<String> lines = new ArrayList<>();

        boolean correct = false;
        int i = 1;
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
            i++;
        }

            for (String line: lines){
                char [] charLines = line.toCharArray();
                int first = 0;
                int second = 0;

                for (char symbol:charLines){
                    second = first;
                    first = symbol;

                    if(second > first){
                        correct = false;
                        break;
                    }
                    else
                        correct = true;
                }

                if(correct) {
                    System.out.println(line);
                }
                else
                    continue;
            }
        }

    }
