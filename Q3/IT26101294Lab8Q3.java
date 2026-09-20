import java.util.Scanner;

public class IT26101294Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int count = 0;
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                array[count] = num;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        int max = array[0];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();

        System.out.println("The Maximum Number Entered: " + max);
        
        scanner.close();
    }
}