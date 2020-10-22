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
        stack <int> s;
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            int no; cin>>no;
            if(no==0)
                s.push(no);
            else
            {
                stack <int> s2; int flag=0,count=0;
                while(!s.empty())
                {
                    if(s.top()==1)
                    {
                        flag=1;
                        break;
                    }
                    count++;
                    s2.push(s.top());
                    s.pop();
                }

                if(flag!=0)
                    sum+=count;

                while(!s2.empty())
                {
                    s.push(s2.top());
                    s2.pop();
                }
                s.push(no);
            }
        }
        cout<<sum<<endl;
    }



    return 0;
}
