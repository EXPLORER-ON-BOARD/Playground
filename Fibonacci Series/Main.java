#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;cin>>n;int t=n;
  int n1=0,n2=1,n3;
  while(n>2){
  n3=n1+n2;
   n1=n2;
    n2=n3;
   n--;
  }
  cout<<"The term "<<t<<" in the fibonacci series is "<<n3;
  
  
}