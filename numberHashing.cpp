#include <bits/stdc++.h>;
using namespace std;

// maps are ordered 
// insertion and fetch time complexity for maps are O(log(n)) for all best, worst and average cases

// unordered maps are not ordered

int main() {
    int array_size;
    cout<< "please specify array size" << endl;
    cin >> array_size;

    cout << "please enter array elements" << endl;
    int array[array_size];
    for (int i=0; i<array_size; i++){
        cin >> array[i];
    }

    // pre-computing function
    map<int, int> hash;
    for(int i=0; i<array_size; i++){
        hash[array[i]]++;
    }
    int tests;
    cout << "enter no of tests" << endl;
    cin >> tests;

    while(tests--){
        int testElement;
        cin >> testElement;

        cout << testElement << '\t' << hash[testElement] << endl;
    }
    return 0;
}
