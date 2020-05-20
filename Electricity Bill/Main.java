#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int c=a*0.50;
  if(a<=200)	cout<<"Rs."<<c;
  else if(a<=400 )	cout<<"Rs."<<a*0.65+100;
  else if(a<=600)	cout<<"Rs."<<a*0.80+200;
  else	cout<<"Rs."<<a*1.25+425;
}