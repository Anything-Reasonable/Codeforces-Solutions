import java.io.*;
import java.util.*;

public class E{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        long fact = 1;
        for(int i = T; i>1; i--){
            fact = fact*(long)i;
        }
        long pow = (long)Math.pow(2, (int)(T/2));
        // if(T==2){
        //     System.out.println(1);
        // }
        // else if(T==20){
        //     System.out.println("12164510040883200");
        // }
        // else{
        //     long ans = fact/pow;
        //     ans /= 2;
        //     System.out.println(ans);
        // }
        System.out.println(fact/(2*(T/2)*(T/2)));
    }
}