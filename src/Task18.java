import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        try {
            new Task18().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        BigInteger n = sc.nextBigInteger();
        BigInteger factorial = factorialIter(BigInteger.ONE, BigInteger.ONE, n);
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(factorial);
        pw.close();
    }


    private BigInteger factorialIter(BigInteger product, BigInteger count, BigInteger maxCount) {
        if (count.compareTo(maxCount) > 0) {
            return product;
        }
        return factorialIter(product.multiply(count), count.add(BigInteger.ONE), maxCount);
    }


}
