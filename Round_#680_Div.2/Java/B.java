import java.io.*;
import java.util.*;

public class B {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        // int T  = Integer.parseInt(br.readLine());
        while(T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int ans = Math.max(a+b,c+d);
            // if(a==b && b==c && c==d){
            //     ans = a;
            // }
            System.out.println(ans);
        }
    }
}
