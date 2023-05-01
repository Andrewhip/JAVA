import java.io.FileWriter;
import java.io.IOException;

public class Sem2Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write("Iteration " + (i + 1) + ": ");
                for (int k : arr) {
                    writer.write(k + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
