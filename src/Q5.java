import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        System.out.println("[달력 출력 프로그램]");

        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int y = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int m = sc.nextInt();

        LocalDate ld = LocalDate.of(y, m, 1);
        int a = ld.getDayOfWeek().getValue();
        int b = ld.lengthOfMonth();
        System.out.println(); //a 넣으면 2002년 2월일 때 값 5(금)
        System.out.println(); //b 넣으면 2002년 2월일 때 값 28(까지있는거)

        System.out.println("["+y+"년 "+
                String.format("%02d",m)+"월]");

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int day = 1;

        if(a==7){
            // 공백 없이
        }else if(a<7){
            for(int e=1; e<=a; e++)
            {
                System.out.print("\t");
            }
        }

        for(int t=1; t<=b; t++)
        {
            System.out.print(String.format("%02d", day)
                    + "\t");
            day++;
            a++;
            if((a%7)==0){
                System.out.println();
            }
        }

        /*switch (a){
            case 7:
                for(int t=1; t<8; t++)
                {
                    System.out.print(String.format("%02d", day)
                            + "\t");
                    day++;
                }
                System.out.println();
                for(int t=1; t<8; t++)
                {
                    System.out.print(String.format("%02d", day)
                            + "\t");
                    day++;
                }
                System.out.println();
                for(int t=1; t<8; t++)
                {
                    System.out.print(String.format("%02d", day)
                            + "\t");
                    day++;
                }
                System.out.println();
                for(int t=1; t<8; t++)
                {
                    System.out.print(String.format("%02d", day)
                            + "\t");
                    day++;
                }
                System.out.println();
        }*/
    }
}
