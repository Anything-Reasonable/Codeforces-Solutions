#include <bits/stdc++.h>
using namespace std;
#define endl "\n"
#define int long long
#define ar array<int,2>
#define inf 1000000000000000000 
#define deb(x) cerr << "\n" << (#x) << " is " << (x) << endl
int mod=1e9+7;
int min(int a,int b){return (a<b)?a:b;}
int max(int a,int b){return (a>b)?a:b;}
int fp(int a,int b){if(b==0) return 1;int x=fp(a,b/2);x=(x*x)%mod;if(b&1) x=(x*a)%mod;return x;}
auto random_add = [] { char *p = new char; delete p; return uint64_t(p); };
const uint64_t SEED = chrono::steady_clock::now().time_since_epoch().count() * (random_add() | 1);
mt19937_64 rng(SEED);
 
 
const int N=2e5+5;
 
 
int get(int x,int p,int y)
{
    int z=1;
    while(y%p==0)
        y/=p,z*=p;
   // cout<<x<<" "<<p<<" "<<y<<endl;
    z/=p;
    while(x%p==0)
        x/=p;
    return x*z;
}
 
void solve()
{
    int x,y;
    cin>>x>>y;
    if(x%y!=0)
    {
        cout<<x<<endl;
        return ;
    }
 
    vector<int> prime;
    int z=y;
    for(int i=2;i*i<=z;i++)
    {
        if(z%i==0)
        {
            prime.push_back(i);
            while(z%i==0)
                z/=i;
        } 
    }
    if(z>1)
        prime.push_back(z);
    int ans=1;
    for(auto i:prime)
    {
        ans=max(ans,get(x,i,y));
    }
    cout<<ans<<endl;
}
 
signed main() {
 ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL); 
 srand(time(0));
 int t=1;
 cin>>t;
 for(int i=1;i<=t;i++)
 {
   solve();
 }
}