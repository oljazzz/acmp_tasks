import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Task13 {

    public static void main(String[] args) {
        try {
            new Task13().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void run() throws IOException {
        AtomicInteger countA = new AtomicInteger();
        AtomicInteger countB = new AtomicInteger();
        Scanner sc = new Scanner(new File("input.txt"));
        ArrayList<Integer> array1 = getIntArrayFromNumber(sc.nextInt());
        ArrayList<Integer> array2 = getIntArrayFromNumber(sc.nextInt());

        array1.forEach(i -> {
            array2.forEach(j -> {
                if (i.equals(j) && array1.indexOf(i) == array2.indexOf(j)) {
                    countA.addAndGet(1);
                } else if (i.equals(j)) {
                    countB.addAndGet(1);
                }
            });
        });

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(countA + " " + countB);
        pw.close();
    }

    private ArrayList<Integer> getIntArrayFromNumber(int number) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int temp = number;
        int cipherCountInNumber = 4;
        for (int i = cipherCountInNumber - 1; i >= 0; i--) {
            while (temp > 0) {
                numbers.add(0, temp % 10);
                temp = temp / 10;
            }
        }
        return numbers;
    }


}
