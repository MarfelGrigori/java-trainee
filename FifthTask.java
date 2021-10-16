import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите только целые числа \n ввеедите объем сейфа");
        int safeVolume = scanner.nextInt();
        System.out.println("Введите количество предметов");
        int numberOfItems = scanner.nextInt();
        int[] cost = new int[numberOfItems];
        System.out.println("Вводите цены предметов:");
        for (int i = 0; i < numberOfItems; i++) {
            cost[i] = scanner.nextInt();
            }
        int[] volume = new int[numberOfItems];
        System.out.println("Вводите объем предметов");
        for (int i = 0; i < numberOfItems; i++) {
            volume[i] = scanner.nextInt();
            }
        int[] safeValue = new int[safeVolume + 1];
        for (int i = 0; i <= safeVolume; i++) {
                for (int j = 0; j < numberOfItems; j++) {
                    if (volume[j] <= i) {
                        safeValue[i] = Math.max(safeValue[i], safeValue[i - volume[j]] + cost[j]);
                    }
                }
            }
            System.out.println("цена "+safeValue[safeVolume]);
        }
}
