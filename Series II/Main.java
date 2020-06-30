#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=11;
  for(int i=1;i<=n;i++)
  {
    cout<<num*num<<" ";
    num=num+4;
  }
}