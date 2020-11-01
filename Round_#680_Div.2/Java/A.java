import java.io.*;
import java.util.*;

public class A {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        // int T  = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int a[] = new int[N];
            int c[] = new int[N];
            int b[] = new int[N];
            for(int i=0; i<N; i++)a[i] = sc.nextInt();
            for(int i=0; i<N; i++)b[i] = sc.nextInt();
            int max = 0;
            int min = X+1;
            Arrays.sort(a, 0, N);
            Arrays.sort(b, 0, N);
            int flag = 0;
            for(int i=0; i<N; i++){
                // if(a[i]<min) min=a[i];

                // if(b[i]>max) max = b[i];
                c[i] = a[i] + b[N-i-1];
                if(c[i]>X) flag = 1;
            }
            if(flag == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
