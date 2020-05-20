#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;cin>>r>>c>>t;
  if((t< (r*c)) && t%r==0)	cout<<"It is a mango tree";
  else	cout<<"It is not a mango tree";
}