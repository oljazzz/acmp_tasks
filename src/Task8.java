import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) throws IOException {
        new Task8().run();
    }


    private void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        if ((firstNumber * secondNumber) == thirdNumber) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.close();

    }
}
