import java.io.*;
import java.util.*;

public class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int last = N%10;
            int Num = 0;
            while(N>0){
                Num++;
                N/=10;
            }
            int ans = (last-1)*10;
            while(Num>0){
                ans += Num;
                Num--;
            }
            System.out.println(ans);
        }

    }
}