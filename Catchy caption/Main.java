#include <cstring>
#include <iostream>
using namespace std;
int main()
{char s[200];int count = 0, i;
cin.getline(s,100);
   for (i = 0;s[i] != '\0';i++)

   {

       if (s[i] == ' ' && s[i+1] != ' ')

           count++;    

   }

  if((count+1)<10) 

    cout<<"Caption eligible for the contest";
  else	cout<<"Caption not eligible for the contest";
  
   
}