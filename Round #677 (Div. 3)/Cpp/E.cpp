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

ll fact(int n)
{
    if(n==0)
        return 1;
    return n*fact(n-1);
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);

    int n; cin>>n;

    ll ans = fact(n)/pow(fact(n/2),2)*pow(fact(n/2-1),2)/2;
    cout<<ans;


    return 0;
}
