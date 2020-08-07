import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) throws IOException {
        new Task4().run();
    }

    PrintWriter pw;

    Scanner sc;


    private void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int firstNumber = sc.nextInt();
        int secondNumber = 9;
        int thirdNumber = secondNumber - firstNumber;
        pw = new PrintWriter(new File("output.txt"));
        pw.println(firstNumber + "" + secondNumber + "" + thirdNumber);
        pw.close();


    }


}
