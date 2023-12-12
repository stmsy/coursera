#include <iostream>

using namespace std;

int main() {
    int *i = new int;
    *i = 0;
    int &j = *i;
    j++;

    cout << j << endl;

    return 0;
}
