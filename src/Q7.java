import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        // 로또 구매 수량입력
        // 입력한 만큼 로또 만드세요
        // 로또 당첨번호 만드세요
        // 당첨 번호를 구매와 비교하여 번호가 일치하는지 확인

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int l = sc.nextInt();

        int minN = 1;
        int maxN = 45;

        // 로또 개수
        int[][] m = new int[l][6];
        char[] e = new char[l];

        char g = 'A';

        for(int b=0; b<l; b++)
        {
            e[b] = g;
            g++;
            System.out.print(e[b]+"\t");
            for(int t=0; t<6; t++)
            {
                m[b][t] = random.nextInt((maxN - minN)+1)+minN;
                for(int y=1; y<t; y++)
                {
                    if(m[b][t] == m[b][y])
                    {
                        t--;
                    }
                }
                System.out.print(String.format("%02d", m[b][t])+",");
            }
            System.out.println();
        }
        // 위에 결과를 출력 따로 할 수도 있겠다

        System.out.println();

        // 로또 발표
        int[] w = new int[6];

        for(int i=0; i<w.length; i++)
        {
            w[i] = random.nextInt((maxN - minN)+1)+minN;

            for(int h=1; h<i; h++)
            {
                if(w[i] == w[h]){
                    i--;
                }
            }
        }
        Arrays.sort(w);

        System.out.println("[로또 발표]");
        System.out.print("\t");
        for(int i=0; i<w.length-1; i++)
        {
            System.out.print(String.format("%02d",w[i])+",");
        }
        System.out.println(String.format("%02d",w[5]));
        System.out.println();

        int k = 0;

        // 내 로또 결과
        System.out.println("[내 로또 결과]");

        for(int b=0; b<l; b++)
        {
            System.out.print(e[b]+"\t");
            for(int t=0; t<6; t++)
            {
                if(m[b][t]==w[0])
                {
                    k++;
                }
                if(m[b][t]==w[1])
                {
                    k++;
                }
                if(m[b][t]==w[2])
                {
                    k++;
                }
                if(m[b][t]==w[3])
                {
                    k++;
                }
                if(m[b][t]==w[4])
                {
                    k++;
                }
                if(m[b][t]==w[5])
                {
                    k++;
                }
                System.out.print(
                        String.format("%02d", m[b][t])+",");
            }
            System.out.print(" => " + k + "개 일치");
            System.out.println();
            k = 0;
        }
    }
}
