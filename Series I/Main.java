#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int n;
 cin>>n;
double r=0.5;
for(int i=1;i<=n;i++)

{

if(i==1)
{
cout<<r;
continue;
}
else
{
double t=pow(3,i-2);
double x=t+r;
r=x;
cout<<" "<<x;

}

} 
}