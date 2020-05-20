#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;cin>>n;
  int sum = 0; 
	for (int temp = n; temp > 0; temp /= 10) 
		sum += (temp % 10); 


	if (n % sum == 0) cout << "Harshad Number" ;
	else cout<<"Not Harshad Number";
	return 0; 


}