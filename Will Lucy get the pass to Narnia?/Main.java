#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,d;
  cout<<"Enter first number : Enter second number : Menu";
  cin>>a>>b;
  cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
cin>>d;
  if(d==1)	cout<<a+b;
  else if(d==2)	cout<<a-b;
  else if(d==3)	cout<<a*b;
  else if(d==4)	cout<<a/b;
  
  else	if(d==5)cout<<a%b;
  else cout<<"Invalid operation";
  
}