//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[8][7];
        numbers[2][4] = 7;
        System.out.println(Arrays.deepToString(numbers));

    }

    public static void main() {
        main(null);
        int[] numbers = {8, -2, -4, 2, 3, 6, -7};
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] < 2)
            System.out.println(numbers[k]);
        }
    }
}