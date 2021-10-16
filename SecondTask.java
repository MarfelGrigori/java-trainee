
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите целое число: ");
                long num = scanner.nextLong();
                StringBuilder string = new StringBuilder();
                long div = 2;
                while (div <= Math.sqrt(num)) { 
                    if (isPrime(div) && num % div == 0)  {
                        string.append(div).append(" ");
                        num = num / div;
                        div = 2;
                    } else {
                        div++;
                    }
                } string.append(num).append(" ");
                System.out.println(string);
                break;
            } catch (Exception e) {
                System.out.println("Bы ввели не целое число!");
            }
        }

    }
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int div = 2; div <= Math.sqrt(n); div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }
}
