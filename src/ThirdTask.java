import java.util.*;

public class ThirdTask {
    public static void main(String[] args) {
        List<Integer> merged = combine(new ArrayList<>(Arrays.asList(1, 2, 4)), new ArrayList<>(Arrays.asList(3, 4, 5)));
        System.out.println(merged);
    }

    public static List<Integer> combine(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        List<Integer> result = new ArrayList<>(list1);
        Collections.sort(result);
        return result;
    }
}
