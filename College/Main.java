#include<iostream>
using namespace std;
  //Type your code here.
  struct College
{
char name[100];
char city[100];
int year;
float p;
};
int main()
{  
int n,i,j;

cout<<"Enter the number of colleges ";cin>>n;
College stud[n];
j=1;
for(i=0;i<n;i++)
{    
cout<<"\nEnter the details of college "<<j;
cout<<"\nEnter name ";cin>>stud[i].name;
cout<<"\nEnter city ";cin>>stud[i].city;
cout<<"\nEnter year of establishment";cin>>stud[i].year;
cout<<"\nEnter pass percentage";cin>>stud[i].p;
j++;  
}
j=1;
cout<<"\nDetails of colleges";
for(i=0;i<n;i++)
{    
cout<<"\nCollege:"<<j;
cout<<"\nName:"<<stud[i].name;
cout<<"\nCity:"<<stud[i].city;
cout<<"\nYear of establishment:"<<stud[i].year;
cout<<"\nPass percentage:" <<stud[i].p;
j++;
}
return 0; 
}