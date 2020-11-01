import java.io.*;
import java.util.*;

public class D {

    static int modInverse(int a, int m) 
    { 
        int m0 = m; 
        int y = 0, x = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) 
        { 
            // q is quotient 
            int q = a / m; 
  
            int t = m; 
  
            // m is remainder now, process 
            // same as Euclid's algo 
            m = a % m; 
            a = t; 
            t = y; 
  
            // Update x and y 
            y = x - q * y; 
            x = t; 
        } 
  
        // Make x positive 
        if (x < 0) 
            x += m0; 
  
        return x; 
    } 

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        // int T  = Integer.parseInt(br.readLine());
        T = T*2;
        int arr[] = new int[T];

        for(int i=0; i<T; i++){
            arr[i] = sc.nextInt();
        }
        long mod= 998244353;
        long sum = 0;
        Arrays.sort(arr, 0, T);
        for(int i=0; i<T/2; i++){
            sum -= arr[i]; 
            sum = sum%mod;
        }
        for(int i=T/2; i<T; i++){
            sum += arr[i]; 
            sum = sum%mod;
        }
        long ans = 1;
        for(int i=T; i>T/2; i--){
            ans =((long)(ans%mod)*(i%mod))%mod;
        }
        for(int i=T/2; i>0; i--){
            ans =((long)(ans%mod)*modInverse(i, (int)mod))%mod;
        }
        System.out.println(((long)ans%mod*(sum%mod))%mod);
    }
}
