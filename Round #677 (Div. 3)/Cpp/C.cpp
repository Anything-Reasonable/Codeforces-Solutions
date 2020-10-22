#include<bits/stdc++.h>

using namespace std;
typedef long long ll;
typedef long double ld;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;

#define pb push_back
#define deb(x) cout<<#x<<" : "<<x<<"\n";
#define debug(x,y) cout<<#x<<" : "<<x<<"\t"<<#y<<" : "<<y<<"\n";
#define sz(x) (int)x.size()
#define all(x) x.begin(),x.end()
#define setp(n) cout << fixed << setprecision(n)
#define mset(x,y) memset(x,y,sizeof(x))
#define mp(x,y) make_pair(x,y)
#define checkbit(x,i) (x&(1ll<<i))?1:0
#define setbit(x,i) x|(1ll<<i)
#define compbit(x,i) x^(1ll<<i)
#define ff first
#define ss second
#define mod 1000000007
#define N 100010


int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);

    int q; cin>>q;
    for(int w=1;w<=q;w++)
    {
        int n; cin>>n;
        int arr[n]; int max=0;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
            if(arr[i]>max)
                max=arr[i];
        }

        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max)
            {
                if(((i+1)<n && arr[i+1]<arr[i]) || ((i-1)>=0 && arr[i-1]<arr[i]))
                {
                    flag=1;
                    cout<<i+1<<endl;
                    break;
                }
            }
        }

        if(flag==0)
        {
            cout<<"-1"<<endl;
        }

/*         stack <pair<int,int>> s;
 *
 *         for(int i=0;i<n;i++)
 *         {
 *             int no = arr[i];
 *             if(s.empty())
 *             {
 *                 s.push(make_pair(no,i));
 *             }
 *
 *             else
 *             {
 *                 if(s.top().first>no)
 *                 {
 *                     pair <int,int> p = s.top();
 *                     s.pop();
 *                     p.first+=1;
 *
 *                     while(!s.empty()&& s.top().first<p.first)
 *                     {
 *                         s.pop();
 *                         p.first+=1;
 *                     }
 *
 *                     s.push(p);
 *                 }
 *                 else if(s.top().first<no)
 *                 {
 *                     s.pop();
 *                     no+=1;
 *                     while(!s.empty()&& s.top().first<no)
 *                     {
 *                         s.pop();
 *                         no+=1;
 *                     }
 *
 *                     s.push(make_pair(no,i));
 *                 }
 *                 else
 *                 {
 *                     s.push(make_pair(no,i));
 *                 }
 *             }
 *         }
 *         if(s.size()==1)
 *             cout<<s.top().second+1<<endl;
 *         else
 *             cout<<"-1"<<endl;
 */
    }



    return 0;
}
