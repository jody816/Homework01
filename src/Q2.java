import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        // 입력한 금액의 10퍼가 300원 이상이면 300포인트
        // 200원 이상 300원 미만이면 200포인트
        // 100원 이상 200원 미만이면 100포인트

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(n/10 >= 300){
            System.out.println("결제 금액은"+n+"원이고, 캐시백은" +
                    "300원 입니다.");
        } else if (n/10 >= 200 && n/10 < 300) {
            System.out.println("결제 금액은"+n+"원이고, 캐시백은" +
                    "200원 입니다.");
        } else if (n/10 >= 100 && n/10 <200) {
            System.out.println("결제 금액은"+n+"원이고, 캐시백은" +
                    "100원 입니다.");
        }else {
            System.out.println("결제 금액은"+n+"원이고, 캐시백은" +
                    "0원 입니다.");
        }
    }
}
