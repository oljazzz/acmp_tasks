import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) throws IOException {
        new Task5().run();
    }

    PrintWriter pw;

    Scanner sc;


    private void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int firstNumber = sc.nextInt();
        int[] b = new int[firstNumber];
        int[] c = new int[firstNumber];

        int fours = 0;
        int threes = 0;
        pw = new PrintWriter(new File("output.txt"));
        for (int i = 0; sc.hasNext(); i++) {
            int j = sc.nextInt();
            if (j % 2 == 1) {
                b[i] = j;
                threes++;
            } else {
                c[i] = j;
                fours++;
            }
        }
        for (int value : b) {
            if (value != 0) {
                pw.print(value + " ");

            }
        }
        pw.println();
        for (int value : c) {
            if (value != 0) {
                pw.print(value + " ");
            }
        }
        pw.println();
        if (fours >= threes) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }


        pw.close();


    }
}
