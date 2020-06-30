#include<iostream>
using namespace std;
int main()
{
  int r,c,num;
  cin>>r>>c>>num;
  if(num<=c)
    cout<<"Yes";
  else if(num%c==1)
    cout<<"Yes";
  else if(num%c==0)
    cout<<"Yes";
  else
    cout<<"No";
}