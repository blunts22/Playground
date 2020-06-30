#include<iostream>
using namespace std;
int fib(int num)
{
  if(num==1)
    return 0;
  if(num==2)
    return 1;
  return fib(num-1)+fib(num-2);
}
int main()
{
  int num;
  cin>>num;
  cout<<"The term "<<num<<" in the fibonacci series is "<<fib(num);
}