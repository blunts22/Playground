#include<iostream>
using namespace std;
int root(int num)
{
  if(num<=10)
    return num;
  num=num%10+(num/10);
  root(num);
}
int main()
{
  int num;
  cin>>num;
  cout<<root(num);
}