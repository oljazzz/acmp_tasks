import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {

    /*
     * https://acmp.ru/index.asp?main=task&id_task=9
     * */


    public static void main(String[] args) throws IOException {
        new Task9().run();
    }


    private void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        List<BigInteger> numbers = new ArrayList<>();
        ScannerUtil.skipLines(sc, 1);
        String[] nums = sc.nextLine().split(" ");
        BigInteger min = BigInteger.valueOf(9999);
        BigInteger max = BigInteger.valueOf(-9999);

        int minValueIndex = 0;
        int maxValueIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            BigInteger numAsBigInteger = BigInteger.valueOf(Long.parseLong(nums[i]));
            if (numAsBigInteger.compareTo(max) > 0) {
                max = numAsBigInteger;
                maxValueIndex = i;
            }
            if (numAsBigInteger.compareTo(min) < 0) {
                min = numAsBigInteger;
                minValueIndex = i;
            }
            numbers.add(numAsBigInteger);
        }

        List<BigInteger> subNumbers;

        if (maxValueIndex > minValueIndex) {
            subNumbers = numbers.subList(minValueIndex + 1, maxValueIndex);
        } else {
            subNumbers = numbers.subList(maxValueIndex + 1, minValueIndex);
        }

        BigInteger multiPlyResult = subNumbers.stream().reduce(BigInteger.ONE, BigInteger::multiply);

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        BigInteger positiveNumbersSum = numbers.stream().filter(num -> num.compareTo(BigInteger.ZERO) > 0).reduce(BigInteger.ZERO, BigInteger::add);

        pw.println(positiveNumbersSum + " " + multiPlyResult);
        pw.close();

    }


}
