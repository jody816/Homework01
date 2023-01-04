import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        System.out.println("[주민등록번호 계산]");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String y = sc.next();

        System.out.print("출생월을 입력해 주세요.(mm):");
        String m = sc.next();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String d = sc.next();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String s = sc.next();

        String front = y + m + d;

        if(s.equals("m")){
            System.out.println(front + "-3"
            + rd.nextInt(1000000));
        }else {
            System.out.println(front + "-4"
            + rd.nextInt(1000000));}
    }
}
