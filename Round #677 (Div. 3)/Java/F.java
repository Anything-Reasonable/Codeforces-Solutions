import java.io.*;
import java.util.*;

public class F{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int arr[][] = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long sum = 0;
        for(int i=0; i<N; i++){
            int temp[] = new int[M];
            for(int j=0; j<M; j++){
                temp[j] = arr[i][j];
            }
            Arrays.sort(temp, 0, M);
            
        }
        //int T = Integer.parseInt(br.readLine());
    }
}