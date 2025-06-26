
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        int num = 1; 
        for (int i = 1; i <= a; i++) {
            System.out.print(num);
            if (i < a) {
                System.out.print(", ");
            }
            num += 2; 
        }

        sc.close();
    }
}


