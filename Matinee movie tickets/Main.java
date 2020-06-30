#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  int age;
  int time;
  cin>>age;
  cin>>(time);
  switch(time)
  {
    case 10:
      if(age>13)
        cout<<"$"<<fixed<<setprecision(2)<<8.00;
      else
        cout<<"$"<<fixed<<setprecision(2)<<4.00;
      break;
    default:
      if(age>13)
        cout<<"$"<<fixed<<setprecision(2)<<5.00;
      else
        cout<<"$"<<fixed<<setprecision(2)<<2.00;
      break;
        
  }
}