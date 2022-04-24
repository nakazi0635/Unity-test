import java.util.Scanner;

public class AtodashiJanken {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R_num = new java.util.Random().nextInt(3);
        if (R_num == 0) {
            System.out.println("コンピューターはグーを出します");
        } else if (R_num == 1) {
            System.out.println("コンピューターはチョキを出します");
        } else {
            System.out.println("コンピューターはパーを出します");
        }
        System.out.println("何を出しますか？(0:グー,1:チョキ,2:パー）");
        String inputLine = in.nextLine();
        int M_num = Integer.parseInt(inputLine);
        if ((M_num == 0 && R_num == 1) || (M_num == 1 && R_num == 2) || (M_num == 2 && R_num == 0)) {
            System.out.println("あなたの勝ち");
        } else if ((M_num == 0 && R_num == 2) || (M_num == 1 && R_num == 0) || (M_num == 2 && R_num == 1)) {
            System.out.println("あなたの負け");
        } else if (M_num == R_num) {
            System.out.println("あいこです");
        } else {
            System.out.println("あなたの出した手が判断できません。勝負はしません。");
        }
        in.close();
    }
}
