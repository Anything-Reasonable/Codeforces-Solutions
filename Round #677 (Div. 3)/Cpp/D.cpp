#include<bits/stdc++.h>
#include<vector>
#define intt long long
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;
int main()
{
    fast;
	int T;
	cin >> T;
	while (T--){
		int N;
		cin >> N;
		int arr[N];
		for (int i=0; i<N; i++) cin >> arr[i];
		vector<pair<int, int>> ans;
		int pos = -1;
		for (int i = 1; i < N; i++){
			if (arr[i] != arr[0]){
				pos = i;
				ans.push_back({1, i + 1});
			}
		}
		if (pos == -1){
			cout << "NO" << "\n";
			continue;
		}
		for (int i = 1; i < N; i++){
			if (arr[i] == arr[0]){
				ans.push_back({pos + 1, i + 1});
			}
		}
		cout << "YES" << "\n";

		for (auto [A, B] : ans) cout<<A<<" "<<B<<"\n";
	}
	
	return 0;
}