import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task23 {


    public static void main(String[] args) {
        try {
            new Task23().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += n / i;
            }
        }
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(result);
        pw.close();
    }
}
