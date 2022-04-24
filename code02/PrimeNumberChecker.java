import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("素数判断する値を入力してください");
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);
        int judge = 0;
        if (num <= 1) {
            judge = 1;
        }
        for (int i = num - 1; i >= 2; i--) {
            if (num % i == 0) {
                judge = 1;
            }
        }
        if (judge == 1) {
            System.out.printf("%dは素数ではありません\n", num);
        } else if (judge == 0) {
            System.out.printf("%dは素数です\n", num);
        }
        in.close();
    }
}
