//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int amountOfNumber = 0;
        int sum = 0;
        double[] numbers = {8, 2, 4, 2, -3, 6, -7, 84, 99,26,17,55,90,22};
        System.out.println(Arrays.toString(numbers));
        for (double num : numbers) {
            if (num > 0) {
                flag = true;
            }
            if (num > 0 && flag) {
                amountOfNumber++;
                sum += num;
            }
        }
        System.out.println(sum + "/" + amountOfNumber);
    }
}
