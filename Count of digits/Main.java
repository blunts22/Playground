#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int sum=0;
  if(n==0)
    ++sum;
  while(n>0)
  {
    n=n/10;
    ++sum;
  }
  std::cout<<sum;
}