#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;float t;cin>>n>>t;
  if(n==2)	cout<<(t+(t*50/100));
  else if(n==3)	cout<<t*2;
  else cout<<"Number of items is more";
}