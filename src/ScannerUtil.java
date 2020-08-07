import java.util.Scanner;

public class ScannerUtil {

    public static void skipLines(Scanner s, int lineNum) {
        for (int i = 0; i < lineNum; i++) {
            if (s.hasNextLine()) s.nextLine();
        }
    }
}
