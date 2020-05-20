#include<iostream>
#include<cmath>
using namespace std;
int main() {
    int num, originalNum, rem, n = 0, res = 0, p;
  cin>>num; originalNum = num;
 while (originalNum != 0) {
        originalNum /= 10;
        ++n;
    }
    originalNum = num;

    while (originalNum != 0) {
        rem = originalNum % 10;

        // pow() returns a double value
        // round() return the equivalent int
        p = round(pow(rem, n));
        res += p;
        originalNum /= 10;
    }

    if (res== num)
       cout<<"Kindly proceed with encrypting";
    else
       cout<<"It is not an Armstrong number";
    return 0;
}
