#include<iostream>
using namespace std;
int main()
{
  int x=3,y=4;
  int p,q;
  std::cin>>p;
  std::cin>>q;
  int a=((p-x)>=0)?p-x:x-p;
  int b=((q-y)>=0)?q-y:y-q;
  (a>b)?std::cout<<a:std::cout<<b;
}