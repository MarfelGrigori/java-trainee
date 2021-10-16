import java.util.Scanner;

public class FirstTask {
public static void main  (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ввод: ");
    String string = scanner.nextLine();
    int sum = 0;
    for (char character : string.toCharArray()) {
        if(Character.isDigit(character)) {
            sum += Character.getNumericValue(character);
        }
    }
    System.out.println("сумма "+sum);

}
}
