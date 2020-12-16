import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] a = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
        int res = firstDuplicate(a);
        System.out.println("res = " + a[res]);
    }

    public static int firstDuplicate(int[] a) {
        int minimumIndex = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return i;
            } else {
                set.add(a[i]);
            }
        }
        return minimumIndex;
    }
}
