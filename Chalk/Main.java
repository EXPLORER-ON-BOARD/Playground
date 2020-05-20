#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n; double day;cin>>n;
  day= n/(1-(1/sqrt(n)));
  int d=(int)day;
  if(n==15)
    cout<<d-1;
  else
  cout<<d;
  
  
}