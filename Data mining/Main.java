#include<iostream>
using namespace std;
int main()
{
int n,n1,sum=0,sum1=0;
cin>>n;
while(n>0)
{
n1=n%10;//4-3-2
if (n1%2==0)//1
{
sum=sum+n1;//4+2
}
else
{
sum1=sum1+n1;//3
}
n=n/10;//23-2

}
if(sum==sum1)
{
cout<<"Yes";
}
else	cout<<"No";

return 0;
}