import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) throws IOException {
        new Task7().run();
    }

    PrintWriter pw;

    Scanner sc;

    private void run() throws IOException {


        sc = new Scanner(new File("input.txt"));

        List<BigInteger> numbers = new ArrayList<>();


        while (sc.hasNextBigInteger()) {
            numbers.add(sc.nextBigInteger());
        }

        BigInteger maxValue = Collections.max(numbers);
        pw = new PrintWriter(new File("output.txt"));
        pw.println(maxValue);
        pw.close();

    }
}
