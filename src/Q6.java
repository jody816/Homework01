import java.util.Random;

public class Q6 {
    public static void main(String[] args){
        System.out.println("[투표]");

        Random random = new Random();

        int sum = 0; // 투표 수

        String[] p = new String[4]; // 후보
        p[0] = "이재명";
        p[1] = "윤석열";
        p[2] = "심상정";
        p[3] = "안철수";

        int[] g = new int[4]; // 후보가 얻는 투표 수
        g[0] = 0;
        g[1] = 0;
        g[2] = 0;
        g[3] = 0;

        int v = 0; // 투표 번호

        while (true){
            if(sum==100){ // 투표 수가 100이 되면 반복문 끝
                break;
            }

            v = random.nextInt(4)+1; // 1~4사이의 값

            System.out.println();

            switch (v){
                case 1:
                    sum++;
                    g[0]++;
                    System.out.print("[투표진행율]: "
                            + String.format("%.2f%%", sum/100.0*100.0)
                            + ", "); // 투표 진행율
                    System.out.println(sum+"명 투표 => " + p[0]);
                    for(int i=0; i<4; i++)
                    {
                        System.out.println("[기호:"+(i+1)
                                + "] "+p[i]+": "
                                + String.format("%05.2f%%", g[i] / 100.0 * 100.0)
                                + ", (투표수: " + g[i] + ")");
                    }
                    v = random.nextInt(4)+1; // 1~4사이의 값
                    break;

                case 2:
                    sum++;
                    g[1]++;
                    System.out.print("[투표진행율]: "
                            + String.format("%.2f%%", sum/100.0*100.0)
                            + ", "); // 투표 진행율

                    System.out.println(sum+"명 투표 => " + p[1]);
                    for(int i=0; i<4; i++)
                    {
                        System.out.println("[기호:"+(i+1)
                                + "] "+p[i]+": "
                                + String.format("%05.2f%%", g[i] / 100.0 * 100.0)
                                + ", (투표수: " + g[i] + ")");
                    }
                    v = random.nextInt(4)+1; // 1~4사이의 값
                    break;

                case 3:
                    sum++;
                    g[2]++;
                    System.out.print("[투표진행율]: "
                            + String.format("%.2f%%", sum/100.0*100.0)
                            + ", "); // 투표 진행율

                    System.out.println(sum+"명 투표 => " + p[2]);
                    for(int i=0; i<4; i++)
                    {
                        System.out.println("[기호:"+(i+1)
                                + "] "+p[i]+": "
                                + String.format("%05.2f%%", g[i] / 100.0 * 100.0)
                                + ", (투표수: " + g[i] + ")");
                    }
                    v = random.nextInt(4)+1; // 1~4사이의 값
                    break;

                case 4:
                    sum++;
                    g[3]++;
                    System.out.print("[투표진행율]: "
                            + String.format("%.2f%%", sum/100.0*100.0)
                            + ", "); // 투표 진행율

                    System.out.println(sum+"명 투표 => " + p[3]);
                    for(int i=0; i<4; i++)
                    {
                        System.out.println("[기호:"+(i+1)
                                + "] "+p[i]+": "
                                + String.format("%05.2f%%", g[i] / 100.0 * 100.0)
                                + ", (투표수: " + g[i] + ")");
                    }
                    v = random.nextInt(4)+1; // 1~4사이의 값
                    break;
            }
        }

        int max = g[0];

        for(int i=1; i<g.length; i++)
        {
            if(g[i]>max){
                max = g[i];
            }
        }

        if(max == g[0]){
            System.out.println("[투표결과] 당선인: "
                    + p[0]);
        } else if (max == g[1]) {
            System.out.println("[투표결과] 당선인: "
                    + p[1]);
        } else if (max == g[2]) {
            System.out.println("[투표결과] 당선인: "
                    + p[2]);
        } else if (max == g[3]) {
            System.out.println("[투표결과] 당선인: "
                    + p[3]);
        }
    }
}
