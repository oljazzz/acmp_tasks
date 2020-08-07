import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        try {
            new Task21().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        String[] salaries = sc.nextLine().split(" ");
        BigInteger min = BigInteger.valueOf(999999999);
        BigInteger max = BigInteger.valueOf(-99999999);
        for (String salary : salaries) {
            BigInteger numAsBigInteger = BigInteger.valueOf(Integer.parseInt(salary));
            if (numAsBigInteger.compareTo(max) > 0) {
                max = numAsBigInteger;
            }
            if (numAsBigInteger.compareTo(min) < 0) {
                min = numAsBigInteger;
            }

        }
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(max.subtract(min));
        pw.close();
    }
}
