#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
  //Type your code here.
  void strrev(char *str)

{

 int i=0,j=0;

 while(str[j+1]) j++;

 while(i < j)

 {

   char temp=str[i];

   str[i]=str[j];

   str[j]=temp;

   i++;

   j--;

 }

}

int main()

{

 char str1[50],str2[50];

 cin>>str1>>str2;
 strrev(str1);

 if(strcmp(str2,str1)==0)

   cout<<"It is correct";

 else

   cout<<"It is wrong";

   return 0;

}