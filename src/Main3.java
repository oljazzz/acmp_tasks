import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {
        new Main3().run();
    }

    PrintWriter pw;

    Scanner sc;

    private void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        if (n >= 15) {
            n = n / 10;
            int b = n + 1;
            n = n * b;
            pw.println(n + "25");
        } else {
            pw.println(n * n);
        }
        pw.close();


    }

}
