#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=1;
  int pn=n*n+1;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=2*(i-1);j++)
      cout<<"-";
    for(int k=n;k>=i;k--)
    {
      if(k==n)
        cout<<num;
      else
        cout<<"*"<<num;
      num++;
    }
    int g=pn;
    for(int p=n;p>=i;p--)
    {
      
      cout<<"*"<<g;
      g++;
    }
    pn=pn-n+i;
    cout<<"\n";
  }
}