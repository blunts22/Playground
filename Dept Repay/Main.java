#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  float i=float(p*r*y/100);
  std::cout<<i<<"\n";
  std::cout<<float(p)+i<<"\n";
  float dis=i*0.02;
  std::cout<<dis<<"\n";
  std::cout<<(float(p)+i-dis);
}