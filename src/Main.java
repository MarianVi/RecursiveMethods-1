import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int num = scanner.nextInt();
        System.out.println(factorialR(num));
    }
    public static int factorialR(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialR(value - 1);
    }
}
