#include <bits/stdc++.h> using namespace std;
int main()
{
    int n;
    cin >> n;
    vector<int> v(n, 0), ans(n, 0);
    // v vector for input array
    // ans vector for ans array
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
        // for every v[i] , put i  at index v[i] in ans vector
        ans[v[i]] = i;
    }
    // print ans
    for (auto x : ans)
        cout << x << " ";
    cout << "\n";
    return 0;
}


for(int i=0;i<arr.length;i++){
    answer[arr[i]]=i;
}