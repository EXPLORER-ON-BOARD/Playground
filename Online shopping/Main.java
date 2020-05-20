#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fp,fd,fs,sp,sd,ss,ap,ad,as;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  int ft=fp-(fp*fd/100)+fs;
    int st=sp-(sp*sd/100)+ss;
    int at=ap-(ap*ad/100)+as;
 
  
  cout<<"In Flipkart Rs."<<ft;
  cout<<"\nIn Snapdeal Rs."<<st;
  cout<<"\nIn Amazon Rs."<<at;

   if(ft<=st)	{
    if(ft<at)	cout<<"\nHe will prefer Flipkart";
  else if(at<st)	cout<<"\nHe will prefer Amazon";
    
  }
  else	cout<<"\nHe will prefer Snapdeal";
  
}