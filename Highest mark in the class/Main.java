#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int p[10];
  int max=0;
  for(int i=0;i<n;i++)
  {cin>>p[i];}
  for(int i =0;i<n;i++)
  {
  if(p[i]>=max)
    max=p[i];
  }
  cout<<max;
}