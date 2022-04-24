import java.util.Scanner;

public class Saiten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("テストの点数を入力してください。");
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);
        in.close();
        if (num < 0 || num > 100) {
            System.out.println("入力された値は点数として正しくありません。");
            return;
        }
        if (num >= 60) {
            System.out.println("合格です。おめでとう！");
        } else if (num >= 20) {
            System.out.println("不合格です。再テストを行いましょう！");
        } else {
            System.out.println("不合格です。来年もう一年頑張りましょう。");
        }
    }
}
