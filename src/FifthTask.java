import java.util.Arrays;
import java.util.List;

public class FifthTask {
    public static void main(String[] args) {

        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};


        System.out.println(calculateMaxArea(heights));

    }

    public static int calculateMaxArea(int[] arr) {
        int maxArea = 0;

        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            int area = (b - a) * Math.min(arr[a], arr[b]);
            maxArea = Math.max(maxArea, area);
            if (arr[a] < arr[b]) a++;
            else b--;
        }
        return maxArea;

    }
}
