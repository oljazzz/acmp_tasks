import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task15 {


    public static void main(String[] args) {
        try {
            new Task15().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        int i, j, b, z = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                b = sc.nextInt();
                z += b;
            }
        }
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(z / 2);
        pw.close();

    }
}
