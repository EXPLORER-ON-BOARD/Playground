/*#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max,a,b,c;
  cin>>max>>a>>b>>c;
  if(a>=max)	cout<<"The number of turns is 1";
  else if((a+b+c)>=max)	cout<<"The number of turns is 3";
  else	cout<<"The number of turns is 4";
}*/
#include<iostream>

using namespace std;

int main()

{

 int n,n1,s,t=1;

 cin>>n>>n1;

 s=n1;

 while(s<n)

 {

   cin>>n1;

   s+=n1;

   t++;

 }

 cout<<"The number of turns is "<<t;

}

