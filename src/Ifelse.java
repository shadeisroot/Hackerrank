import java.util.Scanner;

public class Ifelse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int num = N % 2;
        if (num != 0){
            System.out.print("Weird");
        } else if (num == 0 && N > 2 && N < 5 ) {
            System.out.print("Not Weird");
        } else if (num == 0 && N > 6 && N <= 20) {
            System.out.print("Weird");
        } else if (num == 0 && N > 20) {
            System.out.print("Not Weird");
        } else if (num == 0) {
            System.out.println("Not Weird");

        }
        scanner.close();
    }
}
