#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  cin>>b;
  if(a>b)
    b=b+100;
  cout<<b-a;
}