import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourthTask {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(addOne(number)));

        int[] num2 = {9, 9, 9, 9, 9};

        System.out.println(Arrays.toString(addOne(num2)));
    }

    public static int[] addOne(int[] number) {
        String string = Arrays.stream(number).mapToObj(String::valueOf).collect(Collectors.joining());
        BigInteger bigInteger = new BigInteger(string);
        bigInteger = bigInteger.add(BigInteger.ONE);
        return bigInteger.toString().chars().map(c -> c - '0').toArray();
    }
}
