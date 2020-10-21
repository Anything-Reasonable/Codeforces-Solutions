import java.io.*;
import java.util.*;

public class C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int max = -1;
            int pos = 0;
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<N; i++){
                if(i==0 && arr[i]>arr[i+1]){
                    max = arr[i];
                    //System.out.println("Flag");
                    pos = 1;
                }
                else if(i==N-1 && arr[i]>max && arr[i]>arr[i-1]){
                    max = arr[i];
                    pos = N;
                }
                else if(i!=0 && i!=N-1 && arr[i]>max && (arr[i-1]<arr[i] || arr[i]>arr[i+1])) {
                    max = arr[i];
                    pos = i+1;
                }
            }
            int flag = 0;
            for(int i=0; i<N; i++){
                if(arr[i]!=max) flag = 1;
            }
            if(flag == 0 || pos==0 || max==-1){
                System.out.println(-1);
            }
            else{
                System.out.println(pos);
            }
        }
    }
}