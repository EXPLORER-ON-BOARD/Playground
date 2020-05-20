#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,odd=0,even=0,a[15];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];}
   for(int i=0;i<n;i++)
  {if(a[i]%2==0)
    even++;
    else	odd++;
  }
  cout<<odd<<"\n"<<even;
  return 0;
}