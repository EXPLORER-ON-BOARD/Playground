#include<iostream>
int main(){
  int a,fact=1;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
  // Type your code here
}