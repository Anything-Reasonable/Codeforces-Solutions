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
        int x; cin>>x;
        int dig = x%10;
        ll  sum = (dig-1)*10;
        int count=0;
        while(x!=0)
        {
            count++;
            x/=10;
        }
        if(count==1)
            sum+=1;
        else if(count==2)
        {
            sum+=3;
        }
        else if(count==3)
        {
            sum+=6;
        }
        else
        {
            sum+=10;
        }
        cout<<sum<<endl;

    }


    return 0;
}
