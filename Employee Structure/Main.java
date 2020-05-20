#include<iostream>
using namespace std;

  //Type your code here.
  struct Employee
              {
                     int Id;
                     char Name[25],d[20];
                     int Age;
                     long Salary;
              };
int main()
{  Employee E;             //Statement  1
                    cout << "Enter name: ";
                    cin >> E.Name;
                    cout << "\nEnter ID: ";
                    cin >> E.Id;
                 cout << "\nEnter age: ";
                    cin >> E.Age;
 cout<<"\nEnter designation: ";cin>>E.d;
                    cout << "\nEnter Salary: ";
                    cin >> E.Salary;
cout<<"\nEmployee Details";
                     cout << "\nName of the Employee : " << E.Name;
                 cout << "\nID of the Employee : " << E.Id;
                    cout << "\nAge of the Employee : " << E.Age;
 cout<<"\nDesignation of the Employee : "<<E.d;
                    cout << "\nSalary of the Employee : " << E.Salary;
}