#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=6;
  for(int i=1;i<=n;i++)
  {
    cout<<num<<" ";
    num=num+5*i;
  }
}