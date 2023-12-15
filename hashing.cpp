#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;
    int hash[26] = {0};

    for(int i=0; i<s.size(); i++){
        hash[s[i] - 'a'] += 1;
    }

    int number_of_inputs;
    cin >> number_of_inputs;

    while(number_of_inputs--) {
        char c;
        cin >> c;
        cout << c << '\t' << hash[c - 'a'] << endl;
    }
    return 0;
}
