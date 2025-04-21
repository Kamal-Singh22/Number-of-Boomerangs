import java.util.*;

public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;

        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> distanceMap = new HashMap<>();

            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;

                int dist = getDistance(points[i], points[j]);
                distanceMap.put(dist, distanceMap.getOrDefault(dist, 0) + 1);
            }

            for (int freq : distanceMap.values()) {
                count += freq * (freq - 1); // Permutations: freq P 2 = freq * (freq - 1)
            }
        }

        return count;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy; // no need to take sqrt, square is enough
    }

    // Main method to test the solution
    public static void main(String[] args) {
        NumberOfBoomerangs solution = new NumberOfBoomerangs();

        int[][] points = { {0, 0}, {1, 0}, {2, 0} };
        int result = solution.numberOfBoomerangs(points);
        System.out.println("Number of Boomerangs: " + result);  // Output: 2
    }
}
