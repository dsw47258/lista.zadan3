package zad2;

import java.io.FileReader;
import java.util.*;

public class zad2kolekcje {
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("NEXT.txt");
        Scanner scan = new Scanner(fr);
        ArrayList<String> lines = new ArrayList<>();
        HashMap<String, String> repeatLines = new HashMap<>();
        ArrayList<String> secondLines = new ArrayList<>();
        char i = 1;

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            i++;
            if (!lines.contains(line)){
                lines.add(line);
            }
            else {
                repeatLines.put(line,line);
            }
        }
        Collection<String> values = repeatLines.values();
        System.out.println(values);

    }
}