import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers to sort:");
        String input = sc.nextLine();
        if(input.isBlank()) {
            System.out.println("Input is empty.");
            return;
        }
        int[] arr = castToIntArray(input.split(" "));
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int buffer = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buffer;
    }

    private static int[] castToIntArray(String[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++) {
            try {
                result[i] = Integer.parseInt(arr[i]);
            } catch(NumberFormatException ex) {
                System.err.println("All args must be integers.");
                System.exit(1);
            }
        }
        return result;
    }
}
