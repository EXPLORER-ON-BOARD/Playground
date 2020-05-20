#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int ans=pow(a,b);
  if(c<=ans)
    cout<<"Doctor, you can proceed with your experiment.";
  else 
    cout<<"Sorry Doctor! You need more bacteria.";
}