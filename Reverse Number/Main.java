#include <iostream>
int main() 
{
	// Type your code here
  int n,rev=0,f;
  std::cin>>n;
  while(n!=0)
  {
    f=n%10;//rem
    rev=rev*10+f;
  	n/=10;
  }
  std::cout<<rev;
 
	return 0;
}