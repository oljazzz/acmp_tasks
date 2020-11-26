import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task754 {


    public static void main(String[] args) {
        try {
            new Task754().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() throws Exception {
        Scanner sc = new Scanner(new File("input.txt"));
        String[] warriorsWeights = sc.nextLine().split(" ");
        long maximumAllowedNumber = 999999999;
        long minimumAllowedNumber = -99999999;
        BigInteger min = BigInteger.valueOf(maximumAllowedNumber);
        BigInteger max = BigInteger.valueOf(minimumAllowedNumber);
        for (String weight : warriorsWeights) {
            BigInteger weightAsBigInteger = BigInteger.valueOf(Integer.parseInt(weight));
            if (weightAsBigInteger.compareTo(max) > 0) {
                max = weightAsBigInteger;
            }
            if (weightAsBigInteger.compareTo(min) < 0) {
                min = weightAsBigInteger;
            }
        }

        int minimumFatWeight = 94;
        int maximumFatWeight = 727;
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        if (max.intValue() > maximumFatWeight || min.intValue() < minimumFatWeight) {
            pw.println("Error");
        } else {
            pw.println(max);
        }

        pw.close();
    }
}
