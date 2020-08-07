import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task22 {


    public static void main(String[] args) {
        try {
            new Task22().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        BigInteger n = sc.nextBigInteger();
        String bin = Integer.toBinaryString(n.intValue());
        int countOne = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                countOne += 1;
            }
        }
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(countOne);
        pw.close();
    }
}
