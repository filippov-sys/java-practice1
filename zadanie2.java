import java.util.Arrays;

public class zadanie2 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 3, 6, 9, 3, 44, 6, 10, 19};
        System.out.println(Arrays.toString(numbers));
        int sumchet = 0;
        int nechetcount = 0;

        for (int i= 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumchet += numbers[i];
            } else {
                nechetcount++;
            }
        }

        System.out.println("сумма всех четных: " + sumchet);
        System.out.println("количество всех нечетных: " + nechetcount);
    }
}
