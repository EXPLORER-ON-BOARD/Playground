#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int c= n%2==0? c=1:c=0;
  if (c==1)	cout<<"Even";
  else	cout<<"Odd";
}