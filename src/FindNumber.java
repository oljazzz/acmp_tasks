public class FindNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 7, 9, 0};
        int[] numbers1 = {1, 2, 3, 1, 4, 0};

        int res = findNumberOfNumberThatGreaterThanPrevious(numbers1);
    }


    private static int findNumberOfNumberThatGreaterThanPrevious(int[] numbers) {
        int numbersCount = 0;
        int numbersSize = numbers.length;
        for (int i = numbersSize - 1; i > 0; i--) {
            int currentNumber = numbers[i];
            int previousNumber = numbers[i - 1];
            if (currentNumber > previousNumber) {
                numbersCount++;
            }
        }
        return numbersCount;
    }

}
