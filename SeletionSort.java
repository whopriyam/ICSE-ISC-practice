import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {

        int[] array = {10, 8, 99, 7, 1, 5, 88, 9};

        selection_sort(array);

        System.out.println(Arrays.toString(array));

    }

    private static void selection_sort(int[] input) {

        int inputLength = input.length;

        for (int i = 0; i < inputLength - 1; i++) {

            int min = i;

            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            // swaps the smallest value with the position 'i'
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;

            //next pls
        }

    }

}
