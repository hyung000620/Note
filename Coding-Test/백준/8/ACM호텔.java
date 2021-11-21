//H, W, N 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();
            int tmp = N/H;
            if(N%H == 0){
                System.out.println((H*100)+tmp);
            }else{
                System.out.println(((N%H)*100)+tmp+1);
            }
        }
    }
}
