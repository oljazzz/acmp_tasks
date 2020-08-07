import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        try{
            new Task25().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        BigInteger n = sc.nextBigInteger();
        
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.close();
    }
}
