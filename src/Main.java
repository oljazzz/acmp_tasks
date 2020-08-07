import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    PrintWriter pw;

    Scanner sc;


    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        if (n > 0) {
            pw.println(n * (n + 1) / 2);
        } else {
            pw.println((-n + 2) * (n + 1) / 2);
        }
        pw.close();
    }
}
