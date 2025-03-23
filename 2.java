import java.util.HashMap;

public class Dominant {
    public static int findDominant(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        int n = array.length;
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : array) {
            if (frequencyMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 3, 3, 2, 2};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {5, 5, 5, 1};

        System.out.println(findDominant(test1));
        System.out.println(findDominant(test2));
        System.out.println(findDominant(test3));
    }
}
