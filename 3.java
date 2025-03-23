import java.util.Arrays;

public class rotate {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;

        positions = positions % n;
        if (positions == 0) return array;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + positions) % n] = array[i];
        }
        return rotated;
    }
        public static void main(String[] args) {
            int[] test1 = {1, 2, 3, 4, 5};
            int[] test2 = {1, 2, 3};

                System.out.println(Arrays.toString(rotateArray(test1, 2)));
                System.out.println(Arrays.toString(rotateArray(test2, 3)));
    }
}
