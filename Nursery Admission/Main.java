#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;cin>>str;
  int i=0,l=0;
   while(str[i]!='\0')
    {
        l++;
        i++;
   }
  cout<<"The number of letters in the name is "<<l;
}