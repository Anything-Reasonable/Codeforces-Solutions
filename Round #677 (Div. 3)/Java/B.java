import java.io.*;
import java.util.*;

public class B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++){
                arr[i] =sc.nextInt();
            }
            int count = 0;
            int start = 0;
            int end = N-1;
            for(int i=0; i<N; i++){
                if(arr[i] == 1) break;
                start ++;
            }
            for(int i=N-1; i>=0; i--){
                if(arr[i] == 1) break;
                end --;
            }
            for(int i=start; i<end; i++){
                if(arr[i] == 0) count++;
            }
            System.out.println(count);
        }
    }
}