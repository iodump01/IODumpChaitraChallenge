/*

Day 24: Write a program that takes a list of integers as input and returns a new list that contains only the elements that appear more than once in the original list.

*/

//Program
#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> findDuplicates(vector<int>& nums) {
    vector<int> result;
    unordered_map<int, int> freqMap;

    for (int num : nums) {
        freqMap[num]++;
    }

    for (auto& pair : freqMap) {
        if (pair.second > 1) {
            result.push_back(pair.first);
        }
    }

    return result;
}

int main() {
    vector<int> nums {1, 2, 3, 4, 2, 5, 6, 6, 7, 8, 8};
    vector<int> duplicates = findDuplicates(nums);

    cout << "Duplicates: ";
    for (int num : duplicates) {
        cout << num << " ";
    }

    return 0;
}




/*

Output:
Duplicates: 8 6 2


*/
