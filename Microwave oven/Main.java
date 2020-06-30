#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a;
  cin>>b;
  switch(a)
  {
    case 1:
      cout<<float(b);
      break;
    case 2:
      cout<<float(b*1.50);
      break;
    case 3:
      cout<<float(b*2.00);
      break;
    default:
      cout<<"Number of items is more";
  }
}