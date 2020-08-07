import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        try {
            new Task14().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = a * b / gcd(a, b);
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(result);
        pw.close();

    }

    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
