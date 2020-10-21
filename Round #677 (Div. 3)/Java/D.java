import java.io.*;
import java.util.*;

public class D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int a[] = new int[N];

            for(int i=0;i <N; i++) a[i] =sc.nextInt();

            int t1 = a[0];
            int flag = 0;
            for(int i=0; i<N; i++){
                if(a[i]!=t1){
                    flag=1;
                    break;
                }
            }
            String st="";
            if(flag==0){
                System.out.println("NO");
            }
            
            else{
                int used[] = new int[N];
                //System.out.println(
                    st += "YES\n";
                    int cou=0;
                for(int i=0; i<N; i++){
                    for(int j=0; j<N; j++){

                        if(i==j || used[j] == 1) continue;
                        if(a[j]!=a[i]){
                            st+=""+(i+1)+" "+(j+1)+"\n";
                            used[j] = 1;
                            used[i] = 1;
                            cou++;
                        }
                    }
                }
                //if(cou==N-1){
                    System.out.println(st);
                // }
                // else{
                //     System.out.println("NO");
                // }
                
            }
        }
    }
}