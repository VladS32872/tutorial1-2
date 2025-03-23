import java.util.ArrayList;

public class filter {
    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {2, 3, 4, 5, 6, 7};
        int[] test3 = {7, 8, 9, 10, 11};

        System.out.println(java.util.Arrays.toString((test1)));
        System.out.println(java.util.Arrays.toString((test2)));
        System.out.println(java.util.Arrays.toString((test3)));
    }
}
