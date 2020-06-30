#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int min;
  if(a<b)
    min=a;
  else
    min=b;
  if(min%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}