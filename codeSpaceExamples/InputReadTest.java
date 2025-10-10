import java.util.Scanner;

public class InputReadTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 number with a gap in between:");
        int num1, num2, num3;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        String remainder = scanner.nextLine();
        System.out.printf("First num is %d, second is %d, third is %d%n", num1, num2, num3);
        System.out.println("Remaining input is: " + remainder);
        scanner.close();

    }
}