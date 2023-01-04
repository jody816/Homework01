public class Q1 {
    public static void main(String[] args) {
        // for문, stringformat은 "%02d"를 이용
        String ggd = "[구구단 출력]";

        System.out.println(String.format("%s", ggd));

        for(int i=1; i<10; i++)
        {
            for(int j=1; j<10; j++)
            {
                System.out.print(String.format("%02d", j)
                + " x " + String.format("%02d", i) + " = "
                + String.format("%02d    ", i*j));
            }
            System.out.println();
        }
    }
}