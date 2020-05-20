#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;float time;
  cin>>age;
  cin>>time;
   float x=10.15,y=13.30,z=18.00,m=22.00; 
  if(age>=13){
    if(time==x)	 cout<<"$8.00";
  else if( time==y)	cout<<"$5.00";
  }
  else if(age<13 ){
    if(time==x)	cout<<"$4.00";
  else if(time==y)	cout<<"$2.00";
  }
}