package zad2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zad3kolekcje {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader readFile = new FileReader("NEXT.txt");
        Scanner scan = new Scanner(readFile);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> resultLines = new ArrayList<>();

        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        for (String line : lines) {
            if (line.equals(transferredAndResult(line))) {
                resultLines.add(line);
            }
        }
        System.out.println("Napisy roznące: " + resultLines);
    }

    private static String transferredAndResult(String line) {
        char[] charArray = line.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}