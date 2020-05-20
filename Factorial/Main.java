#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;cin>>n;int t=n;
  int fact=1;
  if(n==0)	cout<<"The factorial of 0 is 1";
  else{
    while(n!=0){
    fact=fact*n;
      n=n-1;
    }
    cout<<"The factorial of "<<t<<" is "<<fact;
  }
}