// import java.io.*;
// import java.util.*;

// public class C {
//     static long get(long x,long p,long y)
//     {
//         long z=1;
//         while(y%p==0)
//             y/=p;
//             z*=p;
//         z/=p;
//         while(x%p==0)
//             x/=p;
//         return x*z;
//     }

//     static void solve(long x, long y)
//     {
//         if(x%y!=0)
//         {
//             //cout<<x<<endl;
//             System.out.println(x);
//             return ;
//         }
    
//         long prime[] = new long[1000000];
//         long z=y;
//         int pos = 0;
//         for(int i=2;i*i<=z;i++)
//         {
//             if(z%i==0)
//             {
//                 prime[pos] = i;
//                 pos++;
//                 while(z%i==0)
//                     z/=i;
//             } 
//         }
//         if(z>1){
//             prime[pos] = z;
//             pos++;
//         }
//         long ans=1;
//         for(int i=0; i<pos; i++)
//         {
//             ans= Math.max(ans,get(x,prime[i],y));
//         }
//         System.out.println(ans);
//     }

//     public static void main(String args[]) throws Exception{
//         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//         Scanner sc = new Scanner (System.in);
//         int T = sc.nextInt();
//         // int T  = Integer.parseInt(br.readLine());
//         while(T-->0){
//             long X = sc.nextLong();
//             long Y = sc.nextLong();
//             long N = Y;
//             // long arr[] = new long[1000000];
//             // int pos = 0;
//             // if(X%Y != 0){
//             //     System.out.println(X);
//             //     continue;
//             // }
//             // int flag = 0;
//             // for (int i=1; i<=Math.sqrt(N); i++) 
//             // { 
//             //     if (N%i==0) 
//             //     { 
//             //         if (N/i == i){
//             //         arr[pos] = i;    
//             //         pos++;
//             //     } 
       
//             //     else{
//             //         arr[pos] = i;
//             //         pos++;
//             //         arr[pos] = N/i;
//             //         pos++;
//             //     } 
//             //     } 
//             // }
//             // //if(flag == 1) continue;
//             // Arrays.sort(arr,0, pos);
//             // for(int i=0; i<pos; i++){
//             //     long te = arr[i];
//             //     long t1 = X/te;
//             //     System.out.println(te+"  "+t1);
//             //     if(X%t1==0 && t1%Y !=0){
//             //         System.out.println(t1);
//             //         flag = 1;
//             //         break;
//             //     }
//             // }
//             solve(X, Y);
//         }
//     }
// }
