package zad2;

import java.util.ArrayList;
import java.util.Random;

public class zad3tablice {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numberGenerated = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(48);
            if (!numberGenerated.contains(randomNumber)) {
                numberGenerated.add(randomNumber);
            } else {
                i--;
            }
        }
        System.out.println(numberGenerated);
    }
}
